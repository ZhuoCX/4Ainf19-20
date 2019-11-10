public class Bottiglia {

    private String marca, prezzo;
    private int capacità;

    public Bottiglia(String marca, String prezzo, int capacità) {
        this.marca = marca;
        this.prezzo = prezzo;
        this.capacità = capacità;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }

    public int getCapacità() {
        return capacità;
    }

    public void setCapacità(int capacità) {
        this.capacità = capacità;
    }
}
