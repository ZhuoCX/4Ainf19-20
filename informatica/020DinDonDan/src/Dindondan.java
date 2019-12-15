import java.text.ParseException;

public class Dindondan {
    public static void main(String[] args) {
        Thread thr1 = new Thread(new Campana("din", 5));
        Thread thr2 = new Thread(new Campana("don", 5));
        Thread thr3 = new Thread(new Campana("dan", 5));
        thr1.start();
        thr2.start();
        thr3.start();

    }
}
