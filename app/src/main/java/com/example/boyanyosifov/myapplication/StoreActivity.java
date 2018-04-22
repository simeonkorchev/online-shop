package com.example.boyanyosifov.myapplication;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
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
import com.example.boyanyosifov.myapplication.databinding.ActivityStoreBinding;

import java.util.ArrayList;
import java.util.List;

public class StoreActivity extends AppCompatActivity{

    //ActivityStoreBinding storeBinding;
    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;
    private List<Phone> phones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);


        mainListView = (ListView)findViewById(R.id.mainListView);
        //phones = getall();

        //listAdapter = new ArrayAdapter<Phone>(this, R.layout.l)
    }

    public void navigateToProductAct(){
        Intent intent = new Intent(getApplicationContext(), ProductActivity.class);
        //intent.putExtra("product_data", laptop);
        //intent.putExtra("product_type", laptop);
        startActivity(intent);
    }


}
