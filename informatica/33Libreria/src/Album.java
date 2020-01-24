import java.util.ArrayList;
import java.util.List;

public class Album {
    private List<Brani> braniList;
    private int IdAlbum;
    private String NomeAlbum

    public Album(){
        super();
        braniList = new ArrayList<>();
    }
    public Album(List<Brani> braniList) {
        super();
        this.braniList = braniList;
    }

    public List<Brani> getBraniList() {
        return braniList;
    }

    public void setBraniList(List<Brani> braniList) {
        this.braniList = braniList;
    }

    public int getIdAlbum() {
        return IdAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        IdAlbum = idAlbum;
    }

    public String getNomeAlbum() {
        return NomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        NomeAlbum = nomeAlbum;
    }
}



