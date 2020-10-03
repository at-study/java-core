package tests;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.regex.Pattern;

class Debug {

    @Test
    void debugTest() {

        boolean stringMatches = "строка".matches("[а-я]{6}");

        boolean stringMatches1 = Pattern.matches("[а-я]{6}", "строка");

        System.out.println(stringMatches);
        System.out.println(stringMatches1);

        Date date1 = new Date();
        Date date2 = new Date();
       // boolean result = date1 > date2;

    }
}
