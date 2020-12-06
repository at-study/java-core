package lections.lesson15faq2;

import java.util.Random;

public class TernaryOperators {

    public static void main(String[] args) {
        String ternaryString = (5 >= 3)
                ? "true"
                : "false";

        for (int i = 0; i < 10; i += 2) {

        }

        boolean a = new Random().nextBoolean();
        boolean b = new Random().nextBoolean();

        while (a != b) {
            // код
        }

        for (; a != b; ) {
            // код
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (someOperationsA()) {
                    continue;
                }
                someOperationsB();
            }
        }

    }

    private static boolean someOperationsA() {
        return new Random().nextBoolean();
    }

    private static void someOperationsB() {

    }
}
