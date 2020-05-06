public class Main {

    private Semaforo semaforo;
    private int numero;

    public Main(int numero) {

        this.numero = numero;
        semaforo = new Semaforo();
    }

    public Semaforo getSemaforo() {
        return semaforo;
    }

    public void setSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;

    }

    public static void main(String[] args) {
        Main main = new Main(20);
        ThreadDecrementatore thread1 = new ThreadDecrementatore(main);
        ThreadDecrementatore thread2 = new ThreadDecrementatore(main);
        ThreadDecrementatore thread3 = new ThreadDecrementatore(main);
        main.getSemaforo().down();
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("numero decrementato thread1 " + thread1.getContnum() +"\n" +
                            "numero decrementato thread2 " + thread2.getContnum() +"\n" +
                            "numero decrementato thread3 " + thread3.getContnum() +"\n" );


    }
}