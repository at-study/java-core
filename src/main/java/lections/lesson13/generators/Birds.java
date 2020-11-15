package lections.lesson13.generators;

public class Birds {

    public static class Owl extends Bird {
        @Override
        void fly() {
            System.out.println("Сова летит");
        }
    }

    public static class Chicken extends Bird {
        @Override
        void fly() {
            System.out.println("Курицы летать не умеют!");
        }
    }
}
