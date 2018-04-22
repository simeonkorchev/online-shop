package com.example.boyanyosifov.myapplication;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.boyanyosifov.myapplication.com.online.shop.business.logic.ManagerFactory;
import com.example.boyanyosifov.myapplication.com.online.shop.repository.DataManager;
import com.example.boyanyosifov.myapplication.com.online.shop.repository.Laptop;
import com.example.boyanyosifov.myapplication.com.online.shop.repository.Phone;
import com.example.boyanyosifov.myapplication.com.online.shop.repository.PhoneContentProvider;
import com.example.boyanyosifov.myapplication.com.online.shop.repository.Product;
import com.example.boyanyosifov.myapplication.databinding.ActivityStoreBinding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreActivity extends AppCompatActivity{

    //ActivityStoreBinding storeBinding;
    ListView listView;

    ArrayAdapter<Product> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        //adapter = new ArrayAdapter<Phone>(this, R.layout)

    }

    public void navigateToProductAct(){
        Intent intent = new Intent(getApplicationContext(), ProductActivity.class);
        //intent.putExtra("product_data", laptop);
        //intent.putExtra("product_type", laptop);
        startActivity(intent);
    }

    private class ProductAdapter extends ArrayAdapter<Product>{
        public ProductAdapter(@NonNull Context context, int resource, int textViewResourceId) {
            super(context, resource, textViewResourceId);
        }
    }


}

