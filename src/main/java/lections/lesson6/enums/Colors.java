package lections.lesson6.enums;

public enum Colors {
    RED("красный"),
    YELLOW("желтый"),
    GREEN("зеленый");

    private String description;

    public String getDescription() {
        return description;
    }

    Colors(String description) {
        this.description = description;
    }

    public static Colors getByDescription(String description) {
        Colors[] all = Colors.values();
        for (Colors color : all) {
            if (color.getDescription().equals(description))
                return color;
        }
        return null;
    }
}
