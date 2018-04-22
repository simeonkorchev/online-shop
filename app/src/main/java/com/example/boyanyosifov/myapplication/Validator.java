package com.example.boyanyosifov.myapplication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static final Pattern EMAIL_REGEX =
            Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");

    public static boolean validateLogin(String username, String password){
        if(username.length()<= 4 || password.length()<=4)
            return false;
        else
            return true;
    }

    public static boolean validateRegistration(String username, String password, String email){
        if(username.length()<= 4 || password.length()<=4 || !validateEmail(email))
            return false;
        else
            return true;
    }

    public static boolean validateEmail(String emailStr) {
        Matcher matcher = EMAIL_REGEX.matcher(emailStr);
        return matcher.find();
    }
}
