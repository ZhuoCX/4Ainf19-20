package it.itis.cuneo;


public class Frazione {
    private int num;
    private int den;

    public Frazione(){
        super();
    }
    public Frazione(int num, int den){
        this.num = num;
        this.den = den;
    }

    public void setNum(int num){
        this.num = num;
    }

    public int getNum(){
        return num;
    }

    public void setDen(int den){
        this.den = den;
    }

    public int getDen(){
        return den;
    }

    //restituisce una stringa con lo stato dell'oggetto
    public String toString(){
        return "Frazione {num: " + num
                + ", den:" + den
                + "}";
    }

    public boolean eqauls(Frazione frazione){
        boolean sonoUguali = false;

        //this == frazione
        //serve per confrontare se due oggetti sono nella stessa area di memoria
        if ((this.num == frazione.getNum() && this.den == frazione.getDen())){
            sonoUguali = true;
        }
        return sonoUguali;
    }

    public static void main(String args[]){
        Frazione frazioneUnknown = new Frazione(2, 5);
        System.out.println(frazioneUnknown.toString());

        Frazione frazione1 = new Frazione(2, 5);
        System.out.println(frazione1.toString());

        boolean confrontoUguali = frazione1.equals(frazioneUnknown);
        System.out.println("Sono uguali?" + confrontoUguali);
    }

}
