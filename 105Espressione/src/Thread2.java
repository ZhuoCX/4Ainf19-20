
public class Thread2 extends Thread {
    private Buffer buffer;

    public Thread2(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){
        try{
            Thread.sleep((long) Math.random() * 5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        buffer.setY(buffer.getX() + buffer.getA());
        System.out.println("c1.Y: " + buffer.getY());
    }
}
