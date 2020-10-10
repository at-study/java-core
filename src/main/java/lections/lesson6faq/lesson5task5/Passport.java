package lections.lesson6faq.lesson5task5;

import lections.lesson6faq.lesson5task5.exceptions.*;

import java.util.ArrayList;
import java.util.List;

public class Passport {
    private static List<Passport> uniquePassports = new ArrayList<>();

    private String series;
    private String number;

    public Passport(String series, String number) throws PassportIllegalArgumentException, NullPointerException, PassportAlreadyExistsException{
        if (series == null)
            throw new PassportSeriesNullPointerException();
        if (number == null)
            throw new PassportNumberNullPointerException();
        if (!series.matches("^\\d{2}\\s\\d{2}$"))
            throw new PassportSeriesArgumentException();
        if (!number.matches("^\\d{6}$"))
            throw new PassportNumberArgumentException();
        for (Passport passport : uniquePassports) {
            if (passport.number.equals(number) && passport.series.equals(series))
                throw new PassportAlreadyExistsException();
        }
        this.series = series;
        this.number = number;
        uniquePassports.add(this);
    }
}
