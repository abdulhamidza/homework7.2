public class Album {
    private String artist;
    private String genre;

    // Constructor
    public Album(String artist, String genre) {
        this.artist = artist;
        this.genre = genre;
    }

    // Getter for artist
    public String getArtist() {
        return artist;
    }

    // Getter for genre
    public String getGenre() {
        return genre;
    }

    // Method to check if the album has rock music
    public boolean hasRockMusic() {
        return genre.equalsIgnoreCase("Rock");
    }
}
