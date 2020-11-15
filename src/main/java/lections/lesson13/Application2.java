package lections.lesson13;

public class Application2 {

    public static class Cat extends Animal {
        @Override
        void move() {
            System.out.println("Кот идет гулять");
        }

        @Override
        void voice() {
            System.out.println("Мяу");
        }
    }

    public static void main(String[] args) {
        final int[] count = {0};
        Animal cat = new Animal() {
            @Override
            public void move() {
                System.out.println("Кот идет гулять");
                count[0]++;
            }

            @Override
            public void voice() {
                System.out.println("Мяу");
            }
        };

        cat.move();
        cat.move();
        cat.move();
        cat.move();
        System.out.println(count[0]);
        cat.voice();
    }

}
