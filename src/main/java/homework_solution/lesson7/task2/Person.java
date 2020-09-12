package homework_solution.lesson7.task2;

public class Person {
    private String lastName;
    private String firstName;

    public Person() {
        this.lastName = Generator.generateName(12);
        this.firstName = Generator.generateName(12);
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
