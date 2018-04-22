package com.example.boyanyosifov.myapplication;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.boyanyosifov.myapplication.com.online.shop.repository.Laptop;
import com.example.boyanyosifov.myapplication.com.online.shop.repository.Phone;
import com.example.boyanyosifov.myapplication.databinding.ActivityStoreBinding;

public class StoreActivity extends AppCompatActivity{

    ActivityStoreBinding storeBinding;
    Phone phone;
    Laptop laptop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        storeBinding = DataBindingUtil.setContentView(this, R.layout.activity_store);


    }

    public void navigateToProductAct(){
        Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
        intent.putExtra("product_data", laptop);
        intent.putExtra("product_type", laptop);
        startActivity(intent);
    }

}
