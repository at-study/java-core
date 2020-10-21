package lections.lesson8;

import com.google.gson.Gson;

import java.util.Objects;

public class Cat implements Comparable {

    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

    public Cat setAge(int age) {
        this.age = age;
        return this;
    }

    public Cat setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        if (weight != cat.weight) return false;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + weight;
        return result;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }


    // a.compareTo(b)
    // если возвращается >0   ->    a > b
    // если возвращается <0   ->    a < b
    @Override
    public int compareTo(Object other) {
        Cat otherCat = (Cat) other;
        return otherCat.weight - weight;
    }
}
