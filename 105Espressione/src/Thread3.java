
public class Thread3 extends Thread  {
    private Buffer buffer;

    public Thread3(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){
        try{
            Thread.sleep((long) Math.random() * 6000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        buffer.setX(buffer.getB() * 5);
        System.out.println("c2.X: " + buffer.getX());
    }
}
