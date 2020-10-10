package lections.lesson6faq;

import java.util.Date;

public class StringBuilderApplication {

    public static void main(String[] args) {

        long start = new Date().getTime();

        String string = "Строка";
        string += "123";

        for (int i = 0; i < 25000; i++) {
            string += i;
        }

        long checkPoint = new Date().getTime();

        StringBuilder sb = new StringBuilder("Строка");
        sb.append("123");

        for (int i = 0; i < 25000; i++) {
            sb.append(i);
        }

        String result = sb.toString();

        long end = new Date().getTime();

        long operation1 = checkPoint - start;
        long operation2 = end - checkPoint;

        System.out.println(operation1);
        System.out.println(operation2);
    }

}
