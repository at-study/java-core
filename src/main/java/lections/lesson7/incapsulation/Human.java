package lections.lesson7.incapsulation;

public class Human {
    private String name;
    private Integer age;
    protected String profession;

    public final String getName() {
        return name;
    }

    public Integer age() {
        return age;
    }

    //age - от 18 до 27
    public Human(String name, Integer age) {
        this.name = name;
        validateAge(age);
        this.age = age;
    }

    public Human(String name) {

    }

    private void validateAge(Integer age) {
        validateAgeAbove18(age);
        validateAgeUnder27(age);
    }

    private void validateAgeAbove18(Integer age) {
        if (age < 18)
            throw new IllegalArgumentException();
    }

    private void validateAgeUnder27(Integer age) {
        if (age > 27)
            throw new IllegalArgumentException();
    }
}
