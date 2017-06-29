package testUSD;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Вадим on 13.06.2017.
 */
public class DayCalc {

    public static Date calcDays(Date start, int days, Date [] weekend){
        GregorianCalendar calendar = new GregorianCalendar();
        GregorianCalendar calendar1 = new GregorianCalendar();
        GregorianCalendar calendar2 = new GregorianCalendar();
        calendar.setGregorianChange(start);
        calendar1.setGregorianChange(weekend[0]);
        calendar2.setGregorianChange(weekend[1]);

        int restDays = 0;
        System.out.println(restDays);
        calendar.roll(Calendar.DATE,days);
        calendar.roll(Calendar.DATE,-1);
        return calendar.getTime();


    }

    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-d");
        Date date = new Date();
        System.out.println(format.format(date));
        System.out.println(format.format(calcDays(date, 0, new Date[]{date, date})));
    }
}
