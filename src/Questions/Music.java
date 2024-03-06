package Questions;

public class Music {
    String albumName;
    String artistName;

    public Music(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
    }
}

class Artist extends Music {
    String trackName;
    public Artist(String albumName, String artistName, String trackName) {
        super(albumName, artistName);
        this.trackName = trackName;
    }
}

class Main {
    public static void main(String[] args) {
        Music m1 = new Artist("Hybrid Theory", "Chester Bennington", "In The End");
    }
}
    