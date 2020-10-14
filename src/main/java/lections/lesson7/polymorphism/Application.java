package lections.lesson7.polymorphism;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        dog.voice();

        Animal animal1 = new Animal();
        animal1.voice();
        Human human = new Human();
        for (int i = 0; i < 5; i++) {
            Animal animal = new Random().nextBoolean()
                    ? new Dog()
                    : new Cat();
            human.pets.add(animal);
        }

        Human human2 = new Human();
        human2.pets.add(new Cat());
        human2.pets.add(new Dog());
        human2.pets.add(new Cat());
        human2.pets.add(new Dog());

        for (Animal animal : human2.pets) {
            animal.voice();
        }


        /*
        for (Animal animal : human.pets) {
            animal.voice();
        }

         */

    }

}
