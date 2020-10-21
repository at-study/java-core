package lections.lesson8;

import java.util.Arrays;

public class Application3 {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 2, 5),
                new Cat("Мурзик", 3, 11),
                new Cat("Матильда", 7, 2),
                new Cat("Леопольд", 1, 3),
                new Cat("Базилио", 11, 4),
        };

        Arrays.sort(cats);

        for (Cat cat : cats)
            System.out.println(String.format("Имя: %s, Возраст: %d, Вес: %d", cat.getName(), cat.getAge(), cat.getWeight()));

    }
}
