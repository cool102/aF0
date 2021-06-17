package lesson4.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        //создал массив Human размером 3
        Human[] arrayOfHuman = new Human[3];
        int index = 0;

        while (true) {
            //создал переменную string в которую считываю строки из консоли
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите строку в  формате %s %s %s");
            String string = scan.nextLine();
            System.out.println("Вот считанная строка" + string);

            System.out.println("создаю объект класса валидатор");
            Validator valid = new Validator();

            System.out.println("валидирую строку");
            boolean goodString = valid.StringFormatValidation(string);
            String output = goodString ?
                    "строка валидна" :
                    "строка не валидна";
            System.out.println(output);


            if (!goodString) continue;
            System.out.println("эта строка напечаталась, значит программа пошла дальше");

            //строку записываю в массив, теперь в массиве есть строки которые можно использовать для создания объекта Human
            String[] humanFields = valid.returnStringSpacedArray(string);
            System.out.println("печатаю весь массив строк");
            for (int i = 0; i < humanFields.length; i++) {
                System.out.println(humanFields[i]);

            }
            System.out.println("создаю объект , записываю в его поля значения из массива строк");
            Human human = new Human();
            human.setLastName(humanFields[0]);
            human.setFirstName(humanFields[1]);
            human.setBirthDate(sdf.parse(humanFields[2]));


            System.out.println("првоеряю валиден ли объект");
            boolean objectValid = valid.isHumanValid(human);
            System.out.println(objectValid);
            if (!objectValid) continue;

            arrayOfHuman[index++] = human;
            System.out.println("печатаю индекс" + index);


            boolean isArrayFull = valid.isArrayOfHumanFull(arrayOfHuman);
            if (isArrayFull) break;
        }


    }
}
