package lections.lesson8;

public class Application {

    public static void main(String[] args) {
        Object cat1 = new Cat("Барсик", 5, 3);
        Cat cat2 = new Cat("Барсик", 5, 3);

        Boolean same = cat1.equals(cat2);
        System.out.println(same);

        System.out.println(cat1);
        System.out.println(cat2);

        Object human = new Human(cat2, "Иванов", "Петр");
        System.out.println(human);
    }

    @Override
    public String toString() {
        return "Application{}";
    }
}
