package lections.lesson5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionApplication {

    public static void main(String[] args) throws ParseException {
        parseDate("01.01.1991");
    }

    public static void parseDate(String formattedDate) throws ParseException {
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(formattedDate);
        System.out.println("Дата успешно распознана: " + date1);
        System.out.println("Дальнейшее выполнение кода");
    }

}
