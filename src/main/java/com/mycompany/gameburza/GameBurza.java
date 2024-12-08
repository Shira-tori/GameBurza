/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gameburza;

/**
 *
 * @author sean
 */
public class GameBurza {
    public static LoginScreen loginScreen = new LoginScreen();
    public static RegisterScreen registerScreen = new RegisterScreen();
    public static MainScreen mainScreen = new MainScreen();
    
    public static void main(String[] args) {
        LoginScreen.main(new String[]{});
    }
}
