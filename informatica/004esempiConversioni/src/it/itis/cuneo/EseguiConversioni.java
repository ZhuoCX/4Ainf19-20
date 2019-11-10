package it.itis.cuneo;

/**
 * Created by inf.zhuoc2012 on 30/09/2019.
 */
public class EseguiConversioni {

    //esempio di conversione tra weapper, partendo da un primitivo
    public static void main(String[] args)
    {
        //float: è un tipo primitivo, cioè una variabile semplice
        //Float: è una classe wrapper, contiene un primitivo dello stesso tipo ed i metodi ne permettono l'elaborazione

        Float f;
        f = new Float(0.52d);
        //System.out.println(String s)
        //la firma del metodo sopra richiede una stringa come parametro quindi il float viene convertito in una stringa al momento di una chiamata
        ////System.out.println(float fPrimitivo)
        //nel caso della firma sopra passiamo Float wrapper ma il metodo si aspetta un metodo primitivo
        System.out.println(f);
        System.out.println(f);

        int n;
        String quanteMele = 8;
        n = Integer.parseInt("6");
        System.out.println(n);

        int num=5;
        Integer ogI;
        ogI = new Integer(num);
        System.out.println(ogI);

        int j = 5;
        Float ogFl;
        ogFl = new Float(n);
        System.out.println(ogFl);

        String s = "5.25f"
        Float ogF;
        ogF = Float.parseFloat(s);

        String s2;
        s2 = "" + ogF;
        s2 = new String ("" + ogF);
        s2 = ogF.toString();
        System.out.println("s2 = ogf.toString():" + s2);

        //double -> Integer
        double dN = 6.5d;   //la d serve per definire il tipo della costante
        int intN = (int) dN; //intN = 6
        Integer iN = new Integer(intN);
        iN = intN;      //wrapper = primitivoDelloStessoTipo




    }
}
