package com.example.boyanyosifov.myapplication;

import android.app.Application;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.boyanyosifov.myapplication.com.online.shop.business.logic.ManagerFactory;
import com.example.boyanyosifov.myapplication.com.online.shop.repository.Database;
import com.example.boyanyosifov.myapplication.com.online.shop.repository.User;
import com.example.boyanyosifov.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;
    User user;
    ManagerFactory managerFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User();
        mainBinding.setUser(user);



        mainBinding.setMainEvent(new IMainEvent() {
            @Override
            public void onClickLogin() {
                //validation, login and navigate to store activity
                if (Validator.validateLogin(user.getUsername(), user.getPassword())){
                    //ManagerFactory.getUsersManager().login(user.getUsername(), user.getPassword());
                    navigateToStoreAct();
                }



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
        Intent intent = new Intent(getApplicationContext(), StoreActivity.class);
        //intent.putExtra("user_data", user);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
    public void navigateToRegistrationAct(){
        Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

}
