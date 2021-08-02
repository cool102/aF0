package lesson3.task2;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Cat[] arrayOfCats = new Cat[5];
/**
 * создал массив из 5 котов
 */
        arrayOfCats[0] = new Cat("Барсик", 2, 5);
        arrayOfCats[1] = new Cat("Мурзик",3, 11 );
        arrayOfCats[2] = new Cat("Матильда",7, 2);
        arrayOfCats[3] = new Cat("Леопольд",1, 3);
        arrayOfCats[4] = new Cat("Базилио",11, 4);


        /**
         * сортирую массив котов по полю name и вывожу на экран
         */

        String[] namesOfCatsAlphabet = {arrayOfCats[0].name, arrayOfCats[1].name, arrayOfCats[2].name, arrayOfCats[3].name, arrayOfCats[4].name};
        Arrays.sort(namesOfCatsAlphabet);
        for (String current : namesOfCatsAlphabet) {
            for (Cat cat : arrayOfCats) {
                if (current.equals(cat.name))
                    System.out.printf("Имя:%s, Возраст:%d, Вес:%d", cat.name, cat.age, cat.weight);
            }
            System.out.println();
        }

    }
}
