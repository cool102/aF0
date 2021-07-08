package lesson9.task4;

import java.util.ArrayList;
import java.util.List;

public abstract class Distributor implements CookChooser {

    List<Cooker> cookers = new ArrayList<>();


    @Override
    public abstract Cooker chooseCooker(List<Cooker> cookers);


    void addFood(Food food, List<Cooker> cookers) {
        chooseCooker(cookers).addFoodToNotepad(food);
    }
}
