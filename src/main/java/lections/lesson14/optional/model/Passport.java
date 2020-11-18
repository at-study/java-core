package lections.lesson14.optional.model;

public class Passport {
    private Registration registration;

    public Passport() {
        registration = new Registration();
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }
}
