package it.itis.cuneo;

import java.util.Arrays;
import java.util.Date;


public class Libreria {
    public static final int MAX_LIBRI = 3;
    private Libro[] vLibri;
    //cntLibro <= MAX_LIBRI
    private int cntLibro;

    public Libreria(){
        //costruttore di Array []
        vLibri = new Libro[MAX_LIBRI];
        cntLibro = 0;
    }

    public void addLibro(Libro libro)
            throws LibreriaPienaException{
        //possibile perché LibreriaPienaException extends Exception {
        if(cntLibro+1>MAX_LIBRI)
            throw new LibreriaPienaException(1, "Troppi libri!!");
        vLibri[cntLibro] = libro;
        cntLibro++;
    }

    @Override
    public String toString() {
        return "Libreria{" +
                "vLibri=" + Arrays.toString(vLibri) +
                ", cntLibro=" + cntLibro +
                '}';
    }

    //public Libro(String titolo, String autore, String isbn, Calendar dataPubblicazione)
    public static void main(String[] args) {
        Libro libro1 = new Libro("Alice", "Lewis Carroll", "123456780",
                InputOutputUtility.convertiDataOraToCalendar("12/10/2019",
                        InputOutputUtility.dfDay )
        );

        //Libro libro2 = new Libro("Pinocchio", )
        Libreria libreria = new Libreria();
        try {
            libreria.addLibro(libro1);
            libreria.addLibro(libro1);
            libreria.addLibro(libro1);
            libreria.addLibro(libro1);
        } catch (LibreriaPienaException e) {
            e.printStackTrace();
        }

        System.out.println(libreria.toString());

    }

}
