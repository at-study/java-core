package lections.lesson3;

public class PersonFamily {

    public static void main(String[] args) {
        Person arseniy = new Person("Арсений", 55, null, null);
        Person aksinya = new Person("Аксинья", 54, null, null);

        Person valeriy = new Person("Валерий", 35, arseniy, aksinya);
        Person elena = new Person("Елена", 25, arseniy, aksinya);

        Person mikhail = new Person("Михаил", 15, valeriy, null);
        Person viktoriya = new Person("Виктория", 12, valeriy, null);

        System.out.println();
    }

}
