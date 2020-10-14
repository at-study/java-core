package lections.lesson7.inheritance;

public class Animal {

    protected String name;
    protected int age;

    public void move() {
        System.out.println("Ходить");
    }

    public void eat() {
        System.out.println("Есть");
    }

    public void see() {
        System.out.println("Видеть");
    }

    private void animalSpecificMethod() {
        System.out.println("Метод характерен для животного");
    }
}
