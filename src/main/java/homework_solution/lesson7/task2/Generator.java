package homework_solution.lesson7.task2;

import java.util.Random;

public class Generator {

    public static String generateName(int length) {
        String pattern = "йфяцычвсукмапиентрьоглдщ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(pattern.charAt(new Random().nextInt(pattern.length())));
        }
        return sb.toString();
    }

    public static String generateId(int length) {
        String pattern = "0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(pattern.charAt(new Random().nextInt(pattern.length())));
        }
        return sb.toString();
    }
}
