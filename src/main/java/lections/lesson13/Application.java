package lections.lesson13;

public class Application {

    public static void main(String[] args) {
        class Cat extends Animal {
            String name;
            int age;

            @Override
            void move() {
                System.out.println("Кот идет гулять");
            }

            @Override
            void voice() {
                System.out.println("Мяу");
            }

            @Override
            public String toString() {
                return name + ":" + age;
            }
        }
        Cat cat = new Cat();
        cat.name = "Барсик";
        cat.age = 5;
        method(cat);
    }

    private static void method(Object object) {
        Animal cat = (Animal) object;
        System.out.println(cat.toString());
        cat.voice();
        cat.move();
    }

}
