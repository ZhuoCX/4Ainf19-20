/*
Autore: Zhuo Chen Xi 4Ainf
Data:  27/10/19
 */
public class Contenitore {

    //attributi
    private static final int N = 3;
    private Programmi p [];


    //Costruttori
    public Contenitore ()
    {
        int i;
        p = new Programmi[N];
        for(i=0; i<N; i++)
        {
            this.p[i]= new Programmi();
        }

    }

    public Contenitore(Contenitore contenitore)
    {
        int i;
        p = new Programmi[N];
        for(i=0; i<N; i++)
        {
            p[i]= new Programmi(contenitore.p[i]);
        }
    }


    //metodi

    public Programmi getProgrammi (int n)
    {

        return p[n];
    }

    public void setProgramma (Programmi programma, int n)
    {
        this.p[n] = programma;
    }

    public void killProgramma (int n)
    {
        this.p[n] = new Programmi();
    }

    public  int getN()
    {
        return N;
    }

    public  int cercaProgrammaPerDenominazione (String denominazione)
    {
        int i;
        int posizione = -1;
        for (i=0; i<N; i++)
        {
            if (this.p[i].getDenominazione() == denominazione)
            {
                posizione = i;
            }

        }
        return posizione;
    }

    public String toString ()
    {
        return "le denominazione dei programmi sono: " + this.p[0].getDenominazione() + "  "+ this.p[1].getDenominazione() + "  " + this.p[2].getDenominazione();

    }

    public int confrontaContenitore (Contenitore contenitore)
    {
        int i,num;
        num = 0;
        for (i=0; i<N; i++)
        {
            if (this.p[i].equals(contenitore.p[i]))
            {
                num++;
            }

        }
        return num;
    }

    public static void main(String[] args)
    {

        Programmi programmi1 = new Programmi("progA", "Zhuo", "1.0", "Windows", 2019);
        Programmi programmi2 = new Programmi("progB", "Zhuo", "1.0", "Windows", 2019);
        Programmi programmi3 = new Programmi("progC", "Zhuo", "1.0", "Windows", 2019);
        Contenitore contenitore1 = new Contenitore();

        contenitore1.setProgramma(programmi1, 0);
        contenitore1.setProgramma(programmi2, 1);
        contenitore1.setProgramma(programmi3, 2);
        System.out.println(contenitore1.getProgrammi(0).toString());

        Programmi programmiTest1 = new Programmi(contenitore1.getProgrammi(1));
        System.out.println(programmiTest1.toString());

        System.out.println("i numeri di programmi presenti nel contenitore sono "+contenitore1.getN());


        System.out.println("la posizione della denominazione progC si trova nella posizione: " + contenitore1.cercaProgrammaPerDenominazione("progC"));

        System.out.println(contenitore1.toString());

        Contenitore contenitore2 = new Contenitore(contenitore1);
        System.out.println("i programmi in comune sono: " + contenitore1.confrontaContenitore(contenitore2));

        contenitore1.killProgramma(1);
        System.out.println(contenitore1.getProgrammi(1).toString());
    }


}

