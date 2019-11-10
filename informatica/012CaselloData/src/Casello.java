

import java.io.CharArrayReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Casello {

    //attributi
    private String id;
    private Calendar dataEntrata;
    private Calendar dataUscita;


    //metodi

    //costruttori
    public Casello() { super(); }

    public Casello(String id,  Calendar dataEntrata, Calendar dataUscita) {
        this.id = id;
        this.dataEntrata = dataEntrata;
        this.dataUscita = dataUscita;
    }

    public Casello(Casello casello) {

        //DA USARE COSTRUTTORE PERCHE NON è UN TIPO PRIMITIVO
        this.id = new String(casello.getId());

        //Calendar.getInstance(); :: method factory :: classe vuota da impostare
        //L'istanza creata, ha come default i secs di 01/01/1970 :: va creato un calendario
        //Calendar cData = new Calendar(); :: è protected, non accessibile
        Calendar cDataIngresso = Calendar.getInstance /*method factory*/ ();
        cDataIngresso.setTime /*mettere una data*/ (casello.getDataEntrata().getTime());
        this.dataEntrata = cDataIngresso;

        Calendar cDataUscita = Calendar.getInstance();
        cDataUscita.setTime(casello.getDataUscita().getTime());
        this.dataUscita = cDataUscita;
    }

    //getter e setter
    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }



    public Calendar getDataEntrata() { return this.dataEntrata; }
    public void setDataEntrata(Calendar dataEntrata) {
        this.dataEntrata = dataEntrata;

    }

    public Calendar getDataUscita() { return this.dataUscita; }
    public void setDataUscita(Calendar dataUscita) {
        this.dataUscita = dataUscita;

    }



    public static void main(String[] args) {
        //Stringa -> Data (SimpleDateFormat)
        //es.        23/10/2019
        //pattern   dd/mm//yyyy HH:mm:ss
        //pattern : stringa che contiene un formato
        //          della data di input
        //          rappresentato in una stringa
        final String FORMATO_DMY_HMS = "dd/MM/yyyy HH:mm:ss";

        String strdataPartenza = "29/09/2002 13:30:40";
        //Calendar non usa il costruttore, ma un metodo di generazione

        strdataPartenza = InputOutputUtility.leggiNome("inserisci la data di partenza(dd/mm/yyyy hh:mm:ss): ");
        Calendar cDataIngresso = Calendar.getInstance ();


        SimpleDateFormat sdfHH = new SimpleDateFormat(FORMATO_DMY_HMS);

        //sdfHH.applyPattern("dd/MM/yyyy HH:mm:ss"); altro metodo per dichiare il pattern senza una costante

        //parsificare una stringa secondo un formato, permette di ottenere
        //una variabile di altro tipo
        //Eccezione anomalia software che si verifica quando il codice
        //genera un errore in tempo di esecuzione
        //ParseEspection: la stringa non rispetta il formato atteso
        Date dataPartenza = null;
        try {
            //Errore nel formato della stringa
            //Viene stampato uno stackTrace: una traccia dello stack
            //è l'elenco delle chiamate ai metodi
           dataPartenza= sdfHH.parse(strdataPartenza);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //manca catch(Exception e)
        //Qui non intercetto l'Exception

        //calendar mantiene il numero di secondi dal 01/01/1970
        cDataIngresso.setTime (dataPartenza);

        System.out.println("cDataEntrata: "+cDataIngresso);
        //SimpleDateFormat(Date)
        String strData = sdfHH.format(dataPartenza);
        System.out.println(sdfHH.format(dataPartenza));
        //   System.out.println("String.format(cDataEntrata " + sdfHH.format(cDataIngresso));



    }

}
