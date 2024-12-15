/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gameburza;

import java.util.Arrays;

/**
 *
 * @author Jhan Steven Cruz
 */

public class CreditItem {
    String titleCredit;
    int[] availableDenominations;
    String platform;

    public CreditItem(String titleCredit, int[] availableDenominations, String platform) {
        this.titleCredit = titleCredit;
        this.availableDenominations = availableDenominations; // Initialize the denominations
        this.platform = platform;
    }

    public void displayPreviewDetails() {
        System.out.println("Title: " + titleCredit);
        System.out.println("Available Credit: " + Arrays.toString(availableDenominations));
        System.out.println("Platform: " + platform);
    }

    // Add getter methods for displaying item info in panels
    public String getName() {
        return titleCredit;
    }

    public String getPlatform() {
        return platform;
    }

    public String getDenominations() {
        return Arrays.toString(availableDenominations); // Return as string for easy display
    }
}

