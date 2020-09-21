package lections.lesson2;

public class Strings {

    public static void main(String[] args) {

        // Объявление строки
        String string = "Строка";
        String string1 = "Строка";

        boolean areStringsEqual = string == string1;
        boolean areStringsEqual2 = string.equals(string1);
        System.out.println(areStringsEqual);
        System.out.println(areStringsEqual2);

        // Получение символа из строки
        char c = string.charAt(2);
        System.out.println(c);

        // Длина строки
        int length = string.length();
        System.out.println(length);

        boolean startsWith = string.startsWith("Стро");
        boolean endsWith = string.endsWith("ока");
        boolean contains = string.contains("рок");


        System.out.println(startsWith + " " + endsWith + " " + contains);

        String format = String.format("%s %s", string, string1); // ==    string + " " + string1;
        System.out.println(format);
        // %s - строка. %d - целое число. %f - число с плавающей точкой. %b - boolean.
        int radius = 1;
        Strings instance = new Strings();

        System.out.println(String.format("Площадь круга с радиусом %d равна %.4f", radius, instance.getSquare(radius)));


        String passport = "1452 639452"; // 4 цифры пробел 6 цифр
        boolean matches = passport.matches("^(\\d{4} \\d{6})$");
        System.out.println(matches);

    }

    double getSquare(int radius) {
        return Math.PI * radius * radius;
    }

}
