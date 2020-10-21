package lections.lesson8.interfaces;

import lections.lesson8.abstractclass.Animal;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        Human human = new Human();
        getFirstAnimal(human.pets);
    }

    public static Animal getFirstAnimal(List<Animal> pets) {
        return pets.get(0);
    }
}
