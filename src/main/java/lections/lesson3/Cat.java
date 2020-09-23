package lections.lesson3;

public class Cat {

    String name;
    int age;
    int catNumber;

    static int count = 0;

    Cat() {
        name = "Безымянный кот";
        age = 5;
        catNumber = ++count;
    }

    Cat(String name1, int age1) {
        name = name1;
        age = age1;
        catNumber = ++count;
    }

    Cat(int age) {
        this.age = age;
        this.name = "Безымянный кот";
        catNumber = ++count;
    }

    static void printCount() {
        System.out.println("Количество котов: " + count);
    }

    void move() {
        System.out.println(name + " пошел гулять");
    }

    void voice() {
        System.out.println("Мяу");
    }

    public void finalize() {
        Counter.finalizeCount++;
    }

}
