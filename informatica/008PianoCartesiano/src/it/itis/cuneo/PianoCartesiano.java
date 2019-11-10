package it.itis.cuneo;

/**
 * Created by inf.zhuoc2012 on 07/10/2019.
 */
public class PianoCartesiano {

    //costanti
    public final static int MAX_Y = 1000; // con final non è modificabile, lo si scrive maiuscolo
    public static int MAX_X = 1500;

    //atributi
    //statici :sono attributi di calsse
    private static int ox = 0;
    private static int oy = 0;
    private Rettangolo rettangolo1;
    private Rettangolo rettangolo2;

    public static void setOx(int ox) {
        PianoCartesiano.ox = ox;
    }

    public static void setOy(int oy) {
        PianoCartesiano.oy = oy;
    }

    public static int getOx()
    {
        return ox;
    }

    public static  int getOy()
    {
        return oy;
    }



    public boolean equals (PianoCartesiano pianoCartesiano)
    {
        //@@// TODO: 09/10/2019
        return false;
    }

    public  String toString()
    {
        String str="";
        str = "PianoCartesiano{\"rettangolo1\":"rettangolo1""+ "\"rettangolo2\":"rettangolo2+"}";
        //equivale a "\"rettangolo2\":"+rettangolo2 toString()+"}";
    }

    //metodi
    public  PianoCartesiano(Rettangolo rettangolo1, Rettangolo rettangolo2)
    {
        this.rettangolo1 = new Rettangolo(rettangolo1);
        this.rettangolo2 = new Rettangolo(rettangolo2)
    }

    public static void main(String[] args) {
        //variabile definisce una variabile condivisa tra tutte le instanza della classe
        //Alle variabili statiche, tipo ox PianoCartesiano si accede con nome della classe, senza utilizzare il costruttore

        int maxX = PianoCartesiano.MAX_X;//costante solo in lettura (non modificabile)
        //Se l'attributo condiviso viene modificato, per tutti gli oggetti
        PianoCartesiano.ox=10;
        //essendo l'attributo private, occore avere un setOx
        PianoCartesiano.setOx(10);
    }
}
