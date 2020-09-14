package homework_solution.lesson9.task4.distributors;

import homework_solution.lesson9.task4.cookers.Cooker;

import java.util.List;

public class BusyTimeDistributor extends Distributor {

    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        int maxTime = Integer.MAX_VALUE;
        Cooker candidate = null;
        for (Cooker cooker : cookers) {
            if (cooker.getTotalTime() < maxTime) {
                maxTime = cooker.getTotalTime();
                candidate = cooker;
            }
        }
        return candidate;
    }
}
