import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FirstAndLastDay {
    public String calculateFirstandLAstday()
    {
        Calendar d=Calendar.getInstance();
        d.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        String pattern="EEE dd/MM/yyyy";
        SimpleDateFormat f=new SimpleDateFormat(pattern);
        String firstday=f.format(d.getTime());
        for(int i=0;i<6;i++){
            d.add(Calendar.DATE,1);

        }
        String lastday=f.format(d.getTime());
    System.out.println(firstday+lastday);
        return firstday+lastday;
    }
}
