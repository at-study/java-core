package lections.lesson4.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateApplication {

    public static void main(String[] args) throws ParseException {
        Date date1 = new Date();
        Date date3 = new Date(10000000L);

        System.out.println(date1);
        System.out.println(date3);

        long currentMillis = date1.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


        Date current = new Date();
        String today = sdf.format(current);
        Date todayDate = sdf.parse(today);
        todayDate.before(current);
        System.out.println(todayDate);


        Date date2 = sdf.parse("2018-12-05");


    }


}
