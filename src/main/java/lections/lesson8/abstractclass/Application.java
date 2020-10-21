package lections.lesson8.abstractclass;

public class Application {

    public static void main(String[] args) {
        HomeAnimal cat = new Cat(5,5,"Барсик");
        Animal dog = new Dog(3,3,"Шарик");

        cat.setAge(15);
        cat.setName("Мурзик");


        Animal childDog = dog.getChild();

        System.out.println();

        // Animal animal = new Animal();
        // Объект абстрактного класса создать нельзя
    }

}
