import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
    public void setSongs(ArrayList<Song> inputsongs) {
        songs = inputsongs;
    }
    public ArrayList getSongs() {
        return songs;
    }

    public void setAlbums(ArrayList<Album> inputalbums) {
        albums = inputalbums;
    }
    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setArtists(ArrayList<Artist> inputartists) {
        artists = inputartists;
    }
    public ArrayList<Artist> getArtists() {
        return artists;
    }

   /* you complete this. Return an empty Album if the search fails. If there is more than one match, return the first */
    public Album findAlbum(String name) {
        for (int i = 0; i < albums.size(); i++) {
            if (name == albums.get(i).name) {
                return albums.get(i);
            } else {

            }
        }
        Album emptyalbum = new Album();
        return emptyalbum;
    }

    /* you complete this. Return an empty Artist if the search fails. If there is more than one match, return the first*/
    public Artist findArtist(String name) {
        for (int i =0; i < artists.size(); i++) {
            if (name == artists.get(i).name) {
                return artists.get(i);
            } else {

            }
        }
        Artist emptyartist = new Artist();
        return emptyartist;
    }

    /* you complete this. Return an empty Song if the search fails. If there is more than one match, return the first*/
    public Song findSong(String name, Artist a) {
        for (int i = 0; i < songs.size(); i++) {
            if (name == songs.get(i).name) {
                return songs.get(i);
            } else {

            }
        }
        Song emptysong = new Song();
        return emptysong;
    }

    /* you complete this. */
    public void add(Entity e) {
        if (e instanceof Song) {
            songs.add((Song) e);
        } else if (e instanceof Album) {
            albums.add((Album)e);
        } else if (e instanceof Artist) {
            artists.add((Artist)e);
        } else {
            System.out.println("Fail to add to Library. This is an incorrect type.");
        }
    }
    /* you complete this */
    // Will all the songs and albums of an artist be deleted when this artist has been deleted?
    public void delete(Entity e) {
        if (e instanceof Song) {
            songs.remove((Song)e);
        } else if (e instanceof Album) {
            albums.remove((Album)e);
        } else if (e instanceof Artist) {
            artists.remove((Album)e);
        } else {
            System.out.println("Fail to delete from library. This is an incorrect type.");
        }
    }

    /* you complete this. Print out the library in a pretty, user-friendly way. */
    public void display() {
        Collections.sort();

    }

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
