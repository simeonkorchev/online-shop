package com.example.boyanyosifov.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText editText_username, editText_password;
    Button btnRegister;
    UserDB userDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnRegister = (Button)findViewById(R.id.buttonReg);
        editText_username = (EditText)findViewById(R.id.editText_username);
        editText_password = (EditText)findViewById(R.id.editText_password);
        userDB = new UserDB(this);

        btnRegisterFunc();
    }

    public void btnRegisterFunc(){
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean res = userDB.addData(editText_username.getText().toString(), editText_password.getText().toString());

                if(res)
                    Toast.makeText(RegisterActivity.this,"Successful registration", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(RegisterActivity.this,"Failed registration", Toast.LENGTH_LONG).show();
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
