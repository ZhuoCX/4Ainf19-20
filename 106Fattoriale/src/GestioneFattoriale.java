public class GestioneFattoriale {

    public static void main(String[] args) {

        int numFattoriale = 5;

        Fattoriale fattoriale = new Fattoriale(numFattoriale);
        fattoriale.start();
        try {
            fattoriale.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(fattoriale.getNumFat());
    }
}
