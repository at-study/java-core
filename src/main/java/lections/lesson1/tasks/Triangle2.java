package lections.lesson1.tasks;

public class Triangle2 {

    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        int c = 4;
                             //booolean && boolean && boolean
        boolean isPossible = (a + b > c) && (a + c > b) && (b + c > a);
        if (isPossible) System.out.println("Треугольник возможно построить");
        else System.out.println("Треугольник невозможно построить");
    }

}
