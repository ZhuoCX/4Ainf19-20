import java.util.Random;

public class Eccezione {

    public Eccezione ()
    {

    }

    public int getRandom()throws Exception
    {
        Random random = new Random();
        int r;
        r = random.nextInt(2);
        System.out.println("numero uscito = " + r);
        if(r == 1)
        {
            eccezione();
        }

        return r;
    }

    public void eccezione ()throws Exception
    {
        throw new Exception("è uscito l'eccezione 1");
    }

    public static void main(String[] args) {
        Eccezione eccezione = new Eccezione();
        int i = 0;
        while (i<5)
        {
            try
            {
                eccezione.getRandom();

            }
            catch (Exception e)
            {
                e.printStackTrace();
                i++;

            }



        }
    }
}
