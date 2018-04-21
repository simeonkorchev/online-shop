package com.example.boyanyosifov.myapplication;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.boyanyosifov.myapplication.com.online.shop.repository.Database;

public class MainActivity extends AppCompatActivity {

    EditText editText_Username, editText_Password;
    Button button_Login;
    Database database;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_Username = (EditText)findViewById(R.id.nameET);
        editText_Password = (EditText)findViewById(R.id.editText);
        button_Login = (Button)findViewById(R.id.btnLogin);
        database = new Database(this);
        textView = (TextView)findViewById(R.id.tvRegister);

        btnLoginFunc();
        textViewFunc();
    }

    public void btnLoginFunc(){
        button_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(findUser(editText_Username.getText().toString(), editText_Password.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_LONG).show();
                    navigateToStoreAct();
                }
                else
                    Toast.makeText(MainActivity.this, "Login Failed!", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void textViewFunc(){
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        return database.getUserDbContentProvider().

    }

    public void navigateToStoreAct(){
        Intent intent = new Intent(getApplicationContext(), StoreActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
    public void navigateToRegistrationAct(){
        Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

}
