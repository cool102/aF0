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
    int countNumberOfOpertaions = 0;
    int countOfArithmeticExceptions = 0;
    int countOfZero =0;

    for (int i = 1; i <= total; i++) {
      try {
        int m = new Random().nextInt(5);
        int n = new Random().nextInt(5);
        if (n==0) countOfZero++;
        int resultOfDeviding = m / n;

      } catch (ArithmeticException ae) {
        countOfArithmeticExceptions++;
      }
      countNumberOfOpertaions++;
    }
    System.out.printf("Из %d операций деления %d было выполнено с ошибкой, а нулей в знаменателей было %d", countNumberOfOpertaions, countOfArithmeticExceptions,countOfZero);
  }
}
