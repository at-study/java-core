package homework_solution.lesson7.task2;

public class Passport {
    private String series;
    private String number;

    public Passport() {
        series = Generator.generateId(4);
        number = Generator.generateId(6);
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }
}
