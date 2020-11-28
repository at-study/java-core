package lections.lesson15faq;

public class Human {

    @CucumberName("Фамилия")
    private String lastName;
    @CucumberName("Имя")
    private String firstName;

    public Human() {
    }

    public Human(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    private String getFirstName() {
        return firstName;
    }

}
