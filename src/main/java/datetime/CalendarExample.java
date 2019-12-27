package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(time);

        Date date = new Date();
        System.out.println(date);
//        date.getTime();

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        int hour = cal.get(Calendar.HOUR_OF_DAY);
        System.out.println("Hour = " + cal.get(Calendar.HOUR));
        System.out.println("Hour24 = " + hour);

        int month = cal.get(Calendar.MONTH);
        System.out.println("Month = " + month);

        int maxDay = cal.getMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Max DAY = " + maxDay);

//        cal.add(Calendar.YEAR, -5);
        cal.roll(Calendar.DAY_OF_MONTH, 5);

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));

        Calendar today = Calendar.getInstance();
        Calendar today2 = Calendar.getInstance();

        System.out.println(today.before(cal));
        System.out.println(today.after(cal));
        System.out.println(cal.compareTo(today));

        System.out.println(cal.getTime());

        SimpleDateFormat stf = new SimpleDateFormat();
        String str = stf.format(today.getTime());
        stf.applyPattern("dd/MM/YY HH:mm:ss");
        System.out.println(str);

//        str = stf.format(today.getTime());
//        System.out.println(str);

    }
}
