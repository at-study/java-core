package lections.lesson5;

public class Human {
    private String name;
    private int age;

    public void setAge(int age) {
        if (age < 0 || age > 120)
            throw new IllegalHumanAgeException("Возраст " + age + " некорректный");
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
