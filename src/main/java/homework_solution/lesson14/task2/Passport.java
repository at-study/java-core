package homework_solution.lesson14.task2;

public class Passport {
    private String series;
    private String number;

    public Passport(String series, String number) {
        this.series = series;
        this.number = number;
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "series='" + series + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
