package it.itis.cuneo;

/**
 * Created by inf.zhuoc2012 on 07/10/2019.
 */
public class Segmento {

    //Attributi
    private Punto punto1;
    private Punto punto2;

    //metodi
    /*
    public Segmento (Punto punto1, Punto punto2)
    {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }
    */

    public Segmento (Punto punto1, Punto punto2)
    {
        this.punto1 = new Punto (punto1.getX(), punto1.getY());
        this.punto2 = new Punto (punto2.getX(), punto2.getY());
    }


    /*è identico a quello superiore, non si usa perchè prende solo la copia
    public Segmento (Punto punto1, Punto punto2)
    {
        this.punto1 = new Punto (punto1);
        this.punto2 = new Punto (punto2);
    }*/

    public Segmento (Segmento segmento)
    {
        this.punto1 = new Punto (segmento.getPunto1());
        this.punto2 = new Punto (segmento.getPunto2());
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = new Punto (punto1);
        // this.punto = punto2; //in questo caso se dereferenzio il parametro perdo il parametro
    }

    public Punto getPunto2() {
        return punto2;
    }

    public boolean equals (Segmento segmento)
    {
        boolean equals = false;

        //if(this.punto1 == segmento.getPunto()) -> errato confronta gli handler
        if((this.punto1.equals(segmento.getPunto1()))
            && (this.punto2.equals(segmento.getPunto1()))
        {
            equals = true;
        }
        return equals;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = new Punto (punto2);
    }
}
