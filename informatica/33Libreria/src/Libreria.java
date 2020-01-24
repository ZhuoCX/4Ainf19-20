import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Album> albumlist;

    public Libreria() {
        super();
        albumlist= new ArrayList<>();
    }


    public Libreria(List<Album> albumlist) {
        super();
        this.albumlist = albumlist;
    }

    public List<Album> getAlbumlist() {
        return albumlist;
    }

    public void setAlbumlist(List<Album> albumlist) {
        this.albumlist = albumlist;
    }
}
