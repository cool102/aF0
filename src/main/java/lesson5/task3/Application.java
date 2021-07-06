package lesson5.task3;

import java.util.Random;

public class Application {
    //рандомно выбрать число итераций total из диапазона 500-1000 вкл с обоих сторон
    // в цикле до total включительно делить m на n которые на каждом делени выбираются случайно в диапазоне 0-4 включительно
    //после цикла вывести сообщение
    //-сколько было операций деления
    //-сколько из них было выполнено с ошибкой


    public static void main(String[] args) {
        int total = new Random().nextInt(500) + 501;
        System.out.println("Число total равно=" + total);
        int operationsCount = 0;
        int arithmeticExceptionsCount = 0;
        int zerosCount = 0;

        for (int i = 1; i <= total; i++) {
            try {
                int m = new Random().nextInt(5);
                int n = new Random().nextInt(5);
                if (n == 0) zerosCount++;


            } catch (ArithmeticException ae) {
                arithmeticExceptionsCount++;
            }
            operationsCount++;
        }
        System.out.printf("Из %d операций деления %d было выполнено с ошибкой, а нулей в знаменателей было %d", operationsCount, arithmeticExceptionsCount, zerosCount);
    }
}
