package lections.lesson6.enums;

public class Application {

    public static void main(String[] args) {
        DayOfWeek monday = DayOfWeek.SUNDAY;

        Colors colors = Colors.GREEN;
        System.out.println(colors.getDescription());

        System.out.println(whatDayIs(monday).getDescription());

        // Возвращает объект enum-а
        DayType type = DayType.valueOf("WORKING");

        // Массив значений
        DayType[] dayTypes = DayType.values();

        // Индекс объекта в enum
        int index = monday.ordinal();

        Colors red = Colors.getByDescription("красный");
        Colors invalid = Colors.getByDescription("синий");

        System.out.println();


        System.out.println(InternationalDayOfWeek.SATURDAY.getEnglishDescription());

        InternationalDayOfWeek day = InternationalDayOfWeek.THURSDAY;
        String dayName = day.name();
        System.out.println(dayName);
    }

    public static DayType whatDayIs(DayOfWeek day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                return DayType.WORKING;
            case SATURDAY:
            case SUNDAY:
                return DayType.DAY_OFF;
            default: throw new IllegalStateException("Такого дня недели не существует");
        }
    }

}
