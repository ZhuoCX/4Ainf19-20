/*
Autore: Zhuo Chenxi
Data: 11/03/2020
 */
public class GestioneStringa {
    public static void main(String[] args) {

        Stampa stampa = new Stampa();
        stampa.start();
        try {
            stampa.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
