package lections.lesson10.generics;

import lections.lesson9.animals.Animal;

import java.util.ArrayList;

public class AnimalArrayList<T extends Animal> extends ArrayList<T> {

    @Override
    public T get(int index) {
        T animal = super.get(index);
        animal.voice();
        return animal;
    }

    @Override
    public boolean add(T t) {
        t.voice();
        return super.add(t);
    }
}
