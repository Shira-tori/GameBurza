/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gameburza;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sean
 */
public class GameBurza {
    public static List<ProductModel> cart = new ArrayList<>();
    public static List<VideoGameModel> games = new ArrayList<>();
    public static List<CreditsModel> credits = new ArrayList<>();
    public static List<MerchItem> merch = new ArrayList<>();
    public static LoginScreen loginScreen = new LoginScreen();
    public static RegisterScreen registerScreen = new RegisterScreen();
    public static MainScreen mainScreen = new MainScreen();
    public static CartUI cartUI = new CartUI();
    public static GenerateReceipt receipt = new GenerateReceipt();
    
    private static void initializeVideoGames(){
        games.add(new VideoGameModel("Grand Theft Auto V", 2013, "An open-world action-adventure game with heist missions.", "PS5, Xbox, Steam", "Action", (float) 1679.44, "/images/GTAVlogo (2)_1.png"));
        games.add(new VideoGameModel("DOOM Eternal", 2020, "A fast-paced first-person shooter battling demonic forces.", "PS5, Xbox, Steam", "Action", (float) 2239.44, "/images/doometernal.png"));
        games.add(new VideoGameModel("The Legend of Zelda: Breath of the Wild", 2017, "An open-world action-adventure game in a vast, post-apocalyptic Hyrule.", "Nintendo eShop", "Adventure", (float) 3359.44, "/images/zelda.jpg"));
        games.add(new VideoGameModel("Life is Strange", 2015, "A graphic adventure game that follows a young girl with time-manipulation powers.", "Steam", "Adventure", (float) 1119.44, "/images/life is strange.png"));
        games.add(new VideoGameModel("The Witcher 3: Wild Hunt", 2015, "An open-world RPG where Geralt of Rivia battles monsters and searches for his adopted daughter.", "Steam", "RPG", (float) 2239.44, "/images/witcher.jpg"));
        games.add(new VideoGameModel("Cyberpunk 2077", 2020, "An open-world RPG set in a dystopian future, featuring advanced technology and cybernetics.", "Steam", "RPG", (float) 3359.44, "/images/cyberpunk2077.png"));
        games.add(new VideoGameModel("The Sims 4", 2014, "A life simulation game where players create and control people in a virtual world.", "PS4, Xbox, Steam, Origin", "Simulation", (float) 1679.44, "/images/thesims4.png"));
        games.add(new VideoGameModel("Animal Crossing: New Horizons", 2020, "A social simulation game where players develop a deserted island and interact with animal villagers.", "Nintendo eShop", "Simulation", (float) 2759.44, "/images/animalcrossing.png"));
        games.add(new VideoGameModel("Civilization VI", 2016, "A turn-based strategy game where players build and manage an empire through the ages.", "Steam", "Strategy", (float) 1679.44, "/images/civilationvi.png"));
        games.add(new VideoGameModel("XCOM 2", 2016, "A turn-based tactics game where players lead resistance forces against an alien occupation.", "Steam", "Strategy", (float) 2239.44, "/images/xcom2.png"));
        games.add(new VideoGameModel("FIFA 24", 2023, "A football simulation game featuring real teams and leagues.", "Origin", "Sports", (float) 3359.44, "/images/fifa.jpeg"));
        games.add(new VideoGameModel("NBA 2K24", 2023, "A basketball simulation game featuring NBA teams and players.", "Steam", "Sports", (float) 3359.44, "/images/2k24.jpg"));
        games.add(new VideoGameModel("Tetris Effect", 2018, "A puzzle game that combines classic Tetris gameplay with music and visual effects.", "Steam", "Puzzle", (float) 1119.44, "/images/tetriseffect.jpg"));
        games.add(new VideoGameModel("Portal 2", 2011, "A first-person puzzle-platform game where players solve puzzles using a portal gun.", "Steam", "Puzzle", (float) 559.44, "/images/portal2.jpg"));
        games.add(new VideoGameModel("Resident Evil Village", 2021, "A survival horror game where players battle through a village terrorized by monsters.", "Steam", "Horror", (float) 3359.44, "/images/residentevilvillage.png"));
        games.add(new VideoGameModel("Dead Space (Remake)", 2023, "A sci-fi survival horror game where players fight necromorphs aboard a stranded spaceship.", "Steam", "Horror", (float) 3879.44, "/images/deadspace.jpeg"));

    }
    
    private static void initializeCredits() {
    
        GameBurza.credits.add(new CreditsModel("PlayStation Network (PSN) Wallet Top-up" , 2020, "Top up your PSN wallet to purchase games, DLCs, and subscriptions.", "PSN", (float) 500.00, "/images/psgc.jpg"));
        GameBurza.credits.add(new CreditsModel("Steam Wallet Gift Card (Digital Code)" , 2019, "Redeemable Steam Wallet funds for games, DLCs, and in-game purchases.", "Steam", (float) 550.00, "/images/steamgc.jpg" ));
        GameBurza.credits.add(new CreditsModel("Garena Shells Scratch Card" , 2018, "Prepaid scratch cards for Garena games like League of Legends and Call of Duty.", "Garena", (float) 450.00, "/images/garenagc.jpg" ));
        GameBurza.credits.add(new CreditsModel("Google Play Gift Card (Physical)", 2021, "Purchase apps, games, movies, and more from the Google Play Store.", "Google Play", (float) 600.00, "/images/googleplaygc.jpg" ));
    }
    private static void initializeMerchandise() {
        GameBurza.merch.add(new MerchItem("Overwatch D.Va Hoodie", "A cozy hoodie featuring D.Va from Overwatch. Available in sizes S, M, L, XL.", (float) 999.00f, "/images/overwatchhoodie.png"));
        GameBurza.merch.add(new MerchItem("Assassin’s Creed Hidden Blade Replica Jacket", "A jacket inspired by the iconic Hidden Blade from Assassin's Creed. Available in sizes S, M, L, XL.", (float) 999.00, "/images/assassinscreedjacket.png"));
        GameBurza.merch.add(new MerchItem("Resident Evil Umbrella Corporation Logo Keychain", "A metal keychain featuring the Umbrella Corporation logo from Resident Evil. Size: 5cm diameter.", (float) 250.00, "/images/residentevilkeychain.png"));
        GameBurza.merch.add(new MerchItem("Fallout Nuka-Cola Bottle Opener", "A metal bottle opener shaped like the iconic Nuka-Cola bottle from Fallout. Size: 10cm length.", (float) 75.00, "/images/falloutnukacola.jpg"));
    }

    
    
    public static void main(String[] args) {
        initializeVideoGames();
        initializeCredits();
        initializeMerchandise();
        loginScreen.setVisible(true);
    }
} //bisaya aqS
