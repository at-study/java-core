package lections.lesson6faq.lesson5task5;

import lections.lesson6faq.lesson5task5.exceptions.PassportAlreadyExistsException;

public class Application {

    public static void main(String[] args) {
        createPassport(null, "123456");
        createPassport("12 34", null);
        createPassport(null, null);
        createPassport("12 4", "123456");
        createPassport("12 45", "1234");
        createPassport("12 45", "123456");
        createPassport("12 45", "123456");

        System.out.println();

    }

    public static Passport createPassport(String series, String number) {
        try {
            return new Passport(series, number);
        } /*catch (PassportSeriesArgumentException |
                PassportNumberArgumentException |
                PassportSeriesNullPointerException |
                PassportNumberNullPointerException exception) {
            System.out.println("Введите верные значения серии и номера паспорта");
            return null;
        } */catch (PassportAlreadyExistsException pae) {
            System.out.println("Данные серия и номер паспорта уже существуют");
            return null;
        }
    }
}
