package lections.lesson9.fabric;

import lections.lesson9.animals.Animal;
import lections.lesson9.animals.HomeAnimal;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            animals.add(AnimalFabric.getRandomAnimal());
        }

        int count = 0;
        for (Animal animal : animals)
            if (animal instanceof HomeAnimal)
                count++;

        System.out.println(count);

    }

}
