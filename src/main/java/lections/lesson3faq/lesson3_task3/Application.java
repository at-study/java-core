package lections.lesson3faq.lesson3_task3;

public class Application {

    public static void main(String[] args) {
        Human valeriy = new Human("Валерий", 60, null, null);
        Human alexandra = new Human("Александра", 59, null, null);
        Human ivan = new Human("Иван", 58, null, null);

        Human sergey = new Human("Сергей", 35, valeriy, alexandra);
        Human marina = new Human("Марина", 34, ivan, null);

        Human vitaliy = new Human("Виталий", 15, sergey, marina);
        Human elena = new Human("Елена", 12, sergey, marina);
        if (elena.father != null) {
            printHumanInfo(elena.father.father);
            printHumanInfo(elena.father.mother);
        }
        if (elena.mother != null) {
            printHumanInfo(elena.mother.father);
            printHumanInfo(elena.mother.mother);
        }
    }

    static void printHumanInfo(Human human) {
        if (human != null)
            System.out.printf("Имя: %s, возраст: %d%n", human.name, human.age);
    }

}
