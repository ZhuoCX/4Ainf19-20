package it.itis.cuneo;

public class Angolo {

    //attributi
    private int g;
    private int p;
    private int s;

    //metodi
    public Angolo()
    {
        super();
    }
    public Angolo(int g, int p, int s )
    {
        super();
        this.g = g;
        this.p = p;
        this.s = s;
    }
    public String visualizzaAngolo ()
    {
        return "grado: "+ this.g +" primi: " + this.p + " secondi: " +this.s;
    }

    public void aggiungiGradi(int g)
    {
        this.g+=g;
    }

    public void aggiungiPrimi(int p)
    {
        this.p+=p;
    }

    public void aggiungiSecondi(int s)
    {
        this.s+=s;
    }

    public int angoloSecondo ()
    {
        return this.g*3660+this.p*60+this.s;
    }

    public void secondiAngolo (int s)
    {
        int jolly;
        this.g = s/3600;
        jolly = s-this.g*3600;
        this.p = jolly/60;
        this.s = jolly-this.p*60;

    }

    public int differenzaSecondi (Angolo angolo)
    {
        return this.g*3600+this.p*60+this.s - angolo.getGradi()*3600 - angolo.getPrimi()*60 - angolo.getSecondi();
    }

    public void sommaAngolo (Angolo angolo)
    {
        this.g +=  angolo.getGradi();
        this.p += angolo.getPrimi();
        this.s += angolo.getSecondi();
    }

    public void setGradi (int g)
    {
        this.g=g;
    }

    public int getGradi ()
    {
        return this.g;
    }

    public void setPrimi (int p)
    {
        this.p=p;
    }

    public int getPrimi ()
    {
        return this.p;
    }

    public void setSecondi (int s)
    {
        this.s=s;
    }

    public int getSecondi ()
    {
        return this.s;
    }

    public static void main (String[] args)
    {
        Angolo angolo1 = new Angolo (50,20,10);
        Angolo angolo2 = new Angolo (120,40,50);
        Angolo angolocomposto = new Angolo ();
        System.out.println(angolo1.visualizzaAngolo());

        angolo1.aggiungiGradi(10);
        System.out.println("il nuovo grado è :"+angolo1.getGradi());

        angolo1.aggiungiPrimi(10);
        System.out.println("il nuovo primo è :"+angolo1.getGradi());

        angolo1.aggiungiSecondi(10);
        System.out.println("il nuovo secondo è :"+angolo1.getGradi());

        System.out.println("i valore espresso in secondi dell'angolo è: " + angolo1.angoloSecondo());

        angolocomposto.secondiAngolo(50000);
        System.out.println("l' angolo composto vale: " + angolocomposto.visualizzaAngolo());
        angolo1.sommaAngolo(angolo2);
        System.out.println("la somma dei due angoli è :" + angolo1.visualizzaAngolo());



    }

}
