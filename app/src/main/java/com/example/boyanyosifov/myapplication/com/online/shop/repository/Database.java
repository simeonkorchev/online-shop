package com.example.boyanyosifov.myapplication.com.online.shop.repository;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import static com.example.boyanyosifov.myapplication.com.online.shop.repository.LaptopSchema.LAPTOP_TABLE;
import static com.example.boyanyosifov.myapplication.com.online.shop.repository.LaptopSchema.LAPTOP_TABLE_CREATE;
import static com.example.boyanyosifov.myapplication.com.online.shop.repository.OrderSchema.ORDER_TABLE;
import static com.example.boyanyosifov.myapplication.com.online.shop.repository.OrderSchema.ORDER_TABLE_CREATE;
import static com.example.boyanyosifov.myapplication.com.online.shop.repository.PhoneSchema.PHONE_TABLE;
import static com.example.boyanyosifov.myapplication.com.online.shop.repository.PhoneSchema.PHONE_TABLE_CREATE;
import static com.example.boyanyosifov.myapplication.com.online.shop.repository.UserSchema.USER_TABLE;
import static com.example.boyanyosifov.myapplication.com.online.shop.repository.UserSchema.USER_TABLE_CREATE;

public class Database {
    private DatabaseHelper databaseHelper;
    private UserContentProvider userDbContentProvider;
    private LaptopContentProvider laptopDbContentProvider;
    private PhoneContentProvider phoneDbContentProvider;
    private OrderContentProvider orderDbContentProvider;

    public Database(Context context) {
        this.databaseHelper =  new DatabaseHelper(context);
    }

    public void openConnection() {
        databaseHelper.openConnection();
    }

    public void close(){
        databaseHelper.close();
    }

    public UserContentProvider getUserDbContentProvider() {
        return userDbContentProvider;
    }

    public LaptopContentProvider getLaptopDbContentProvider() {
        return laptopDbContentProvider;
    }

    public PhoneContentProvider getPhoneDbContentProvider() {
        return phoneDbContentProvider;
    }

    public OrderContentProvider getOrderDbContentProvider() {
        return orderDbContentProvider;
    }

    private class DatabaseHelper extends SQLiteOpenHelper {

        private static final int DATABASE_VERSION = 1;
        private static final String DATABASE_NAME = "onlineshop.db";

        public DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(LAPTOP_TABLE_CREATE);
            db.execSQL(PHONE_TABLE_CREATE);
            db.execSQL(USER_TABLE_CREATE);
            db.execSQL(ORDER_TABLE_CREATE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS " + LAPTOP_TABLE);
            db.execSQL("DROP TABLE IF EXISTS " + PHONE_TABLE);
            db.execSQL("DROP TABLE IF EXISTS " + USER_TABLE);
            db.execSQL("DROP TABLE IF EXISTS " + ORDER_TABLE);
            // Create tables again
            onCreate(db);
        }

        public void openConnection() {
            SQLiteDatabase database = getWritableDatabase();
            initContentProviders(database);
        }

        private void initContentProviders(SQLiteDatabase database) {
            userDbContentProvider = new UserContentProvider(database);
            laptopDbContentProvider = new LaptopContentProvider(database);
            phoneDbContentProvider = new PhoneContentProvider(database);
            orderDbContentProvider = new OrderContentProvider(database);
        }
    }
}
