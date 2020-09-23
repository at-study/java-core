package lections.lesson3;

public class Application {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Барсик";
        cat.age = 3;

        cat.move();
        cat.voice();

        // Создание объектов
        // <Тип переменной> <Имя переменной> = new <Имя класса> (<Параметры>)

        Cat cat2 = new Cat();
        cat2.name = "Мурзик";
        cat2.age = 2;

        cat2.move();


        Cat cat3 = new Cat();
        cat3.move();


        Cat cat4 = new Cat("Леопольд", 6);
        cat4.move();


        Human vasya = new Human("Вася", 20, 80, "м");
        Human lena = new Human("Лена", 24, 50, "ж");

        vasya.addRelationship(lena);

    }

}
