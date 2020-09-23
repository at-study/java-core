package lections.lesson3;

public class ObjectLifetime {

    public static void main(String[] args) {
       // Cat cat = new Cat("Барсик", 3);
       // cat = null;


        for (int i = 0; i < 1000000; i++) {
            Cat cat = new Cat();
            cat = null;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println();
        }

        System.out.println(Counter.finalizeCount);

    }

}
