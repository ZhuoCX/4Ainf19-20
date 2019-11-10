package it.itis.cuneo;

/**
 * Created by inf.zhuoc2012 on 17/10/2019.
 */
public class Autore {

    //Attributi
    private String cognome;
    private String nome;
    private int annoNascita;

    //Metodi
    public Autore()
    {

    }

    public Autore(String cognome, String nome, int annoNascita)
    {
        this.cognome = cognome;
        this.nome = nome;
        this.annoNascita = annoNascita;
    }

    public Autore (Autore autore)
    {
        this.cognome = autore.getCognome();
        this.nome = autore.getNome();
        this.annoNascita = autore.getAnnoNascita();
    }

    public void setCognome (String cognome)
    {
        this.cognome = cognome;
    }

    public String getCognome ()
    {
        return this.cognome;
    }

    public void setAnnoNascita(int annoNascita)
    {
        this.annoNascita = annoNascita;
    }

    public int getAnnoNascita()
    {
        return annoNascita;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
}
