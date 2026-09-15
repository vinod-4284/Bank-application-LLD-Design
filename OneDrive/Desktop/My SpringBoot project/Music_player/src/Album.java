import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class Album implements IAlbum{
    Random random = new Random();
    static int albumCount =0;
    private final String name;
    private final String createdDate;
    private final ArrayList<Song> songList;
    private final int albumId;

    public Album(String name,String createdDate) {
        albumCount++;
        this.albumId = albumCount;
        this.name = name;
        this.createdDate = createdDate;
        this.songList = new ArrayList<>();
    }


    @Override
    public void addSong(Song song) {
        songList.add(song);
    }

    @Override
    public void deleteSong(int songId) {
        for(Song song:songList){
            if(song.getSongId()==songId){
                songList.remove(song);
                System.out.println("Deleted song");
                return;
            }
        }
        System.out.println("Song with id "+songId+" not found");
    }
    @Override
    public Song getSong(int songId) {
        for(Song song:songList){
            if(song.getSongId()==songId){
                return song;
            }
        }
        System.out.println("Song not found");
        return null;
    }

    @Override
    public void playAllSong() {
        for(Song song:songList){
            song.playSong();
        }

    }

    @Override
    public void playNextSong() {
        for(int i=0;i<songList.size();i++){
            if(songList.get(i).getSongId()== Song.playingsondId){
                if(i==songList.size()-1){
                    System.out.println("No next song Ended");
                    return;
                }
                songList.get(i+1).playSong();
            }
        }
        System.out.println("Currently playing song is not in this album");

    }

    @Override
    public void playPreviousSong() {
        for(int i=0;i<songList.size();i++){
            if(songList.get(i).getSongId()== Song.playingsondId){
                if(i==0){
                    System.out.println("No next song Ended");
                    return;
                }
                songList.get(i-1).playSong();
            }
        }
        System.out.println("Currently playing song is not in this album");

    }


    public void playRandomSong() {
        int randomSongNumber = random.nextInt(songList.size()); // include last song
        songList.get(randomSongNumber).playSong();
    }



    public String getName() {
        return name;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }

    public int getAlbumId() {
        return albumId;
    }
}
