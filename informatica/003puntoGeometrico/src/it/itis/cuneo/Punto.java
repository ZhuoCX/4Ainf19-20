package it.itis.cuneo;


/**
 * Created by inf.zhuoc2012 on 30/09/2019.
 */
public class Punto {

    //attributi
    private int corX;
    private int corY;

    //metodi
    public Punto()
    {
        super();
    }
    public Punto(int corX, int corY)
    {
        super();
        this.corX = corX;
        this.corY = corY;
    }
    public int numeroQudrante()
    {
        int quadrante;
        if (this.corY >0)
        {
            if (this.corX > 0)
            {
                quadrante = 1;
            }
            else

            {
                quadrante = 2;
            }
        }
        else
        {
            if (this.corX >0)
            {
                quadrante = 4;
            }
            else
            {
                quadrante = 3;
            }
        }
        return quadrante;
    }
    public float calcoloDistanza(Punto punto)
    {
        float dist;
        dist = (float) Math.sqrt((this.corX + punto.getcorX()) * (this.corX + punto.getcorX()) + (this.corY + punto.getcorY()) * (this.corY + punto.getcorY()) );
        return dist;
    }
    public  boolean controlloUguagglianza(Punto punto)
    {
        boolean verifica = false;

        if (this.corX == punto.getcorX() && this.corY == punto.getcorY())
        {
            verifica = true;
        }
        return verifica;
    }
    public String statoOggetto()
    {
        return "cordinatepunto: corX: " + corX + " corY: "+ corY;
    }
    public void setcorX(int corX)
    {
        this.corX = corX;
    }
    public int getcorX()
    {
        return this.corX;
    }
    public void setcorY(int corY)
    {
        this.corY = corY;
    }
    public int getcorY()
    {
        return this.corY;
    }

    public static void main(String[] args)
    {
        Punto punto1 = new Punto (3,4);
        Punto punto2 = new Punto (5,4);
        int numquadrante = punto1.numeroQudrante();
        System.out.println("num qudrante: " + numquadrante );
        float dist = punto1.calcoloDistanza(punto2);
        System.out.println("distanza due punti: " + dist );
        boolean contr = punto1.controlloUguagglianza(punto2);
        if (contr == true)
        {
            System.out.println("i due punti sono uguali");
        }
        else
            {
                System.out.println("i due punti non sono uguali");
            }
        System.out.println(punto1.statoOggetto());
    }
}
