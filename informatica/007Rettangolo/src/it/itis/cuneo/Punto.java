package it.itis.cuneo;

public class Punto {
    private int xp;
    private int yp;

    public Punto()
    {
        super();
    }

    public Punto(int xp, int yp)
    {
        super();
        this.xp = xp;
        this.yp = yp;
    }

    public int getxp()
    {
        return this.xp;
    }

    public void setxp(int xp)
    {
        this.xp = xp;
    }

    public int getyp()
    {
        return this.yp;
    }

    public void setyp(int yp)
    {
        this.yp = yp;
    }

}
