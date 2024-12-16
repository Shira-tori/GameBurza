/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gameburza;

/**
 *
 * @author DDD
 */
public class CreditsModel extends ProductModel{
    public String platforms;
    
    
    public CreditsModel(String title, int releaseDate, String description,  String platforms, float price, String iconLoc){
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.platforms = platforms;
        this.price = price;
        this.iconLoc = iconLoc;
    }
}
    