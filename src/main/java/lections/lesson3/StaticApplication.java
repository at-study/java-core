package lections.lesson3;

public class StaticApplication {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 2);
        Cat cat2 = new Cat();
        Cat cat3 = new Cat("Мурзик", 3);

        Cat.printCount();

        String.valueOf(15);


        Cat youngCat = Generator.generateYoungCat();
        Cat cat = Generator.generateCat();
        Cat oldCat = Generator.generateOldCat();

        System.out.println();

    }

}
