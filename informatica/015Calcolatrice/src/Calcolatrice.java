public class Calcolatrice {


    public Calcolatrice ()
    {

    }

    public void addizione ()
    {
        float num1,num2;
        num1 = InputOutputUtility.leggiNumeroFloat("inserisci il primo addendo : ");
        num2 = InputOutputUtility.leggiNumeroFloat("inserisci il secnodo addendo: ");
        num1 += num2;
        System.out.println("la somma è uguale a "+ num1);

    }

    public void sottrazione()
    {

            float num1,num2;
            num1 = InputOutputUtility.leggiNumeroFloat("inserisci il minuendo: ");
            num2 = InputOutputUtility.leggiNumeroFloat("inserisci il sottraendo: ");
            num1 = num1 - num2;
            System.out.println("la differenza è uguale a "+ num1);


    }

    public void moltiplicazione()
    {

            float num1,num2;
            num1 = InputOutputUtility.leggiNumeroFloat("inserisci il primo fattore: ");
            num2 = InputOutputUtility.leggiNumeroFloat("inserisci il secondo fattore: ");
            num1 = num1 * num2;
            System.out.println("il prodotto è uguale a "+ num1);



    }

    public void divisione ()
    {
        {
            float num1,num2;
            num1 = InputOutputUtility.leggiNumeroFloat("inserisci il dividendo: ");
            num2 = InputOutputUtility.leggiNumeroFloat("inserisci il divisore: ");
            num1 = num1 / num2;
            System.out.println("il quoziente è uguale a "+ num1);

        }
    }




    public static void main(String[] args) {
        Calcolatrice calcolatrice = new Calcolatrice();
        calcolatrice.addizione();
        calcolatrice.sottrazione();
        calcolatrice.moltiplicazione();
        calcolatrice.divisione();


    }
}
