package lections.lesson6faq.lesson5task4;

import lections.lesson6faq.lesson5task4.exceptions.AgeTooHighException;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Cat[] cats = new Cat[10];
        for (int i = 0; i < cats.length; i++) {
            int randomAge = new Random().nextInt(101) - 50;
            try {
                Cat cat = new Cat("Имя", randomAge);
                cats[i] = cat;
            } catch (AgeTooHighException exception) {
                System.out.println("Слишком большой возраст для кота: " + randomAge);
                cats[i] = null;
            }
        }

        for (Cat cat : cats) {
            try {
                System.out.printf("Имя: %s, Возраст: %d%n", cat.getName(), cat.getAge());
            } catch (NullPointerException npe) {
                System.out.println("Ошибка вывода данных");
            }
        }
    }
}
