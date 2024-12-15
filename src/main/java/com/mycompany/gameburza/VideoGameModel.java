/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gameburza;

/**
 *
 * @author DDD
 */
public class VideoGameModel extends ProductModel{
    public String platforms;
    public String genre;
    
    public VideoGameModel(String title, int releaseDate, String description,  String platforms, String genre, float price, String iconLoc){
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.platforms = platforms;
        this.genre = genre;
        this.price = price;
        this.iconLoc = iconLoc;
    }
}
