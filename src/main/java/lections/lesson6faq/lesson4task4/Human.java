package lections.lesson6faq.lesson4task4;

public class Human {

    private String lastName;
    private String firstName;
    private int age;
    private Passport passport;

    public Human setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Human setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    public Human setPassport(Passport passport) {
        if (passport == null) {
            System.out.println("Не удалось прикрепить, паспорт = null");
            return this;
        }
        if (passport.getSeries() != null && passport.getNumber() != null) {
            this.passport = passport;
            System.out.printf("Прикреплен паспорт с серией %s и номером %s%n", passport.getSeries(), passport.getNumber());
        } else
            System.out.printf("Паспорт с серией %s и номером %s невалиден, прикрепить не получилось%n", passport.getSeries(), passport.getNumber());
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Passport getPassport() {
        return passport;
    }
}
