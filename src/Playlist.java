
import java.util.ArrayList;

public class Playlist extends Entity {
    ArrayList<Song> songs;

    public Playlist() {
        super();
        this.songs = new ArrayList<Song>();
    }

    public Playlist(String n) {
        super(n);
        this.songs = new ArrayList<Song>();
    }

    /* add setters and getters here */

    /* add a new song.  */
    public void add(Song newSong) {

    }

    /* remove Song s from the playlist */
    public void remove(Song s) {

    }

    /* shuffle - randomly reorder the playlist in place. */
    public void shuffle() {

    }

}
