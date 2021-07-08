package lesson9.task4;

import java.util.ArrayList;
import java.util.List;

public class Cooker {
    List<Food> cookersNotepad = new ArrayList<>();

   public int getSummaryCookTime(){
       int summaryCookTime=0;
       for (Food currentFood:cookersNotepad
            ) {summaryCookTime =summaryCookTime+ currentFood.getCookingTime();
                  }
       return summaryCookTime;
   }
   public int getFoodCount(){
       int foodCount =0;
       for (Food currentFood:cookersNotepad
            ) {if(currentFood != null) foodCount++;

       }
       return foodCount;
   }
   public void addFoodToNotepad(Food food){
       cookersNotepad.add(food);
   };
   public void clearNotepad(){
       cookersNotepad.removeAll(cookersNotepad);
   };




}
