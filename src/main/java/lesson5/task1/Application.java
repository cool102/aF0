package lesson5.task1;

import java.util.Random;

public class Application {
  public static void main(String[] args) {

    int m = new Random().nextInt(5) + 6;
    System.out.println("m=" + m);
    int n = new Random().nextInt(5) + 6;
    System.out.println("n=" + n);
    int[] dividends = new int[m];
    int[] dividers = new int[n];

    for (int i = 0; i < dividends.length; i++) {
      dividends[i] = new Random().nextInt(4) + 6;
    }
    for (int i = 0; i < dividends.length; i++) {
      System.out.print(dividends[i]);

    }
    System.out.println();
    for (int i = 0; i < dividers.length; i++) {
      dividers[i] = new Random().nextInt(4);
    }
    for (int i = 0; i < dividers.length; i++) {
      System.out.print(dividers[i]);

    }
    System.out.println();

//создаю 2 мерный массив
    int[][] result = new int[m][n];

    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        try {
          result[i][j] = dividends[i] / dividers[j];
        } catch (ArithmeticException ae) {
          result[i][j] = -1;
        }
      }
    }

    //печатаю 2 мерный массив
    System.out.println("печать итогового массива");
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }

  }
}

