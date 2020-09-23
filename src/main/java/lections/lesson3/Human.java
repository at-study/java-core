package lections.lesson3;

public class Human {

    String name;
    int age;
    int weight;
    String sex;
    Human[] relations = new Human[5];

    //int currentRelationsAmount = 0;

    Human(String name1, int age1, int weight1, String sex1) {
        name = name1;
        age = age1;
        weight = weight1;
        sex = sex1;
    }


    // Вася - это текущий объект
    // Лена - это параметр otherHuman
    void addRelationship(Human otherHuman) {
        //relations[currentRelationsAmount++] = otherHuman;

        for (int i = 0; i < relations.length; i++) {
            if (relations[i] == null) {
                relations[i] = otherHuman;
                System.out.printf("К человеку по имени %s добавлен знакомый с именем %s%n", name, otherHuman.name);
                break;
            }
            if (relations[i] == otherHuman)
                return;
        }
        otherHuman.addRelationship(this);

    }


}
