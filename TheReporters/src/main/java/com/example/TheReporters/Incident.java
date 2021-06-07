package com.example.TheReporters;

import javax.persistence.*;

@Entity
public class Incident {
    String summary;
    String description;
    String product;
    String storeID;
    String name;
    @Column(name ="PHONENUMBER")
    String phoneNumber;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    //Testar att lägga till en ny rad

    public Incident() {
    }

    public Incident(String summary, String description, String product, String storeID, String name, String phoneNumber) {
        this.summary = summary;
        this.description = description;
        this.product = product;
        this.storeID = storeID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public boolean isNew(){

        return this.id == null;
    }

    public static String testOfReporters1() {
        return "";
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

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getSummary() { return summary; }

    public void setSummary(String summary) { this.summary = summary; }
}
