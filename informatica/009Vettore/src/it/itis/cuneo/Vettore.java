package it.itis.cuneo;

/**
 * Created by inf.zhuoc2012 on 07/10/2019.
 */
public class Vettore {

    //Attributi
    private Punto punto1;
    private Punto punto2;

    public Vettore ()
    {
        super();
    }

    public Vettore (Punto punto1, Punto punto2)
    {
        super();
        this.punto1 = new Punto (punto1);
        this.punto2 = new Punto (punto2);
    }

    public Vettore (Vettore v)
    {
        this.punto1 = new Punto (v.getPunto1());
        this.punto2 = new Punto (v.getPunto2());
    }

    public boolean equals(Vettore v)
    {
        boolean equals = false;
        if (this.punto1.equals(v.getPunto1()) ==  this.punto2.equals(v.getPunto2()) )
        {
            equals = true;
        }
        return  equals;

    }

    public double lenght ()
    {
        double lung;
        return lung = (double) Math.sqrt((this.punto1.getX() -  this.punto2.getX()) * (this.punto1.getX() -  this.punto2.getX()) + (this.punto1.getY() - this.punto2.getY()) * (this.punto1.getY() - this.punto2.getY()) );

    }

    public String toString()
    {
     return "Segmento: " + punto1 + punto2;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = new Punto (punto1);

    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = new Punto (punto2);
    }



    public static void main(String[] args) {
        Punto p1 = new Punto(4,5);
        Punto p2 = new Punto(4,5);
        Punto p3 = new Punto(4,5);
        Punto p4 = new Punto(4,5);
        Vettore v1 = new Vettore(p1,p2);
        Vettore v2 = new Vettore(p3,p4);

        System.out.println(v1.toString());
        boolean equals = v1.equals(v2);
        if (equals == true)
        {
            System.out.println("i due vettori sono uguali");
        }
        else
        {
            System.out.println("non sono uguali");
        }

        double lung1 = v1.lenght();
        System.out.println("la lunghezza del vettore1 e' uguale a " + lung1);
    }
}
