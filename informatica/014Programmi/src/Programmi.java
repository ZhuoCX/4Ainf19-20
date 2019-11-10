public class Programmi {

    //attributi
    private String denominazione, produttore, versione,sistemaOperativo;
    private int anno;

    //metodi

    public Programmi()
    {

    }

    public Programmi (String denominazione, String produttore, String versione, String sistemaOperativo, int anno)
    {
        this.denominazione = denominazione;
        this.produttore = produttore;
        this.versione = versione;
        this.sistemaOperativo = sistemaOperativo;
        this.anno = anno;
    }

    public Programmi (Programmi programmi)
    {
        this.denominazione = programmi.getDenominazione();
        this.produttore = programmi.getProduttore();
        this.versione = programmi.getVersione();
        this.sistemaOperativo = programmi.getSistemaOperativo();
        this.anno = programmi.getAnno();
    }

    public void setDenominazione(String denominazione)
    {
        this.denominazione = denominazione;
    }

    public String getDenominazione()
    {
        return denominazione;
    }

    public String getProduttore()
    {
        return produttore;
    }

    public void setProduttore(String produttore)
    {
        this.produttore = produttore;
    }

    public String getSistemaOperativo()
    {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo)
    {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getAnno()
    {
        return anno;
    }

    public void setAnno(int anno)
    {
        this.anno = anno;
    }

    public void setVersione(String versione)
    {
        this.versione = versione;
    }

    public String getVersione()
    {
        return versione;
    }

    public String toString()
    {
        return "Programmi:{ \"denominazione\": " + denominazione +
                " \"produttore\": " + produttore +
                " \"versione\": " + versione +
                " \"sistemaOperativo\": " + sistemaOperativo +
                " \"anno\": " + anno + "}";
    }

    public boolean compareAnno (Programmi programmi)
    {
        boolean verifica = false;
        if (this.anno == programmi.getAnno())
        {
            verifica = true;
        }
        else
        {
            verifica = false;
        }
        return verifica;
    }

    public boolean equals (Programmi programmi)
    {
        boolean equals = false;
        if (this.getDenominazione() == programmi.getDenominazione() &&
            this.getAnno() == programmi.getAnno() &&
            this.getProduttore() == programmi.getProduttore() &&
            this.getSistemaOperativo() == programmi.getSistemaOperativo() &&
            this.getVersione() == programmi.getVersione() )
        {
            equals = true;
        }
        return equals;

    }



}
