public class Semaforo {
    private int value;
    public Semaforo()
    {
        value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public synchronized void down()
    {
        value++;
        notify();
    }
    public synchronized void up()
    {
        while(value==0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value--;
    }
}



