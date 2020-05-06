public class ThreadDecrementatore extends Thread  {
    private Main main;
    private int contnum;

    public ThreadDecrementatore(Main main){
        this.main = main;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public int getContnum() {
        return contnum;
    }

    public void setContnum(int contnum) {
        this.contnum = contnum;
    }

    public void run()
    {


        while (main.getNumero() >= 1)
        {
            main.getSemaforo().up();
            main.setNumero(main.getNumero()-1);
            contnum++;
            main.getSemaforo().down();

        }

    }
}
