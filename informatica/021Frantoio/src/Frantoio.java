import java.util.ArrayList;
import java.util.List;

/**
 * Created by inf.zhuoc2012 on 23/11/2019.
 */
public class Frantoio {

    //List è un'interfaccia di ArrayList<E>
    //ArrayList<E> implementa List<E>
    private List<Oliva> listaOlive;

    public Frantoio(List<Oliva> listaOlive) {
        this.listaOlive = new ArrayList<Oliva>();
    }

}
