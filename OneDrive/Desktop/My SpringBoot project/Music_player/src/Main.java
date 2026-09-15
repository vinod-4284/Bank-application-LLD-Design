import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Song songOne = new Song("nameOne", "artistOne",4.5);
//        songOne.playSong();

//        Song songTwo = new Song("nameTwo", "artistOne", 4.7);

        User user= new User("vinod");
        Album album = new Album("hello","2026-09-12");
        Song song = new Song("peaceFull","ARemon",2.7);

        Song song2 = new Song("hello","ARemon",2.8);

        Album album2 = new Album("vinodsongs","2026-09-14");
        user.addAlbum(album2);
        album2.addSong(song2);


        album.addSong(song);
        album.addSong(song2);
        user.addAlbum(album);

        user.getAlbum(1).getSong(1).playSong();

        Song.pauseSong();
        System.out.println(song.getSongId());
        album.playNextSong();
        album.playRandomSong();

        ArrayList<Song> list = album2.getSongList();
        for (Song song1 : list) {
            System.out.println(song1.getName()+" "+song1.getDuration());
        }


    }
}