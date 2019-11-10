package it.itis.cuneo;

/**
 * Created by inf.zhuoc2012 on 17/10/2019.
 */
public class CasaEditrice {

    //Attributi
    private  String ragioneSociale, luogo;
    private  int annoFondazioni;

    public CasaEditrice ()
    {

    }

    public CasaEditrice(String regioneSociale, String luogo, int annoFondazioni)
    {
        this.ragioneSociale = regioneSociale;
        this.luogo = luogo;
        this.annoFondazioni = annoFondazioni;
    }

    public CasaEditrice(CasaEditrice casaEditrice)
    {
        this.ragioneSociale = casaEditrice.getRagioneSociale();
        this.luogo = casaEditrice.getLuogo();
        this.annoFondazioni = casaEditrice.getAnnoFondazioni();
    }

    public int getAnnoFondazioni()
    {
        return annoFondazioni;
    }

    public void setAnnoFondazioni(int annoFondazioni)
    {
        this.annoFondazioni = annoFondazioni;
    }

    public String getLuogo()
    {
        return luogo;
    }

    public void setLuogo(String luogo)
    {
        this.luogo = luogo;
    }

    public String getRagioneSociale()
    {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale)
    {
        this.ragioneSociale = ragioneSociale;
    }
}
