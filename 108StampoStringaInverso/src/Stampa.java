/*
Autore: Zhuo Chenxi
Data: 11/03/2020
 */
public class Stampa extends Thread {
    public static final int DELAY_MIN = 1000;
    public static final int DELAY_MAX = 3000;
    public static final String str = "Compito";

    public void run(){
        int delay;

            for (int i=0; i<=str.length()-1; i++)
            {

            delay = (int) Math.round((Math.random() * (DELAY_MAX - DELAY_MIN )) + DELAY_MIN);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(str.charAt(str.length()-1-i ) + "     delay di: " + delay + " millisecondi");
        }

    }
}
