package lections.lesson6.enums;

public enum InternationalDayOfWeek {
    MONDAY("Понедельник", "Monday", 1),
    TUESDAY("Вторник", "Tuesday", 2),
    WEDNESDAY("Среда", "Wednesday", 3),
    THURSDAY("Четверг", "Thursday", 4),
    FRIDAY("Пятница", "Friday", 5),
    SATURDAY("Суббота", "Saturday", 6),
    SUNDAY("Воскресенье","Sunday", 7);

    private String russianDescription;
    private String englishDescription;
    private int dayIndex;

    public String getRussianDescription() {
        return russianDescription;
    }

    public String getEnglishDescription() {
        return englishDescription;
    }

    public int getDayIndex() {
        return dayIndex;
    }

    InternationalDayOfWeek(String ru, String en, int dayIndex) {
        this.russianDescription = ru;
        this.englishDescription = en;
        this.dayIndex = dayIndex;
    }


}
