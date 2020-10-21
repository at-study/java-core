package lections.lesson8;

import com.google.gson.Gson;

public class Human {
    private Cat cat;
    private String lastName;
    private String firstName;

    public Human(Cat cat, String lastName, String firstName) {
        this.cat = cat;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        String json = new Gson().toJson(this);

        return String.format("Имя класса: %s, Фамилия: %s, Имя: %s, Кот: %s", getClass(), lastName, firstName, cat);
    }
}
