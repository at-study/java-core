package lections.lesson5;

public class StringFormat {

    static class Cat {
        private String name;
        private int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 3);
        String info = "Имя: " + cat.name + ", Возраст: " + cat.age;

        String infoFormat = String.format("Имя: %s, Возраст: %d%n", cat.name, cat.age);
        System.out.println(infoFormat);

        System.out.printf("Имя: %s, Возраст: %d%n", cat.name, cat.age);
        System.out.print(String.format("Имя: %s, Возраст: %d%n", cat.name, cat.age));
    }

}
