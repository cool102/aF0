package lesson9.task4;

import java.util.List;

public class RoundRobinDistributor extends Distributor {

    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        int maxAmount = Integer.MAX_VALUE;
        Cooker candidate = null;
        for (Cooker cooker : cookers
        ) {
            if (cooker.getFoodCount() < maxAmount) {
                candidate = cooker;
            }

        }
        return candidate;
    }


}
