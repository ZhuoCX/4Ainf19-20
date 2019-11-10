import java.util.Arrays;

public class Scatola {

    public static final int MAX_BOT = 3;
    private Bottiglia[] bottiglie;
    private int cntBottiglie;


    public Scatola ()
    {
        bottiglie = new Bottiglia[MAX_BOT];
        cntBottiglie = 0;
    }

    public void addBottiglia(Bottiglia bottiglia)
            throws ScatolaPienaException{
        //possibile perché ScatolaPienaException extends Exception {
        if(cntBottiglie+1>MAX_BOT)
            throw new ScatolaPienaException(1, "Troppe bottiglie!!");
        bottiglie[cntBottiglie] = bottiglia;
        cntBottiglie++;
    }


    public String toString() {
        return "Scatola{" +
                "bottiglie=" + Arrays.toString(bottiglie) +
                ", cntBottiglie=" + cntBottiglie +
                '}';
    }


    public static void main(String[] args) {
        Bottiglia bottiglia1 = new Bottiglia("Eva", "1€", 2);


        Scatola scatola1 = new Scatola();
        try {
            scatola1.addBottiglia(bottiglia1);
            scatola1.addBottiglia(bottiglia1);
            scatola1.addBottiglia(bottiglia1);
            scatola1.addBottiglia(bottiglia1);
        } catch (ScatolaPienaException e) {
            e.printStackTrace();
        }

        System.out.println(scatola1.toString());

    }







}
