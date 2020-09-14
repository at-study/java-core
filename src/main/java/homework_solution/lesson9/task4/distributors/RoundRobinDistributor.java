package homework_solution.lesson9.task4.distributors;

import homework_solution.lesson9.task4.cookers.Cooker;

import java.util.List;

public class RoundRobinDistributor extends Distributor {

    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        int maxAmount = Integer.MAX_VALUE;
        Cooker candidate = null;
        for (Cooker cooker : cookers) {
            if (cooker.getTotalSize() < maxAmount) {
                maxAmount = cooker.getTotalSize();
                candidate = cooker;
            }
        }
        return candidate;
    }

}
