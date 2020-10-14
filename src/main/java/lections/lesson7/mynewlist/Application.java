package lections.lesson7.mynewlist;

import lections.lesson7.polymorphism.Chicken;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Integer> integers = new MyArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        integers.get(4);

        List<String> strings = new MyArrayList<>();
        strings.add("abc");
        strings.add("def");

        strings.get(1);


        List<Object> objects = new MyArrayList<>();
        objects.add(1);
        objects.add("строка");
        objects.add(new Chicken());


    }

}
