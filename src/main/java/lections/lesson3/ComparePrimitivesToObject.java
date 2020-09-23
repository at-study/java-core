package lections.lesson3;

public class ComparePrimitivesToObject {

    public static void main(String[] args) {
        int a = 2;
        int b = a;

        a = 3;
        System.out.println(b);


        Cat cat1 = new Cat("Барсик", 1);
        Cat cat2 = cat1;

        cat1.name = "Мурзик";
        System.out.println(cat2.name);

    }

}
