package lections.lesson13.generators;

import java.util.Random;

public class Application2 {

    public static void main(String[] args) {

        final int[] chickenCount = {0};

        Generatable<Bird> generator = new Generatable<Bird>() {

            // 20% - курица
            // 80% - сова

            @Override
            public Bird generate() {
                if (new Random().nextInt(100) < 20) {
                    chickenCount[0]++;
                    return new Birds.Chicken();
                } else {
                    return new Birds.Owl();
                }
            }

        };

        for (int i = 0; i < 100; i++) {
            Bird bird = generator.generate();
        }

        System.out.println(chickenCount[0]);


    }

}
