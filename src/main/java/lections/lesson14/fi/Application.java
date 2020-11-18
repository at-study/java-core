package lections.lesson14.fi;

public class Application {

    public static void main(String[] args) {
        OneMethodInterface<Integer, Integer, String, Boolean> function =
                (num1, num2, str) -> str.contains(String.valueOf(num1)) && !str.contains(String.valueOf(num2));

        boolean test1 = function.singleMethod(10, 15, "Строка10строка");
        boolean test2 = function.singleMethod(10, 15, "Строка15строка");
        boolean test3 = function.singleMethod(10, 15, "Строка1015рока");
        boolean test4 = function.singleMethod(10, 15, "Строкастрока");

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);

    }

}
