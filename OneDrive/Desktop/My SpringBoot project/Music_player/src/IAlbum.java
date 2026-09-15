public interface IAlbum {
    void addSong(Song song);
    Song getSong(int songId);
    void deleteSong(int  songId);
    void playAllSong();

    void playNextSong();
    void playPreviousSong();

//    void playRandomSong();

}
