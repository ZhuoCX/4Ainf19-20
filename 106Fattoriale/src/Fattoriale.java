public class Fattoriale extends Thread {
    private int num;
    private int numFat;

    public Fattoriale(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNumFat() {
        return numFat;
    }

    public void setNumFat(int numFat) {
        this.numFat = numFat;
    }

    public void run(){

        numFat = 1;
        int n = num;
        for (int i=1; i<n; i++){
            numFat = num * numFat;
            num = num -1;
        }
    }

    /*metodo ricorsivo
    public void run() {
        if (num > 1) {
            Fattoriale fattoriale = new Fattoriale(num-1);
            fattoriale.start();
            try {
                fattoriale.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setNumFat(num * fattoriale.getNumFat() );
        }
        else
        {
            setNumFat(1);
        }
    }
    */
    //ciclo for per il calcolo fattoriale

}
