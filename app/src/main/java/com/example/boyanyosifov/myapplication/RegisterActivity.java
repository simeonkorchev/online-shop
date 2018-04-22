package com.example.boyanyosifov.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.boyanyosifov.myapplication.com.online.shop.repository.User;
import com.example.boyanyosifov.myapplication.databinding.ActivityMainBinding;
import com.example.boyanyosifov.myapplication.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    ActivityRegisterBinding registerBinding;
    User newUser;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerBinding = DataBindingUtil.setContentView(this, R.layout.activity_register);
        editText = (EditText)findViewById(R.id.editText_email);

       registerBinding.setNewuser(newUser);

       registerBinding.setRegisterevent(new IRegisterEvent() {
           @Override
           public void onClickRegister() {
               //validation and add user to db
               if(Validation.validateRegistration(newUser.getUsername(), newUser.getPassword(), editText.getText().toString())){
                   Toast.makeText(RegisterActivity.this, "Successful registration!", Toast.LENGTH_SHORT).show();

               }
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
}
