/**
 * Created by inf.zhuoc2012 on 24/10/2019.
 */
public class EccezionaleRicevitore {

    public int divisione(int numeratore, int denominatore) throws Exception {
        int quoto = 0;

        quoto = numeratore / denominatore;

        return quoto;
    }

    public static void main(String[] args) {

        EccezionaleRicevitore eccezionaleRicevitore =
                new EccezionaleRicevitore();

        try {
            eccezionaleRicevitore.divisione(5, 0);
        }
        catch (ArithmeticException aEx) {
            System.out.println("catch (ArithmeticException aEx)");
            aEx.printStackTrace();


        }
        catch (Exception ex) {
            System.out.println("catch (Exception ex)");
            ex.printStackTrace();
        }
        finally {
            System.out.println("Ne esco sempre bene!!");
        }

    }
}

