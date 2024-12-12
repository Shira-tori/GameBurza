public class VideoGamePreviews {
    String title;
    int releaseDate;
    String description;
    String platforms;

    public VideoGamePreviews(String title, int releaseDate, String description, String platforms) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.description = description;
        this.platforms = platforms;
    }

    public void displayGameDetails() {
        System.out.println("Title: " + title);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Description: " + description);
        System.out.println("Platforms: " + platforms);
    }
}
