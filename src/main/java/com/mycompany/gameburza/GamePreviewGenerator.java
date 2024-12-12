import java.util.ArrayList;
import java.util.List;

public class GamePreviewGenerator {
    String title;
    int releaseDate;
    String description;
    String platforms;

    // Constructor to initialize game attributes
    public GamePreviewGenerator(String title, int releaseDate, String description, String platforms) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.description = description;
        this.platforms = platforms;
    }

    // Method to display game details
    public void displayGameDetails() {
        System.out.println("Title: " + title);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Description: " + description);
        System.out.println("Platforms: " + platforms);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a list to store all the games
        List<VideoGamePreviews> games = new ArrayList<>();

        // Action Games
        games.add(new VideoGamePreviews("Grand Theft Auto V", 2013, "An open-world action-adventure game with heist missions.", "PS5, Xbox, Steam"));
        games.add(new VideoGamePreviews("DOOM Eternal", 2020, "A fast-paced first-person shooter battling demonic forces.", "PS5, Xbox, Steam"));

        // Adventure Games
        games.add(new VideoGamePreviews("The Legend of Zelda: Breath of the Wild", 2017, "An open-world action-adventure game in a vast, post-apocalyptic Hyrule.", "Nintendo eShop"));
        games.add(new VideoGamePreviews("Life is Strange", 2015, "A graphic adventure game that follows a young girl with time-manipulation powers.", "Steam"));

        // RPG Games
        games.add(new VideoGamePreviews("The Witcher 3: Wild Hunt", 2015, "An open-world RPG where Geralt of Rivia battles monsters and searches for his adopted daughter.", "Steam"));
        games.add(new VideoGamePreviews("Cyberpunk 2077", 2020, "An open-world RPG set in a dystopian future, featuring advanced technology and cybernetics.", "Steam"));

        // Simulation Games
        games.add(new VideoGamePreviews("The Sims 4", 2014, "A life simulation game where players create and control people in a virtual world.", "PS4, Xbox, Steam, Origin"));
        games.add(new VideoGamePreviews("Animal Crossing: New Horizons", 2020, "A social simulation game where players develop a deserted island and interact with animal villagers.", "Nintendo eShop"));

        // Strategy Games
        games.add(new VideoGamePreviews("Civilization VI", 2016, "A turn-based strategy game where players build and manage an empire through the ages.", "Steam"));
        games.add(new VideoGamePreviews("XCOM 2", 2016, "A turn-based tactics game where players lead resistance forces against an alien occupation.", "Steam"));

        // Sports Games
        games.add(new VideoGamePreviews("FIFA 24", 2023, "A football simulation game featuring real teams and leagues.", "Origin"));
        games.add(new VideoGamePreviews("NBA 2K24", 2023, "A basketball simulation game featuring NBA teams and players.", "Steam"));

        // Puzzle Games
        games.add(new VideoGamePreviews("Tetris Effect", 2018, "A puzzle game that combines classic Tetris gameplay with music and visual effects.", "Steam"));
        games.add(new VideoGamePreviews("Portal 2", 2011, "A first-person puzzle-platform game where players solve puzzles using a portal gun.", "Steam"));

        // Horror Games
        games.add(new VideoGamePreviews("Resident Evil Village", 2021, "A survival horror game where players battle through a village terrorized by monsters.", "Steam"));
        games.add(new VideoGamePreviews("Dead Space (Remake)", 2023, "A sci-fi survival horror game where players fight necromorphs aboard a stranded spaceship.", "Steam"));

        // Using a for loop to display details of all games
        for (VideoGamePreviews game : games) {
            game.displayGameDetails();
        }
    }
}
