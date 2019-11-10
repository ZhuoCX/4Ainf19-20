
public class PortaCd {

    //attributi
    private static final int N = 3;
    private Cd p [];


    //Costruttori
    public PortaCd()
    {
        int i;
        p = new Cd[N];
        for(i=0; i<N; i++)
        {
            this.p[i]= new Cd();
        }

    }

    public PortaCd(PortaCd portaCd)
    {
        int i;
        p = new Cd[N];
        for(i=0; i<N; i++)
        {
            p[i]= new Cd(portaCd.p[i]);
        }
    }


    //metodi

    public Cd getCd (int n)
    {

        return p[n];
    }

    public void setCd (Cd cd, int n)
    {
        this.p[n] = cd;
    }

    public void killCd (int n)
    {
        this.p[n] = new Cd();
    }

    public  int getN()
    {
        return N;
    }

    public  int cercaCdPerTitolo (String titolo)
    {
        int i;
        int posizione = -1;
        for (i=0; i<N; i++)
        {
            if (this.p[i].getTitolo() == titolo)
            {
                posizione = i;
            }

        }
        return posizione;
    }

    public String toString ()
    {
        return "i titoli dei cd sono: " + this.p[0].getTitolo() + "  "+ this.p[1].getTitolo() + "  " + this.p[2].getTitolo();

    }

    public int confrontaCollezione (PortaCd portaCd)
    {
        int i,num;
        num = 0;
        for (i=0; i<N; i++)
        {
            if (this.p[i].equals(portaCd.p[i]))
            {
                num++;
            }

        }
        return num;
    }

    public static void main(String[] args)
    {

        Cd cd1 = new Cd("cd1", "Zhuo", 5, 20 );
        Cd cd2 = new Cd("cd2", "Zhuo", 10, 30 );
        Cd cd3 = new Cd("cd3", "Zhuo", 8, 25 );
        PortaCd portaCd1 = new PortaCd();

        portaCd1.setCd(cd1, 0);
        portaCd1.setCd(cd2, 1);
        portaCd1.setCd(cd3, 2);
        System.out.println(portaCd1.getCd(0).toString());

        Cd cdtest1 = new Cd(portaCd1.getCd(1));
        System.out.println(cdtest1.toString());

        System.out.println("i numeri di cd presenti nel portacd sono "+ portaCd1.getN());


        System.out.println("la posizione del titolo si trova nella posizione: " + portaCd1.cercaCdPerTitolo("cd3"));

        System.out.println(portaCd1.toString());

        PortaCd portaCd2 = new PortaCd(portaCd1);
        System.out.println("i portacd in comune sono: " + portaCd1.confrontaCollezione(portaCd2));

        portaCd1.killCd(1);
        System.out.println(portaCd1.getCd(1).toString());
    }


}

