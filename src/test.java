public class test {
    public static void main(String[] args) {
        // test Entity
        Entity entitytest1 = new Entity();
        entitytest1.setName("Pekko");
        System.out.println(entitytest1);

        //test Song, Artist, Album.
        Song s1 = new Song();
        Song s2 = new Song();
        Song s3 = new Song();
        Artist a1 = new Artist();
        Album al1 = new Album();
        Album al2 = new Album();

        s1.setName("Here Comes The Sun");
        s2.setName("Tomorrow Never Knows");
        s3.setFilename("Something");
        s1.setFilename("Here Comes The Sun.flac");
        s2.setFilename("Tomorrow Never Knows.flac");
        s3.setFilename("Something.flac");

        a1.setName("The Beatles");
        a1.songs.add(s1);
        a1.songs.add(s2);

        al1.setName("Revolver");
        al1.songs.add(s1);
        al1.songs.add(s2);
        al1.songs.add(s3);
        al1.setArtist(a1);

        s1.setArtist(a1);
        s2.setArtist(a1);
        s3.setArtist(a1);

        a1.albums.add(al1);
        a1.albums.add(al2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(a1);
        System.out.println(al1);
        System.out.println(al2);
        if ()
    }
}
