package lections.lesson7.inheritance;

public class Application {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.move();
        Bird bird = new Bird();
        bird.move();
        bird.fly();

        Animal bird2 = new Bird();
        // bird2.fly(); <- Нельзя, т.к. тип Animal
        Bird flyBird2 = (Bird) bird2;
        flyBird2.fly();
        Animal cat2 = new Cat();
        Bird catBird = (Bird) cat2; // ClassCastException
        Animal dog = new Dog();


        Human human = new Human();
        human.pets.add(cat);
        human.pets.add(dog);
        human.pets.add(bird);

        System.out.println();

        Animal animal = human.pets.get(1);
        Bird bird1 = (Bird) animal;
        bird1.fly();



        Animal owl1 = new Owl();
        Bird owl2 = new Owl();
        Owl owl3 = new Owl();

        ((Bird) owl1).fly();
        ((Owl) owl1).eyeFlip();


    }

}
