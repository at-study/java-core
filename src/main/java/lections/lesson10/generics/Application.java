package lections.lesson10.generics;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Object> objects = new MyArrayList<>();
        objects.add("aasdfasf");

        List<String> strings = new MyArrayList<>();
        strings.add("dsnjgjnsdg");
        strings.get(0).contains("dsnj");

        List<Cat> cats = new MyArrayList<>();
        cats.add(new Cat());
        cats.get(0).voice();

        List list = new MyArrayList2();
        list.add("jdsngjnsd");
        ((String) list.get(0)).contains("jds");


        List<Cat> animals = new AnimalArrayList<>();
        animals.add(new Cat());


    }

}
