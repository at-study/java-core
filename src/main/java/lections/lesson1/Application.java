package lections.lesson1;

public class Application {

    public static void main(String[] args) {
        int result = 3 / 5;
        double number = 3.0 / 5;
        System.out.println(result);
        System.out.println(number);

        float newNumber = 1f / 3;
        newNumber = newNumber * 3;
        System.out.println(newNumber);

        int three = 3;
        int four = 4;
        boolean compareResult = four > three;
        System.out.println(compareResult);

        boolean a = true;
        boolean b = false;
        boolean ab = a & b; //Оператор & - И
        boolean aorb = a | b; // Оператор | - ИЛИ

        System.out.println(ab);

        boolean condition = false;
        int ternary = condition ? 4 : 3;
        System.out.println(ternary);


        int x1 = 3;
        long x2 = 4;
        int r1 = x1 + (int) x2;

        int x = (int) (Math.random() * 100);
        System.out.println(x);

        double z = 0.97d;
        System.out.println((int) z);
    }

}
