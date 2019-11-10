import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by inf.zhuoc2012 on 04/11/2019.
 */
public class Calendario {
    public Calendario(){

    }

    public static void main(String[] args) {
        System.out.println("oggi1: " + new Date());

        Date dOggi = new Date();
        System.out.println("oggi2: " + dOggi);

        String strData;
        strData = InputOutputUtility.leggiNome("Inserisci la data (dd/mm/yyyy): ");
        Calendar cData = Calendar.getInstance();

        //strData -> dataTastiera (String ->Date)
        /*
        Date dataTastiera =
        */
        Date datatastiera = null;
        try {
            datatastiera = InputOutputUtility.dfDay.parse(strData);
        }catch (ParseException e){
            e.printStackTrace();
        }




        //strData -> dataTastiera (String ->Calendar in che formato)
        Calendar cdata2 = InputOutputUtility.convertiDataOraToCalendar(strData, InputOutputUtility.dfDay);

        /*
        cData.setTime(cData.getTime());
        cData.setTime(new Date());
        */
    }
}
