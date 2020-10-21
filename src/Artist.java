import java.util.ArrayList;

public class Artist extends Entity {
    ArrayList<Song> songs;
    ArrayList<Album> albums;

    /* you complete this */
    public Artist() {
        super("");
        songs = new ArrayList<Song>();
        albums = new ArrayList<Album>();
    }

    /* you complete this */
    public Artist(String name) {
        super(name);
        songs = new ArrayList<Song>();
        albums = new ArrayList<Album>();
    }

    /* add setters and getters */
    public void setSongs(ArrayList<Song> setsongs){
        songs = setsongs;
    }
    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setAlbums(ArrayList<Album> setalbums) {
        albums = setalbums;
    }
    public ArrayList<Album> getAlbums() {
        return albums;
    }
    /* you complete this */

    /* you complete this */
    public String toString() {
        String str = "Artist name: " + this.name + "\nSongs of this Artist: ";
        if (songs.size() == 0) {

        } else {
            for (int i = 0; i < this.songs.size() - 1; i++) {
                str.concat(this.songs.get(i).name);
                str.concat(", ");
            }
            str.concat(this.songs.get(this.songs.size() - 1).name);
        }
        str.concat("\nAlbums of this artist: ");
        if (albums.size() == 0) {

        } else {
            for (int j = 0; j < this.albums.size() - 1; j++) {
                str.concat(this.albums.get(j).name);
                str.concat(", ");
            }
            str.concat(this.albums.get(this.albums.size() - 1).name);
        }
        return str;
    }

    /* you complete this. Assume that two artists are equal if they have the same name. */
    public boolean equals(Artist equalartist) {
        if (equalartist.name == this.name) {
            return true;
        } else {
            return false;
        }
    }
}
