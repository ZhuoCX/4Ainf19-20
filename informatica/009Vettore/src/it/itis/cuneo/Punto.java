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

    public String toString ()
    {
        return "Punto:{\"x\": " + x + "," + "\"y\": " + y + "}";
    }

    public boolean equals (Punto punto)
    {
        boolean equals = false;
        if (this.x == punto.getX() && this.y == punto.getY())
        {
            equals = true;
        }
        return equals;
    }



}
