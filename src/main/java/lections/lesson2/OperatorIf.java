package lections.lesson2;

public class OperatorIf {

    public static void main(String[] args) {
        boolean condition = false;

        // Объявление ветвления:
        if (condition) { // if (только boolean)
            System.out.println(String.format("Условие: %b", condition));
            System.out.println("2");
            System.out.println("3");
            // System.out.println("Условие: " + condition);
        } else {
            System.out.println("Блок Else");
        }

        if (condition)
            System.out.println(String.format("Условие: %b", condition));
        System.out.println("2");
        //else System.out.println("Блок Else");

        // Светофор:

        String color = "Красный";
        if (color.equals("Красный"))
            System.out.println("Нельзя переходить дорогу");
        else if (color.equals("Желтый"))
            System.out.println("Тоже нельзя переходить дорогу");
        else if (color.equals("Зеленый"))
            System.out.println("Можно переходить дорогу");
        else
            System.out.println("Неизвестный цвет");


        String result = (color.equals("Зеленый"))
                ? "Можно переходить дорогу"
                : "Переходить дорогу нельзя";
        System.out
                .println(result);

    }

}
