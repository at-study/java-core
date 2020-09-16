package homework_solution.lesson10.task4.model;

import homework_solution.lesson10.task4.helpers.Property;
import homework_solution.lesson10.task4.helpers.StringGenerator;

public class Passport implements Generatable {
    private String series;
    private String number;

    @Override
    public Passport generate() {
        series = StringGenerator.generate(Property.PASSPORT_SERIES_DIGITS, "0123456789");
        number = StringGenerator.generate(Property.PASSPORT_NUMBER_DIGITS, "0123456789");
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s %s", series, number);
    }
}
