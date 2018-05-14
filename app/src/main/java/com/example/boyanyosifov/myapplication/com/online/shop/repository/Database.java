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
        private static final String DATABASE_NAME = "online_shop_pmu.db";

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
                //addTestValues();
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
            testValues.add(new Laptop("Lenovo", "Lenovo T540P","" +
                    "Intel Core i7-4600M\n" +
                    "NVIDIA GeForce GT 730M\n" +
                    "256GB SSD\n" +
                    "Windows 8 Pro\n",1450.99 ));
            testValues.add(new Laptop("Acer", "Acer Aspire E5","" +
                    "Core i3-4030U\n" +
                    "4GB\n" +
                    "GeForce 840M\n" +
                    "1TB HDD\n",1450.99 ));
            laptopDbContentProvider.addEntities(testValues);
        }

        private void addPhoneEntities() {
            List<Phone> testValues = new ArrayList<>();
            testValues.add(new Phone("Apple", "Iphone 6", "Size \t4.7 inches, 60.9 cm2 (~65.6% screen-to-body ratio)\n" +
                    "Batter  \tNon-removable Li-Ion 1715 mAh battery (6.91 Wh)\n" +
                    "Primary camera 12 MP (f/2.2, 29mm, 1/3\", 1.22µm), phase detection autofocus, dual-LED dual-tone flash\n" +
                    "CPU \tDual-core 1.84 GHz Twister\n" +
                    "OS \tiOS 9, upgradable to iOS 11.3\n" +
                    "Internal Memory \t16/32/64/128 GB, 2 GB RAM", 600.0));

            testValues.add(new Phone("Samsung", "Samsung S6","Size \t5.1 inches, 71.5 cm2 (~70.7% screen-to-body ratio)\n" +
                    "Battery Non-removable Li-Ion 2550 mAh battery\n" +
                    "Primary Camera \t16 MP (f/1.9, 28mm, 1/2.6\", 1.12µm), OIS, autofocus, LED flash\n" +
                    "OS \tAndroid 5.0.2 (Lollipop), 7.0 (Nougat), planned upgrade to Android 8.0 (Oreo)\n" +
                    "CPU \tOcta-core (4x2.1 GHz Cortex-A57 & 4x1.5 GHz Cortex-A53)\n" +
                    "Internal \t32/64/128 GB, 3 GB RAM",750.99 ));
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
