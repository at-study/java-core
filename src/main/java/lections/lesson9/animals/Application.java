package lections.lesson9.animals;

public class Application {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        HomeAnimal cat2 = new Cat();
        Animal cat3 = new Lion();

        if (cat3 instanceof HomeAnimal)
            ((HomeAnimal) cat3).getName();
        //((HomeAnimal) cat3);

        Animal lion = new Lion();
        System.out.println(lion instanceof Animal);
        System.out.println(lion instanceof WildAnimal);
        System.out.println(lion instanceof Lion);

        System.out.println(lion instanceof Cat);
        System.out.println(lion instanceof HomeAnimal);

        System.out.println(lion instanceof Object);


    }

}
