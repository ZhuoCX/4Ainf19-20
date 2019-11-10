//Eccezione della famiglia Exception
public class ScatolaPienaException extends Exception {
    private int codice;
    private String descrizione;

    public ScatolaPienaException(int codice, String descrizione) {
        this.codice = codice;
        this.descrizione = descrizione;
    }


    public String toString() {
        return "ScatolaPienaException{" +
                "codice=" + codice +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}
