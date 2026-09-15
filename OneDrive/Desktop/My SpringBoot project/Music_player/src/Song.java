public class Song implements ISong {
    static int songCount=0;
    static int playingsondId = -1;

    static void pauseSong(){
        playingsondId = -1;
        System.out.println("playing song paused...❤");
    }
    private final String name;
    private final String artist;
    private final double duration;
    private final int songId;

    public Song(String name, String artist, double duration) {
        songCount++;
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.songId = songCount;
    }

    @Override
    public void playSong() {
        playingsondId = this.songId;
        System.out.println("Playing song Id: "+songId);
    }


    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    public int getSongId() {
        return songId;
    }

}
