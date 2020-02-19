
public class Thread4 extends Thread  {
    private Buffer buffer;

    public Thread4(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){
        try{
            Thread.sleep((long) Math.random() * 5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        buffer.setY(buffer.getA() + buffer.getX());
        System.out.println("c2.Y: " + buffer.getY());
    }
}
