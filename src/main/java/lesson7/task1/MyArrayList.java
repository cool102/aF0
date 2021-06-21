package lesson7.task1;

import java.util.ArrayList;

public class MyArrayList<T> extends ArrayList<T> {

    @Override
    public T get(int index) {
        T object = null;
        try {
            object = super.get(index);
        } catch (IndexOutOfBoundsException iobe) {
        }
        System.out.printf("Получен объект %s из списка %n", object);
        return object;
    }


    public void add(int index, T element) {
        int position = (index <= super.size() && index >= 0) ? index : 0;
        System.out.printf("Добавлен объект %s в список на позицию %d%n", element, position);
        super.add(position, element);
    }

    public boolean contains(Object o) {
        System.out.printf("Объект %s содержится в списке \n", super.contains(o) ? "" : "не");
        return super.contains(0);
    }


    public int size() {
        System.out.println("Размер списка: " + super.size());
        return super.size();
    }
    public boolean add(T element) {
        System.out.printf("Добавлен объект %s в список", element);
        return super.add(element);
    }
}

