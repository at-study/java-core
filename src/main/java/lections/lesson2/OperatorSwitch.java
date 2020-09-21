package lections.lesson2;

public class OperatorSwitch {

    public static void main(String[] args) {

        // Switch
        String color = "Красный";

        switch (color) {
            default:
                System.out.println("Неизвестный цвет");
            case "Красный":
                System.out.println("Стоять");
                break;
            case "Желтый":
                System.out.println("Приготовиться");
                break;
            case "Зеленый":
                System.out.println("Ехать");

        }

        System.out.println();

        switch (color) {
            case "Красный":
            case "Желтый":
                System.out.println("Ехать нельзя");
                break;
            case "Зеленый":
                System.out.println("Ехать можно");
                break;
            default:
                System.out.println("Неизвестный цвет");
                break;
        }





    }

}
