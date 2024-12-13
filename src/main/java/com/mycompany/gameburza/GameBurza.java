/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gameburza;
import java.util.LinkedList;
/**
 *
 * @author sean
 */
public class GameBurza {
    public static LoginScreen loginScreen = new LoginScreen();
    public static RegisterScreen registerScreen = new RegisterScreen();
    public static MainScreen mainScreen = new MainScreen();
    public static CartUI cartUI = new CartUI();
    
    public static void main(String[] args) {
        loginScreen.setVisible(true);
    }
}
