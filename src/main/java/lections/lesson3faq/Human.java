package lections.lesson3faq;

public class Human {

    String name = "Test";

    int variable = 5;

    public Human(String name) {
        this.name = name;
        // Локальная переменная будет прятать переменную объекта
        int variable = 3;
        // Здесь будет обращение к int variable = 3 (локальной переменно), а не к переменной объекта.
        variable += 4;

    }

    public static void main(String[] args) {
        Human human = new Human("Имя");
    }
}
