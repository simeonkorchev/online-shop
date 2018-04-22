package com.example.boyanyosifov.myapplication.com.online.shop.repository;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.boyanyosifov.myapplication.R;

public class User extends BaseObservable{
    private int id;
    private String username;
    private String password;
    private String address;

    public User(){

    }

    public User(int id, String username, String password, String address) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    @Bindable
    public void setUsername(String username) {
        this.username = username;
        notifyPropertyChanged(R.id.editText_username);
    }

    public String getPassword() {
        return password;
    }

    @Bindable
    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(R.id.editText_password);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
