import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static List<Album> albums = new ArrayList<>();
    public static void main(String[] args) {

        Album album1 = new Album("Moosa","Sidhu Moosewala");
        album1.addSongtoAlbum("295",4.05);
        album1.addSongtoAlbum("LastRide",5.5);
        album1.addSongtoAlbum("So High",3.05);

        Album album2 = new Album("Arijit's Songs","Arijit Singh");
        album2.addSongtoAlbum("Kesariya",5);
        album2.addSongtoAlbum("Jeena Jeena",4.05);
        album2.addSongtoAlbum("Gerua",6);

        albums.add(album1);
        albums.add(album2);

        System.out.println(album1.findSong("Gerua"));

        LinkedList<Song> myPlayList = new LinkedList<>();
        album1.addToPlaylistFromAlbum("295",myPlayList);
        album2.addToPlaylistFromAlbum(2,myPlayList);

    }
}