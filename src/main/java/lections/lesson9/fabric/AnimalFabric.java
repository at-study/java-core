package lections.lesson9.fabric;

import lections.lesson9.animals.*;

import java.util.Random;

public class AnimalFabric {

    public static Animal getRandomAnimal() {
        int randomPercent = new Random().nextInt(100);
        if (randomPercent >= 0 && randomPercent < 10)
            return new Cat();
        if (randomPercent >= 10 && randomPercent < 30)
            return new Dog();
        if (randomPercent >= 30 && randomPercent < 60)
            return new Lion();
        if (randomPercent >= 60 && randomPercent < 100)
            return new Tiger();
        throw new IllegalStateException("unexpected random value: " + randomPercent);
        //if (new Random().nextBoolean()) return new Cat();
        //if (new Random().nextBoolean()) return new Dog();
        //return new Lion();
    }


}
