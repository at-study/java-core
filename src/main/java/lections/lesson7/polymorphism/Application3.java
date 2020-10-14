package lections.lesson7.polymorphism;

public class Application3 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal bird = new Bird();
        Animal chicken = new Chicken();

        animal.move();
        animal.voice();

        bird.move();
        bird.voice();

        chicken.move();
        chicken.voice();

        //  ((Bird) chicken).fly();
        // Курицы летать не умеют

        Object string1 = "строка1";
        Object string2 = "строка1";
        Object int1 = 5;

        System.out.println();

        letBirdFly((Bird) bird);
        letBirdFly((Chicken) chicken);
    }


    public static void letBirdFly(Bird bird) {
        bird.fly();
    }

}
