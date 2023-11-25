public class Song {
    private String title;
    private String artist;
    private Album onAlbum;

    // Constructor
    public Song(String title, String artist, Album onAlbum) {
        this.title = title;
        this.artist = artist;
        this.onAlbum = onAlbum;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for artist
    public String getArtist() {
        return artist;
    }

    // Getter for onAlbum
    public Album getOnAlbum() {
        return onAlbum;
    }

    // Method to check if two songs are on the same album
    public boolean onSameAlbum(Song otherSong) {
        return this.onAlbum.equals(otherSong.onAlbum);
    }

    // toString method for better representation
    @Override
    public String toString() {
        return "Song: " + title + ", Artist: " + artist + ", Album: " + onAlbum.getArtist() +
                ", Genre: " + onAlbum.getGenre();
    }
}
