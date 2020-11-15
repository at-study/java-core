package lections.lesson13.generators;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Generatable<String> generator = new Generatable<String>() {
            @Override
            public String generate() {
                return "randomString";
            }
        };
        Generatable<Integer> randomNumberGenerator = new Generatable<Integer>() {
            @Override
            public Integer generate() {
                return new Random().nextInt(51) + 50;
            }
        };


        System.out.println(generator.generate());
        System.out.println(randomNumberGenerator.generate());
    }

}
