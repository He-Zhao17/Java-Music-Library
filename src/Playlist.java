
import java.util.ArrayList;
import java.util.Random;

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
    public void setSongs(ArrayList<Song> setsongs) {
        songs = setsongs;
    }
    public ArrayList<Song> getSongs() {
        return songs;
    }

    /* add a new song.  */
    public void add(Song newSong) {
        songs.add(newSong);
    }

    /* remove Song s from the playlist */
    public void remove(Song s) {
        songs.remove(s);

    }

    /* shuffle - randomly reorder the playlist in place. */
    public int randomsel(ArrayList<Song> songs) {
        Random random = new Random();
        int sel = random.nextInt(songs.size());
        return sel;
    }
    public void shuffle() {
        ArrayList<Song> backup = songs;
        songs = new ArrayList<Song>();
        for (int i = 0; i < songs.size() - 1; i++) {
            int sel = randomsel(backup);
            songs.add(backup.get(sel));
            backup.remove(sel);
        }
        songs.add(backup.get(0));
    }
}
