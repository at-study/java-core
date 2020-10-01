package lections.lesson4.car_factory;

public class Car {

    private Wheel[] wheels;
    private Door[] doors;

    // В конструкторе не указывается возвращаемый тип
    public Car(Wheel[] wheels) {
        this.wheels = wheels;
    }


    public void setDoors(Door[] doors) {
        this.doors = doors;
    }

    public Door[] getDoors() {
        return doors;
    }


    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }










}
