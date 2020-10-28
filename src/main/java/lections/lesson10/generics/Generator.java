package lections.lesson10.generics;

import lections.lesson9.animals.Animal;

public class Generator {

    public <T extends Animal> T getRandomAnimal() {
        return (T) new Cat();
    }

}
