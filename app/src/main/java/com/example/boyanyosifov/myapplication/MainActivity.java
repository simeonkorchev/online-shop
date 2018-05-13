package com.example.boyanyosifov.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.example.boyanyosifov.myapplication.com.online.shop.business.logic.ManagerFactory;
import com.example.boyanyosifov.myapplication.com.online.shop.repository.User;
import com.example.boyanyosifov.myapplication.com.online.shop.utils.Constants;
import com.example.boyanyosifov.myapplication.com.online.shop.utils.Validator;
import com.example.boyanyosifov.myapplication.databinding.ActivityMainBinding;

import java.util.Base64;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;
    User user;
    ManagerFactory managerFactory;
    EditText username_et, password_et;
    SharedPreferences sharedPreferences;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User();
        mainBinding.setUser(user);

        sharedPreferences = getSharedPreferences(Constants.SHARED_PREF, Context.MODE_PRIVATE);
        sharedPreferences.edit().clear().apply();


        mainBinding.setMainEvent(new IMainEvent() {
            @Override
            public void onClickLogin() {
                //validation, login and navigate to store activity
                if (Validator.validateLogin(mainBinding.getUser().getUsername(), mainBinding.getUser().getPassword()) &&
                        ManagerFactory.getUsersManager(MainActivity.this).
                                    login(mainBinding.getUser().getUsername(), mainBinding.getUser().getPassword()) != null){

                    navigateToStoreAct();
                }
                else
                    Toast.makeText(MainActivity.this, "User not found", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onClickRegister() {
                //Navigate to register
                navigateToRegistrationAct();
            }
        });
    }



    private void showMessage(String title,String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

    private boolean findUser(String username, String password){
        return false;//database.getUserDbContentProvider().

    }

    public void navigateToStoreAct(){
        Intent intent = new Intent(MainActivity.this, StoreActivity.class);
        //intent.putExtra("user_data", user);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
    public void navigateToRegistrationAct(){
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

}
