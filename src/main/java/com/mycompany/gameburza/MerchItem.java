/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gameburza;

/**
 *
 * @author Jhan Steven Cruz
 */
public class MerchItem {
    String titleMerch;
    String sizes;

    public MerchItem(String titleMerch, String sizes) {
        this.titleMerch = titleMerch;
        this.sizes = sizes;
    }

    public void displayPreviewDetails() {
        System.out.println("Title: " + titleMerch);
        System.out.println("Sizes: " + sizes);
    }

    // Add getter methods for displaying item info in panels
    public String getName() {
        return titleMerch;
    }

    public String getSizes() {
        return sizes;
    }
}

