package lections.lesson14.optional.model;

public class Person {
    private Passport passport;

    public Person() {
        passport = new Passport();
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }
}
