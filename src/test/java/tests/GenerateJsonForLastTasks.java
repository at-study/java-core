package tests;

import com.google.gson.Gson;
import homework_task.lesson14.helpers.JsonHelper;
import homework_task.lesson14.model.*;
import org.apache.commons.math3.random.RandomDataGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class GenerateJsonForLastTasks {
    private List<String> lastNames = Arrays.asList("Петров", "Иванов", "Михайлов", "Васильев", "Александров",
            "Богданов", "Константинов", "Кузнецов", "Кузьмин", "Ефименко",
            "Крайнов", "Горбунов", "Казанцев", "Сидоров", "Воронцов");
    private List<String> firstNames = Arrays.asList("Петр", "Иван", "Михаил", "Василий", "Александр",
            "Алексей", "Сергей", "Григорий", "Георгий", "Олег");
    private List<String> patronymics = Arrays.asList("Петрович", "Иванович", "Васильевич", "Александрович", "Алексеевич",
            "Михайлович", "Сергеевич", "Григорьевич", "Георгиевич", "Владимирович");
    private List<String> streets = Arrays.asList("Михайлова", "Докукина", "Золоторожская", "Поддубная", "Тушинская",
            "Щукинская", "Палехская", "Проходчиков", "Норильская", "Изумрудная",
            "Каширская", "Кантемировская", "Бакунинская", "Партизанская", "Первомайская");
    private List<String> accountTypes = Arrays.asList("Расчетный", "Текущий", "Депозитный");
    private List<String> cardTypes = Arrays.asList("VISA", "MasterCard", "МИР");
    private List<String> propertyTypes = Arrays.asList("Жилая", "Нежилая");


    @Test
    void debugTest() {
        String filePath = "src\\main\\resources\\lesson14\\dataset-generate.json";
        Set<Person> generatedPersons = new HashSet<>();
        for (int i = 0; i < 500; i++) {
            String lastName = getRandomFromList(lastNames);
            String firstName = getRandomFromList(firstNames);
            String patronymic = getRandomFromList(patronymics);
            Passport passport = getRandomPassport();
            Set<Property> properties = getRandomProperties();
            Set<Account> accounts = getRandomAccounts();
            Set<Card> cards = getRandomCards(accounts);
            Person genPerson = new Person(lastName, firstName, patronymic, passport, properties, accounts, cards);
            generatedPersons.add(genPerson);
        }
        System.out.println(generatedPersons.stream().filter(p -> p.getProperties().size() == 0).count());
        System.out.println(generatedPersons.stream().filter(p -> p.getPassport() == null).count());

        String json = new Gson().toJson(generatedPersons);
        try (FileWriter writer = new FileWriter(new File(filePath))) {
            writer.write(json);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    void getFromFile() {
        String path = "src\\main\\resources\\lesson14\\dataset.json";
        List<Person> persons = JsonHelper.getPersonsFromFile(path);
        System.out.println();
    }

    private String randomNumberString(int length) {
        String pattern = "0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(pattern.charAt(new Random().nextInt(pattern.length())));
        }
        return sb.toString();
    }

    private String getRandomDate(String from, String to) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Long fromTime = sdf.parse(from).getTime();
            Long toTime = sdf.parse(to).getTime();
            Long result = new RandomDataGenerator().nextLong(fromTime, toTime);
            return sdf.format(new Date(result));
        } catch (ParseException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private <T> T getRandomFromList(List<T> input) {
        return input.get(new Random().nextInt(input.size()));
    }

    private Integer getRandomInt(int from, int to) {
        Integer result = new Random().nextInt(to - from + 1) + from;
        Assertions.assertTrue(result >= from);
        Assertions.assertTrue(result <= to);
        return result;
    }

    private Double getRandomAmount(int from, int to) {
        Double result = 1.0d * Math.round(100 * (new Random().nextDouble() * (to - from + 1) + from)) / 100;
        Assertions.assertTrue(result >= from);
        Assertions.assertTrue(result <= to);
        return result;
    }

    private Passport getRandomPassport() {
        if (new Random().nextInt(100) > 95) return null;
        return new Passport(
                randomNumberString(4),
                randomNumberString(6),
                String.format("Отделом УФМС по улице %s", getRandomFromList(streets)),
                getRandomDate("01.01.1980", "31.12.1999"),
                randomNumberString(3) + "-" + randomNumberString(3)
        );
    }

    private Set<Property> getRandomProperties() {
        Set<Property> properties = new HashSet<>();
        int count = (int) (new Random().nextDouble() * 3 + 0.95);
        for (int i = 0; i < count; i++) {
            Property property = new Property(
                    getRandomFromList(propertyTypes),
                    String.format("г. Москва, ул. %s, д. %d, кв. %d", getRandomFromList(streets), getRandomInt(1, 100), getRandomInt(1, 400)),
                    getRandomAmount(4_000_000, 10_000_000)
            );
            properties.add(property);
        }
        return properties;
    }

    private Set<Account> getRandomAccounts() {
        Set<Account> accounts = new HashSet<>();
        int count = (int) (new Random().nextDouble() * 3 + 0.95);
        for (int i = 0; i < count; i++) {
            Account account = new Account(
                    getRandomFromList(accountTypes),
                    String.format("%s.%s.%s.%s", randomNumberString(5), randomNumberString(3), randomNumberString(1), randomNumberString(11)),
                    getRandomAmount(2_000_000, 8_000_000)
            );
            accounts.add(account);
        }
        return accounts;
    }

    private Set<Card> getRandomCards(Set<Account> accounts) {

        Set<Card> cards = new HashSet<>();
        for (int i = 0; i < accounts.size(); i++) {
            Card card = new Card(
                    getRandomFromList(cardTypes),
                    randomNumberString(16),
                    String.valueOf(new Random().nextInt(12) + 1),
                    new Random().nextBoolean() ? getRandomInt(16, 19).toString() : getRandomInt(22, 24).toString(),
                    String.valueOf(getRandomInt(100, 999)),
                    new ArrayList<>(accounts).get(i).getAccountNumber()
            );
            if (new Random().nextBoolean() || new Random().nextBoolean() || new Random().nextBoolean())
                // 87.5%
                cards.add(card);
        }
        return cards;
    }

}
