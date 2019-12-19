import java.util.Objects;

public class Abitazione {
    private int numeroStanze, superficie;
    private String indirizzo, città;

    public Abitazione(int numeroStanze, int superficie, String indirizzo, String città) {
        this.numeroStanze = numeroStanze;
        this.superficie = superficie;
        this.indirizzo = indirizzo;
        this.città = città;
    }

    public int getNumeroStanze() {
        return numeroStanze;
    }

    public void setNumeroStanze(int numeroStanze) {
        this.numeroStanze = numeroStanze;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abitazione that = (Abitazione) o;
        return numeroStanze == that.numeroStanze &&
                superficie == that.superficie &&
                Objects.equals(indirizzo, that.indirizzo) &&
                Objects.equals(città, that.città);
    }


    public String toString() {
        return "Abitazione{" +
                "numeroStanze=" + numeroStanze +
                ", superficie=" + superficie +
                ", indirizzo='" + indirizzo + '\'' +
                ", città='" + città + '\'' +
                '}';
    }
}
