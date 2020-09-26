package lections.lesson3faq;

import java.util.Random;

public class RandomQuestions {

    public static void main(String[] args) {

        // Генерирует случайное число от 0 до 19 включительно.
        new Random().nextInt(20);

        // Число от 55 до 68 включительно.
        // 55 + (от 0 до 13 включительно)
        int random = new Random().nextInt(14) + 55;

    }


}
