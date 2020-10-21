package lections.lesson8.abstractclass;

public abstract class HomeAnimal extends Animal {

    protected String name;

    public HomeAnimal(int age, int weight, String name) {
        super(age, weight);
        this.name = name;
    }

    public HomeAnimal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
