package lections.lesson1.tasks;

public class NumberOdd {

    public static void main(String[] args) {
        NumberOdd instance = new NumberOdd();
        System.out.println(instance.isOdd(0));
        System.out.println(instance.isOdd(1));
        System.out.println(instance.isOdd(19));
        System.out.println(instance.isOdd(22));

    }

    boolean isOdd(int number) {
        return number % 2 == 0;
    }
}
