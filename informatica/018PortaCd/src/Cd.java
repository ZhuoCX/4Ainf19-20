public class Cd {
    private String titolo, autore;
    private int numeroBrani, durata;

    public Cd ()
    {

    }
    public Cd(String titolo, String autore, int numeroBrani, int durata) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroBrani = numeroBrani;
        this.durata = durata;
    }

    public Cd(Cd cd) {
        this.titolo = getTitolo();
        this.autore = getAutore();
        this.numeroBrani = getNumeroBrani();
        this.durata = getDurata();
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getNumeroBrani() {
        return numeroBrani;
    }

    public void setNumeroBrani(int numeroBrani) {
        this.numeroBrani = numeroBrani;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }


    public String toString() {
        return "Cd{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", numeroBrani=" + numeroBrani +
                ", durata=" + durata +
                '}';
    }





}
