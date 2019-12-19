public class Villa extends Abitazione {
    private int numPiani, supGiardino;
    private boolean piscina;

    public Villa(int numeroStanze, int superficie, String indirizzo, String città, int numPiani, int supGiardino, boolean piscina) {
        super(numeroStanze, superficie, indirizzo, città);
        this.numPiani = numPiani;
        this.supGiardino = supGiardino;
        this.piscina = piscina;
    }

    public int getNumPiani() {
        return numPiani;
    }

    public void setNumPiani(int numPiani) {
        this.numPiani = numPiani;
    }

    public int getSupGiardino() {
        return supGiardino;
    }

    public void setSupGiardino(int supGiardino) {
        this.supGiardino = supGiardino;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }


    public String toString() {
        return super.toString() + "Villa{" +
                "numPiani=" + numPiani +
                ", supGiardino=" + supGiardino +
                ", piscina=" + piscina +
                '}';
    }
}
