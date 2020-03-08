public class Prenotazione {
    public static final String SEPARATOR = ";";

    private String nome, cognome, telefono, cittaPartenza, cittaDestinazione, data;

    public Prenotazione(String nome, String cognome, String telefono, String cittaPartenza, String cittaDestinazione, String data) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
        this.cittaPartenza = cittaPartenza;
        this.cittaDestinazione = cittaDestinazione;
        this.data = data;
    }

    public static String getSEPARATOR() {
        return SEPARATOR;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCittaPartenza() {
        return cittaPartenza;
    }

    public void setCittaPartenza(String cittaPartenza) {
        this.cittaPartenza = cittaPartenza;
    }

    public String getCittaDestinazione() {
        return cittaDestinazione;
    }

    public void setCittaDestinazione(String cittaDestinazione) {
        this.cittaDestinazione = cittaDestinazione;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String csv()
    {
        return cognome + SEPARATOR +
                nome + SEPARATOR +
                telefono + SEPARATOR +
                cittaPartenza + SEPARATOR +
                cittaDestinazione + SEPARATOR +
                data + SEPARATOR + "\n";
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cittaPartenza='" + cittaPartenza + '\'' +
                ", cittaDestinazione='" + cittaDestinazione + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
