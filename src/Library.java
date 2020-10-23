import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

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
    public int compareoverride(Entity o1, Entity o2) {
        char[] lettermap = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char o1n = o1.name.charAt(0);
        char o2n = o2.name.charAt(0);
        int o1nl = 0;
        int o2nl = 0;
        // get o1 letter-key
        for (int i = 0; i < 26; i++) {
            if (lettermap[i] == o1n) {
                o1nl = i;
            } else {

            }
        }
        // get o2 letter-key
        for (int j = 0; j < 26; j++) {
            if (lettermap[j] == o2n) {
                o2nl = j;
            } else {

            }
        }
        return o1nl - o2nl;
    }

    public void display() {
        // songs
        Collections.sort(songs, new Comparator<Song>() {
            @Override
            public int compare(Song o1, Song o2) {
                return compareoverride(o1, o2);
            }
        });
        System.out.println("Your songs: \n");
        for (Song song: songs) {
            System.out.println(song.toString());
            System.out.println("\n\n");
        }
        System.out.println("\n");
        // artists
        Collections.sort(artists, new Comparator<Artist>() {
            @Override
            public int compare(Artist o1, Artist o2) {
                return compareoverride(o1, o2);
            }
        });
        System.out.println("Your artists: ");
        for (Artist artist: artists) {
            System.out.println(artist.toString());
            System.out.println("\n\n");
        }
        System.out.println("\n");
        // albums
        Collections.sort(albums, new Comparator<Album>() {
            @Override
            public int compare(Album o1, Album o2) {
                return compareoverride(o1, o2);
            }
        });
        System.out.println("Your albums: ");
        for (Album album: albums) {
            System.out.println(album.toString());
            System.out.println("\n\n");
        }
        System.out.println("\n");
    }

    /* you complete this. Return the first match, using the equals() method to determine if something is a duplicate.
        Return an empty Entity if no match is found.
    */
    public Entity findDuplicate(Entity e) {
        // Artist
        if (e instanceof Artist) {
            Artist ea = (Artist) e;
            for (int i = 0; i < artists.size(); i++) {
                if (artists.get(i).equals(ea)) {
                    return artists.get(i);
                } else {

                }
            }
            // Song.
        } else if (e instanceof Song) {
            Song es = (Song) e;
            for (Song eqsong : songs) {
                if (eqsong.equals(es)) {
                    return eqsong;
                } else {

                }
            }
            // Album.
        } else if (e instanceof Album) {
            Album eal = (Album) e;
            for (Album eqalbum : albums) {
                if (eqalbum.equals(eal)) {
                    return eqalbum;
                } else {

                }
            }
        }
        Entity empentity = new Entity();
        return empentity;
    }

    /* you complete this. Read from a file that has a CSV format like:
    Here Comes the Sun, The Beatles, Abbey Road, 3:22
    Tomorrow Never Knows, The Beatles, Revolver, 2:56

     */
    public void readFromFile(String f) {
        ArrayList<String> songsfile = new ArrayList<String>();
        File songsfile_csv = new File("readfromfile.csv");
        if (!songsfile_csv.exists()) {
            songsfile.set(0,"");
        } else {
            try {
                FileReader songs_fr = new FileReader("readfromfile.csv");
                BufferedReader songs_bfr = new BufferedReader(songs_fr);
                String songs_str;
                while ((songs_str = songs_bfr.readLine()) != null) {
                    songsfile.add(songs_str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (String song1: songsfile) {
            if ()




        }
    }

    /* write the data out to a file in the exact same format. */
    public void writeToFile() {

    }



}
