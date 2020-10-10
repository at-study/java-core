package lections.lesson6faq.lesson4task4;

public class Passport {
    private static Passport[] uniquePassports = new Passport[50];
    private static int count = 0;

    private String series;
    private String number;

    public Passport setSeries(String series) {
        if (series.matches("^\\d{4}$") && number == null)
            this.series = series;
        if (number != null && isUnique(series, number)) {
            this.series = series;
            uniquePassports[count++] = this;
        }
        return this;
    }

    public Passport setNumber(String number) {
        if (number.matches("^\\d{6}$") && series == null)
            this.number = number;
        if (series != null && isUnique(series, number)) {
            this.number = number;
            uniquePassports[count++] = this;
        }
        return this;
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }

    private static boolean isUnique(String series, String number) {
        for (Passport unique : uniquePassports) {
            if (unique == null) return true;
            else {
                if (unique.getNumber().equals(number) && unique.getSeries().equals(series)) return false;
            }
        }
        return true;
    }
}
