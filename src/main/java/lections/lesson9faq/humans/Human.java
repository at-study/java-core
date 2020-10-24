package lections.lesson9faq.humans;

import java.util.Objects;
import java.util.Random;

public class Human implements Comparable {
    private String lastName;
    private String firstName;

    public Human() {
        lastName = "Фамилия-" + (new Random().nextInt(20) + 1);
        firstName = "Имя-" + (new Random().nextInt(20) + 1);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (!Objects.equals(lastName, human.lastName)) return false;
        return Objects.equals(firstName, human.firstName);
    }

    @Override
    public int hashCode() {
        int result = lastName != null ? lastName.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Фамилия: %s, Имя: %s", lastName, firstName);
    }

    @Override
    public int compareTo(Object o) {
        Human other = (Human) o;
        Integer first = Integer.parseInt(firstName.split("-")[1]);
        Integer second = Integer.parseInt(other.firstName.split("-")[1]);
        return first.compareTo(second);
    }
}
