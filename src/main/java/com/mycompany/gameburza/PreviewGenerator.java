import com.mycompany.gameburza.VideoGamePreviews;
import com.mycompany.gameburza.CreditItem;
import com.mycompany.gameburza.MerchItem;
import java.util.LinkedList;

public class PreviewGenerator {
    public static LinkedList<VideoGamePreviews> videoGames = new LinkedList<>();
    public static LinkedList<CreditItem> credits = new LinkedList<>();
    public static LinkedList<MerchItem> merchandise = new LinkedList<>();

    // Method to initialize the data
    public static void initializeData() {
        initializeVideoGames();
        initializeCredits();
        initializeMerchandise();
    }

    private static void initializeVideoGames() {
        // Action Games
        videoGames.add(new VideoGamePreviews("Grand Theft Auto V", 2013, "An open-world action-adventure game with heist missions.", "PS5, Xbox, Steam"));
        videoGames.add(new VideoGamePreviews("DOOM Eternal", 2020, "A fast-paced first-person shooter battling demonic forces.", "PS5, Xbox, Steam"));

        videoGames.add(new VideoGamePreviews("The Legend of Zelda: Breath of the Wild", 2017, "An open-world action-adventure game in a vast, post-apocalyptic Hyrule.", "Nintendo eShop"));
        videoGames.add(new VideoGamePreviews("Life is Strange", 2015, "A graphic adventure game that follows a young girl with time-manipulation powers.", "Steam"));

        videoGames.add(new VideoGamePreviews("The Witcher 3: Wild Hunt", 2015, "An open-world RPG where Geralt of Rivia battles monsters and searches for his adopted daughter.", "Steam"));
        videoGames.add(new VideoGamePreviews("Cyberpunk 2077", 2020, "An open-world RPG set in a dystopian future, featuring advanced technology and cybernetics.", "Steam"));

        videoGames.add(new VideoGamePreviews("The Sims 4", 2014, "A life simulation game where players create and control people in a virtual world.", "PS4, Xbox, Steam, Origin"));
        videoGames.add(new VideoGamePreviews("Animal Crossing: New Horizons", 2020, "A social simulation game where players develop a deserted island and interact with animal villagers.", "Nintendo eShop"));

        videoGames.add(new VideoGamePreviews("Civilization VI", 2016, "A turn-based strategy game where players build and manage an empire through the ages.", "Steam"));
        videoGames.add(new VideoGamePreviews("XCOM 2", 2016, "A turn-based tactics game where players lead resistance forces against an alien occupation.", "Steam"));

        videoGames.add(new VideoGamePreviews("FIFA 24", 2023, "A football simulation game featuring real teams and leagues.", "Origin"));
        videoGames.add(new VideoGamePreviews("NBA 2K24", 2023, "A basketball simulation game featuring NBA teams and players.", "Steam"));

        videoGames.add(new VideoGamePreviews("Tetris Effect", 2018, "A puzzle game that combines classic Tetris gameplay with music and visual effects.", "Steam"));
        videoGames.add(new VideoGamePreviews("Portal 2", 2011, "A first-person puzzle-platform game where players solve puzzles using a portal gun.", "Steam"));

        videoGames.add(new VideoGamePreviews("Resident Evil Village", 2021, "A survival horror game where players battle through a village terrorized by monsters.", "Steam"));
        videoGames.add(new VideoGamePreviews("Dead Space (Remake)", 2023, "A sci-fi survival horror game where players fight necromorphs aboard a stranded spaceship.", "Steam"));
    }

    private static void initializeCredits() {
        int[]availableDenominations = {10, 25, 20};
        credits.add(new CreditItem("PlayStation Network (PSN) Wallet Top-up",  availableDenominations, "PSN"));
        credits.add(new CreditItem("Steam Wallet Gift Card (Digital Code)",  availableDenominations, "Steam"));

        credits.add(new CreditItem("Garena Shells Scratch Card", availableDenominations,"Garena"));
        credits.add(new CreditItem("Google Play Gift Card (Physical)", availableDenominations,"Google Play"));
    }

    private static void initializeMerchandise() {
        merchandise.add(new MerchItem("Overwatch D.Va Hoodie", "Sizes S, M, L, XL"));
        merchandise.add(new MerchItem("Assassin’s Creed Hidden Blade Replica Jacket", "Sizes S, M, L, XL"));
    }
}

