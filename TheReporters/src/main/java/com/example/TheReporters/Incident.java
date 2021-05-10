package com.example.TheReporters;

public class Incident {
    String summery;
    String description;
    String product;
    String storeID;
    String name;
    String phoneNumber;
    Integer id;

    public Incident() {
    }

    public Incident(String summery, String description, String product, String storeID, String name, String phoneNumber) {
        this.summery = summery;
        this.description = description;
        this.product = product;
        this.storeID = storeID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public boolean isNew(){

        return this.id == null;
    }

    public String getSummery() {
        return summery;
    }

    public void setSummery(String summery) {
        this.summery = summery;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
