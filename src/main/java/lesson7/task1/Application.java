package lesson7.task1;

import java.util.List;

public class Application {
    public static void main(String[] args) {


        List<Integer> list = new MyArrayList<>();

        list.add(0, 00);
        list.add(1, 11);
        list.add(2, 22);
        list.add(4, 44);
        System.out.println(list);

        System.out.println(list.get(5));
        System.out.println(list.contains(0));
        System.out.println(list.contains(123213));
        System.out.println(list.size());
        System.out.println(list.add(8000));
        System.out.println(list);

    }


}
