package lections.lesson3;

public class Person {

    String name;
    int age;
    Person[] parents = new Person[2];
    Person[] children = new Person[10];
    int childrenAmount = 0;

    // vararg - произвольное количество аргументов

    Person(String name, int age, Person parent1, Person parent2, Person... children) {
        this.name = name;
        this.age = age;
        this.parents[0] = parent1;
        this.parents[1] = parent2;

        // Заполняем список детей созданного объекта
        // Переданными в переменной children объектами

        for (Person person : children) {
            children[childrenAmount++] = person;
        }

        // При создании объекта мы добавляем родителям в список детей данный объект
        // Родителям добавляется объект только в том случае, если родитель - не null.

        if (parent1 != null) {
            parent1.children[parent1.childrenAmount++] = this;
        }

        if (parent2 != null) {
            parent2.children[parent2.childrenAmount++] = this;
        }

    }


}
