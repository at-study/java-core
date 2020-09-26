package lections.lesson3faq;

import java.util.Arrays;

public class Lesson2Task4 {

    public static void main(String[] args) {
        String first = "post";
        String second = "get";
        String result = "";

        char[] firstChars = first.toCharArray();
        Arrays.sort(firstChars);

        for (char ch : firstChars) {
            if (result.contains(String.valueOf(ch)))
                continue;
            if (second.contains(String.valueOf(ch)))
                result += ch;
        }

        System.out.println(result);

    }

}
