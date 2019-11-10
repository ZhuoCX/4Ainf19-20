package it.itis.cuneo;

/**
 * Created by inf.zhuoc2012 on 07/10/2019.
 */
public class Punto {
    //Attributi
    private int x;
    private int y;

    //Metodi
    public Punto ()
    {
        super();
    }
    public Punto (int x, int y)
    {
        super();
        this.x = x;
        this.y = y;
    }

    //fa la copia dell'oggetto
    public Punto (Punto p)
    {
        x = p.getX();
        y = p.getY();
    }

    public int getX()
    {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getY()
    {
        return y;
    }

    public boolean equals (Punto punto)
    {
        boolean equals = false;
        if (this.x == punto.getX() && this.y == punto.getY())
        {
            equals = true
        }
        return equals;
    }

    public String toString()
    {
        return "Punto:{\"x\": " + x + "," +
                "\"y\": " + y + "}";
    }

    public static void main (String[] args)
    {
        //puntoA e puntoB referenziano due aree
        //di memoria diverse
        Punto puntoA = new Punto (5,6);
        //puntoB è una copia di puntoA
        //per il suo stato, ma fisicamente sono
        //in due aree di memoria diverse
        Punto puntoB = new Punto (puntoA);

        //puntoC e puntoA come handler referenziano
        //la stessa area di memoria
        Punto puntoC = puntoA;

        Punto puntoD = new Punto();
        Punto puntoE = null;
        //se il richiamo al costruttore
        //non viene svolto ho un nullPointer
        puntoE = new Punto();
        System.out.println(puntoE.toString());

    }
}
