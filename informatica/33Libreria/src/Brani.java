public class Brani {
    private int idBrani;
    private double durata;
    private String brano;
    private String artista;
    private String nomeBrano;

    public Brani(int idBrani, double durata, String brano, String artista, String nomeBrano) {
        this.idBrani = idBrani;
        this.durata = durata;
        this.brano = brano;
        this.artista = artista;
        this.nomeBrano = nomeBrano;
    }

    public int getIdBrani() {
        return idBrani;
    }

    public void setIdBrani(int idBrani) {
        this.idBrani = idBrani;
    }

    public double getDurata() {
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }

    public String getBrano() {
        return brano;
    }

    public void setBrano(String brano) {
        this.brano = brano;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getNomeBrano() {
        return nomeBrano;
    }

    public void setNomeBrano(String nomeBrano) {
        this.nomeBrano = nomeBrano;
    }
}
