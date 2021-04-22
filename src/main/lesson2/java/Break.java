package main.lesson2.java;

public class Break {
  public static void main(String[] args) {
    int[] array = {1, 5, 3, -2, 0, 5, 2};
    int sum = 0;
    for (int current : array) {
      if (current < 0) {
        break;
      }
      sum += current;

    }
    System.out.println("сумма чисел до первого отрицательного числа = " + sum);
  }

//int[][] matrix = {{1,2}};

  int[] numbers2 = {1, 2, 3, 4, 5, -11, 7, -12, -18, 0};
  int sum2 =0;

}
