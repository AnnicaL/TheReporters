package com.example.TheReporters;

public class Incident {
    String summery;
    String description;
    String product;
    String storeID;
    String name;
    String phoneNumber;
    int id;

    public Incident(String summery, String description, String product, String storeID, String name, String phoneNumber) {
        this.summery = summery;
        this.description = description;
        this.product = product;
        this.storeID = storeID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
