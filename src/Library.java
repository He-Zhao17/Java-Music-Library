import java.util.ArrayList;
import java.util.List;

public class Library {
    ArrayList<Song> songs;
    ArrayList<Album> albums;
    ArrayList<Artist> artists;

    public Library() {
        songs = new ArrayList<Song>();
        albums = new ArrayList<Album>();
        artists = new ArrayList<Artist>();
    }

    /* add setters and getters */

   /* you complete this. Return an empty Album if the search fails. If there is more than one match, return the first */
    public Album findAlbum(String name) {

    }

    /* you complete this. Return an empty Artist if the search fails. If there is more than one match, return the first*/
    public Artist findArtist(String name) {

    }

    /* you complete this. Return an empty Song if the search fails. If there is more than one match, return the first*/
    public Song findSong(String name, Artist a) {

    }

    /* you complete this. */
    public void add(Entity e) {

    }
    /* you complete this */
    public void delete(Entity e) {

    }

    /* you complete this. Print out the library in a pretty, user-friendly way. */
    public void display()

    /* you complete this. Return the first match, using the equals() method to determine if something is a duplicate.
        Return an empty Entity if no match is found.
    */

    public Entity findDuplicate(Entity e) {

    }

    /* you complete this. Read from a file that has a CSV format like:
    Here Comes the Sun, The Beatles, Abbey Road, 3:22
    Tomorrow Never Knows, The Beatles, Revolver, 2:56

     */
    public void readFromFile(String f) {

    }

    /* write the data out to a file in the exact same format. */
    public void writeToFile() {

    }



}
