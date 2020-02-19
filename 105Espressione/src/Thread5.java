
public class Thread5 extends Thread  {
    private Buffer buffer1 , buffer2;

    public Thread5(Buffer buffer1, Buffer buffer2) {
        this.buffer1 = buffer1;
        this.buffer2 = buffer2;
    }

    public void run(){
        try{
            Thread.sleep((long) Math.random() * 5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        buffer1.setZ(buffer1.getY() * buffer2.getY());
        System.out.println("c1.Z: " + buffer1.getZ());
    }
}
