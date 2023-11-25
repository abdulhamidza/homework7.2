
public class Main {
    public static void main(String[] args) {
        Album album1 = new Album("Artist1", "Rock");
        Album album2 = new Album("Artist2", "Pop");

        // Create songs
        Song song1 = new Song("Song1", "Artist1", album1);
        Song song2 = new Song("Song2", "Artist2", album1);
        Song song3 = new Song("Song3", "Artist3", album2);

        // Test onSameAlbum method
        System.out.println(song1.onSameAlbum(song2));  // Should be true
        System.out.println(song1.onSameAlbum(song3));  // Should be false

        // Test hasRockMusic method in Album class
        System.out.println(album1.hasRockMusic());  // Should be true
        System.out.println(album2.hasRockMusic());  // Should be false

        // Print song information
        System.out.println(song1.toString());
        System.out.println(song2.toString());
        System.out.println(song3.toString());
    }

}