
public class Thread1 extends Thread {
    private Buffer buffer;

    public Thread1(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){
        try{
            Thread.sleep((long) Math.random() * 5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        buffer.setX(buffer.getB() * 4);
        System.out.println("c1.X: " + buffer.getX());
    }
}
