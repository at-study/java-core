package lections.lesson6.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("строка3");
        set.add("строка1");
        set.add("строка5");
        set.add("строка3");



        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String setItem = iterator.next();
            System.out.println(setItem);
        }

        boolean contains = set.contains("строка1");

        System.out.println();

        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat(3, "Барсик"));
        cats.add(new Cat(3, "Барсик"));
        System.out.println();
    }

}
