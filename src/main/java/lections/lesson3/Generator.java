package lections.lesson3;

import java.util.Random;

public class Generator {

    static Cat generateYoungCat() {
        int age = new Random().nextInt(3);
        Cat cat = new Cat(age);
        return cat;
    }

    static Cat generateCat() {
        int age = new Random().nextInt(10) + 3;
        Cat cat = new Cat(age);
        return cat;
    }

    static Cat generateOldCat() {
        int age = new Random().nextInt(8) + 13;
        Cat cat = new Cat(age);
        return cat;
    }

}
