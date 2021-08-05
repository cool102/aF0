package lesson13.task1;

import java.util.ArrayList;
import java.util.List;

public class FilterHelper {
    public static List<Integer> listFilter(List<Integer> source, Filter filter) {
        List<Integer> result = new ArrayList<>();
        for (Integer current : source
        ) {
            if (filter.filter(current))
                result.add(current);
        }

        return result;

    }
}
