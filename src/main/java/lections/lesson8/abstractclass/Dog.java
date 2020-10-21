package lections.lesson8.abstractclass;

public class Dog extends HomeAnimal {

    public Dog(int age, int weight, String name) {
        super(age, weight, name);
    }

    public Dog() {
    }

    @Override
    public void voice() {
        System.out.println("Гав");
    }

    @Override
    public void move() {
        System.out.println("Собаки любят гулять с хозяевами");
    }

    @Override
    public Animal getChild() {
        return new Dog();
    }

}
