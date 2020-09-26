package lections.lesson3faq;

import java.util.Random;

public class BreakAndContinue {

    public static void main(String[] args) {
        boolean doBreak = false;
        boolean doContinue = false;


        for (int i = 0; i < 15; i++) {
            methodA();
            if (getRandomBoolean()) break;
            methodB();
        }
        // <- Перейдет на данную строку при выполнении break
        System.out.println();
        System.out.println();

        for (int i = 0; i < 15; i++) {
            // <- Перейдет на данную строку при выполнении continue.
            // При этом произойдет "i++"
            methodA();
            if (getRandomBoolean()) continue;
            methodB();
        }

    }

    public static boolean getRandomBoolean() {
        boolean result = new Random().nextInt(2) == 0;
        System.out.println(result);
        return result;
    }


    public static void methodA() {
        System.out.println("A");
    }

    public static void methodB() {
        System.out.println("B");
    }

}
