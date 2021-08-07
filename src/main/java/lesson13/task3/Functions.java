package lesson13.task3;

import java.util.Collections;
import java.util.List;

public class Functions {
    public static Func<Object, Object> toStringFunction = k -> k.toString();

    public static Func<List<Integer>, Integer> summFunction = l ->{
        int sum = 0;
        for (Integer current:l
             ) {
            sum=sum+current;
               }
        return sum;
    };

    public static Func<List<Object>, Object> onlyEqualsObjects = o -> {
        if (o.isEmpty()) return true;
        for (int i = 1; i < o.size(); i++) {
            if (!o.get(i).equals(o.get(0)))
            return false;
        }
        return true;
    };


        public static Func<List<Comparable>, Comparable> maxObject = o -> {
            Collections.sort(o);
            int lastIndex = o.size() - 1;
            return o.get(lastIndex);
        };


    }
