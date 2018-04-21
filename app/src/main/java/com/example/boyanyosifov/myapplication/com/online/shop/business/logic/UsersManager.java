package com.example.boyanyosifov.myapplication.com.online.shop.business.logic;

import android.content.Context;

import com.example.boyanyosifov.myapplication.com.online.shop.repository.Database;
import com.example.boyanyosifov.myapplication.com.online.shop.repository.User;

import java.util.List;

class UsersManager implements IUsersManager {
    private Context context;

    public UsersManager(Context context) {
        this.context = context;
    }

    @Override
    public User login(String username, String password) {
        List<User> userList = new Database(context).getUserDbContentProvider().getAll();
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return  user;
            }
        }
        return null;
    }

    @Override
    public User create(String username, String password, String email) {
        return null;
    }
}
