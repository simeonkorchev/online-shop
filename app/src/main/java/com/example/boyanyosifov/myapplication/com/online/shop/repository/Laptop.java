package com.example.boyanyosifov.myapplication.com.online.shop.repository;

public class Laptop {
    private int id;
    private String manufacturer;
    private String model;
    private String description;
    private double price;

    public Laptop() {}
    public Laptop(int id, String manufacturer, String model, String description, double price) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.description = description;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
}
