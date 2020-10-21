package lections.lesson8.abstractclass;

public class Cat extends HomeAnimal {

    public Cat(int age, int weight, String name) {
        super(age, weight, name);
    }

    public Cat() {
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }

    @Override
    public void move() {
        System.out.println("Кот гуляет сам по себе");
    }

    @Override
    public Animal getChild() {
        return new Cat();
    }
}
