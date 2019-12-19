public class Appartamento extends Abitazione {
    private int pianoSituato;
    private boolean ragAscensore;

    public Appartamento(int numeroStanze, int superficie, String indirizzo, String città, int pianoSituato, boolean ragAscensore) {
        super(numeroStanze, superficie, indirizzo, città);
        this.pianoSituato = pianoSituato;
        this.ragAscensore = ragAscensore;
    }

    public int getPianoSituato() {
        return pianoSituato;
    }

    public void setPianoSituato(int pianoSituato) {
        this.pianoSituato = pianoSituato;
    }

    public boolean isRagAscensore() {
        return ragAscensore;
    }

    public void setRagAscensore(boolean ragAscensore) {
        this.ragAscensore = ragAscensore;
    }


    public String toString() {
        return super.toString() + "Appartamento{" +
                "pianoSituato=" + pianoSituato +
                ", ragAscensore=" + ragAscensore +
                '}';
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Appartamento that = (Appartamento) o;

        if (pianoSituato != that.pianoSituato) return false;
        return ragAscensore == that.ragAscensore;
    }


}
