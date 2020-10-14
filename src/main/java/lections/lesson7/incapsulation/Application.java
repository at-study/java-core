package lections.lesson7.incapsulation;

import lections.lesson3.Cat;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Human human = new Human("Иван", 23);

        final List<String> strings = new ArrayList<>();
        strings.add("строка1");

        final Cat cat = new Cat();
        cat.name = "Барсик";

        String string1 = "abcdef";
        string1 = "dgnjg";


    }

}
