package lesson9.task4;

import java.util.List;

public class BusyTimeDistributor extends Distributor {
    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        int maxTime = Integer.MAX_VALUE;

        Cooker candidate = null;
        for (Cooker currentCooker:cookers
             ) {if(currentCooker.getSummaryCookTime() < maxTime) {
                 maxTime =currentCooker.getSummaryCookTime();
                 candidate= currentCooker;
                  }
        }
        return candidate;
    }

}


