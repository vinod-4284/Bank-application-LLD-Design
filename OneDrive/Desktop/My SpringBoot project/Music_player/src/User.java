import java.util.ArrayList;

public class User implements IUser{
    static int userCount=0;

    private String name;
    private final ArrayList<Album> albumList;
    private final int userId;

    public User(String name){
        userCount++;
        this.name = name;
        this.userId = userCount;
        this.albumList = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void addAlbum(Album album) {
        albumList.add(album);
    }

    @Override
    public void deleteAlbum(int albumId) {
        for(Album album:albumList){
            if(album.getAlbumId()==albumId){
                albumList.remove(album);
                System.out.println("Deleted album with id "+albumId);
                return;
            }
        }
        System.out.println("Album with id "+albumId+" not found");

    }

    @Override
    public Album getAlbum(int albumId) {
        for(Album album:albumList){
            if(album.getAlbumId()==albumId){
                return album;
            }
        }
        System.out.println("Album with id "+albumId+" not found");
        return null;

    }

    @Override
    public void changeName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
