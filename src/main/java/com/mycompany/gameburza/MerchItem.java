package com.mycompany.gameburza;

public class MerchItem extends ProductModel {
    public String title;
    public String description;
    public float price;  // Optional field for price
    public String iconLoc;

    // Constructor to initialize the attributes
    public MerchItem(String title, String description, float price, String iconLoc) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.iconLoc = iconLoc;
    }
}
