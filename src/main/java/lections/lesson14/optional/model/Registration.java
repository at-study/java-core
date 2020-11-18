package lections.lesson14.optional.model;


public class Registration {
    private House house;

    public Registration() {
        house = new House();
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}
