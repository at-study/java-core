package lections.lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Application2 {

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Cat cat = new Cat("Кот № " + i, new Random().nextInt(10), new Random().nextInt(10));
            cats.add(cat);
        }
        Collections.sort(cats);
        System.out.println();

        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
