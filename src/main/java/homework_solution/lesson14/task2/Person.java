package homework_solution.lesson14.task2;

public class Person {
    private Passport passport;
    private Place place;

    public Person(Passport passport, Place place) {
        this.passport = passport;
        this.place = place;
    }

    public Person(Passport passport) {
        this.passport = passport;
    }

    public Passport getPassport() {
        return passport;
    }

    public Place getPlace() {
        return place;
    }
}
