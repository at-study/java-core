package lections.lesson9faq;

import java.util.Random;

public class StringBuilderApplication {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("0123").append("456").append("789").delete(3, 7); // 0123456789
        String result = sb.toString();
        System.out.println(result);

        System.out.println(randomString(10));
        System.out.println(randomString(3));
    }

    private static String randomString(int length) {
        String pattern = "0123456789qazwsxedcrfvtgbyhnujmikolp";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomPatternIndex = new Random().nextInt(pattern.length());
            sb.append(pattern.charAt(randomPatternIndex));
        }
        return sb.toString();
    }

}
