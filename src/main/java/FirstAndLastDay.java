import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FirstAndLastDay {
    public String calculateFirstandLAstday()
    {
        Calendar d=Calendar.getInstance();//calendar instance
        d.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        String pattern="EEE dd/MM/yyyy";//get the pattern
        SimpleDateFormat f=new SimpleDateFormat(pattern);
        String firstday=f.format(d.getTime());//get the first day
        for(int i=0;i<6;i++){// get the last day
            d.add(Calendar.DATE,1);

        }
        String lastday=f.format(d.getTime());
    System.out.println(firstday+lastday);
        return firstday+lastday;
    }
}
