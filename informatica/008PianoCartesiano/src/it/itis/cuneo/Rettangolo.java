package it.itis.cuneo;

/**
 * Created by inf.zhuoc2012 on 07/10/2019.
 */
public class Rettangolo {

    //Attributi
    private Segmento segmentoAlto;
    private Segmento segmentoBasso;
    private Segmento segmentoDestro;
    private Segmento segmentoSinistra;

    public Rettangolo()
    {
     super();
    }

    public Rettangolo(Segmento segmentoAlto, Segmento segmentoBasso, Segmento segmentoDestro, Segmento segmentoSinistra )
    {
        this.segmentoAlto = new Segmento(segmentoAlto);
        this.segmentoBasso = new Segmento(segmentoBasso);
        this.segmentoDestro = new Segmento(segmentoDestro);
        this.segmentoSinistra = new Segmento(segmentoSinistra);
    }

    public  Rettangolo (Rettangolo rettangolo)
    {
        this.segmentoAlto =new Segmento(rettangolo.getSegmentoAlto());
        this.segmentoBasso =new Segmento(rettangolo.getSegmentoBasso());
        this.segmentoDestro =new Segmento(rettangolo.getSegmentoDestro());
        this.segmentoSinistra =new Segmento(rettangolo.getSegmentoSinistra());
    }

    public void setSegmentoAlto(Segmento segmentoAlto)
    {
        this.segmentoAlto = segmentoAlto;
    }

    public Segmento getSegmentoAlto()
    {
        return this.segmentoAlto;
    }

    public Segmento getSegmentoBasso()
    {
        return this.segmentoBasso;
    }

    public void setSegmentoBasso(Segmento segmentoBasso)
    {
        this.segmentoBasso = segmentoBasso;
    }

    public Segmento getSegmentoDestro()
    {
        return this.segmentoDestro;
    }

    public Segmento getSegmentoSinistra()
    {
        return this.segmentoSinistra;
    }

    public void setSegmentoDestro(Segmento segmentoDestro)
    {
        this.segmentoDestro = segmentoDestro;
    }

    public void setSegmentoSinistra(Segmento segmentoSinistra)
    {
        this.segmentoSinistra = segmentoSinistra;
    }

    public boolean equals (Rettangolo rettangolo)
    {
        boolean euqals = false
        if (this.segmentoAlto() == rettangolo.getSegmentoAlto()
                && this.segmentoBasso() == rettangolo.getSegmentoBasso()
                && this.segmentoDestro() == rettangolo.getSegmentoDestro()
                && this.getSegmentoSinistra() == rettangolo.getSegmentoSinistra())
        {
            euqals = true
        }
        return equals()
    }

    public String toString()
    {
        return "{Segmenti -->\"segmentoAlto\"

    }
}
