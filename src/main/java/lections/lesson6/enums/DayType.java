package lections.lesson6.enums;

public enum DayType {
    WORKING("Рабочий день"),
    DAY_OFF("Выходной день");

    private String description;

    public String getDescription() {
        return description;
    }

    DayType(String description) {
        this.description = description;
    }
}
