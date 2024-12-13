/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gameburza;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author sean
 */
public class GameBurza {
    public static List<VideoGamePreviews> games = new ArrayList<>();
    public static LoginScreen loginScreen = new LoginScreen();
    public static RegisterScreen registerScreen = new RegisterScreen();
    public static MainScreen mainScreen = new MainScreen();
    public static CartUI cartUI = new CartUI();
    
    public static void main(String[] args) {
        loginScreen.setVisible(true);
    }
}
