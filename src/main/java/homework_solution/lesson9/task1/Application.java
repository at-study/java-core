package homework_solution.lesson9.task1;

import homework_solution.lesson9.task1.cars.*;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            cars.add(Factory.make());
        }

        int renaultCount = 0;
        int nissanCount = 0;
        int mitsubishiCount = 0;
        int mercedesCount = 0;
        int regularCount = 0;
        int premiumCount = 0;

        for (Car car: cars) {
            if (car instanceof Renault) renaultCount++;
            if (car instanceof Nissan) nissanCount++;
            if (car instanceof Mitsubishi) mitsubishiCount++;
            if (car instanceof Mercedes) mercedesCount++;
            if (car instanceof RegularCar) regularCount++;
            if (car instanceof PremiumCar) premiumCount++;
        }

        System.out.println("Renault: " + renaultCount);
        System.out.println("Nissan: " + nissanCount);
        System.out.println("Mitsubishi: " + mitsubishiCount);
        System.out.println("Mercedes: " + mercedesCount);
        System.out.println("RegularCar: " + regularCount);
        System.out.println("PremiumCar: " + premiumCount);
    }

}
