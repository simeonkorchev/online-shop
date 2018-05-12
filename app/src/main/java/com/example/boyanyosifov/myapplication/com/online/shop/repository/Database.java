package com.example.boyanyosifov.myapplication.com.online.shop.repository;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

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
    private static Database instance;

    private Database(Context context) {
        this.databaseHelper =  new DatabaseHelper(context);
        openConnection();
    }

    public static final Database getInstance(Context context) {
        if(instance == null ) {
            instance = new Database(context);
        }

        return instance;
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
        private static final String DATABASE_NAME = "onlineshop2.db";

        public DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

            db.execSQL("DROP TABLE IF EXISTS " + LAPTOP_TABLE);
            db.execSQL("DROP TABLE IF EXISTS " + PHONE_TABLE);
            db.execSQL("DROP TABLE IF EXISTS " + USER_TABLE);
            db.execSQL("DROP TABLE IF EXISTS " + ORDER_TABLE);

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
            try {
                SQLiteDatabase database = getWritableDatabase();
                initContentProviders(database);
                addTestValues();
            }
            catch (SQLiteException e){
                System.out.println(e.getMessage());
            }
        }

        private void addTestValues() {
            addLaptopEntities();
            addPhoneEntities();
        }

        private void addLaptopEntities() {
            List<Laptop> testValues = new ArrayList<>();
            testValues.add(new Laptop("Lenovo", "T540P","Simple description for lenovo",1450.99 ));
            testValues.add(new Laptop("Acer", "Aspire E5","Simple description for acer",1450.99 ));
            laptopDbContentProvider.addEntities(testValues);
        }

        private void addPhoneEntities() {
            List<Phone> testValues = new ArrayList<>();
            testValues.add(new Phone("Apple", "Iphone 6", "Simple description for Iphone", 600.0));
            testValues.add(new Phone("Samsung", "S6","Simple description for Samsung",750.99 ));
            phoneDbContentProvider.addEntities(testValues);
        }

        private void initContentProviders(SQLiteDatabase database) {
            userDbContentProvider = new UserContentProvider(database);
            laptopDbContentProvider = new LaptopContentProvider(database);
            phoneDbContentProvider = new PhoneContentProvider(database);
            orderDbContentProvider = new OrderContentProvider(database);
        }
    }
}
