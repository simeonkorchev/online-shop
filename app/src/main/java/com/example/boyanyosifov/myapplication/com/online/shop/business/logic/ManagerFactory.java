package com.example.boyanyosifov.myapplication.com.online.shop.business.logic;

import com.example.boyanyosifov.myapplication.com.online.shop.business.logic.IManagerFactory;

public final class ManagerFactory {

    public static final  IUsersManager getUsersManager() {
        return new UsersManager();
    }

    public static final IPhonesManager getPhonesManager() {
        return new PhonesManager();
    }


    public static final ILaptopManager getLaptopManager() {
        return new LaptopManager();
    }
}
