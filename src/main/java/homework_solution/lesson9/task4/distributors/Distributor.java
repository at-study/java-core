package homework_solution.lesson9.task4.distributors;

import homework_solution.lesson9.task4.cookers.Cooker;
import homework_solution.lesson9.task4.food.Food;

import java.util.List;

public abstract class Distributor implements CookChooser {

    public void addFood(Food food, List<Cooker> cookers) {
        chooseCooker(cookers).addFood(food);
    }

}
