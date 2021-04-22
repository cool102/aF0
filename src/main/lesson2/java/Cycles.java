package main.lesson2.java;

public class Cycles {
  public static void main(String[] args) {
    for (int i =1; i <=10; i++) {
      System.out.print(i);

    }
    int[] numbers = {6,4,7,21,0,6,3,4,8,5,11,12,14};
    int sum =0;
    for (int i=0; i < numbers.length; i++){
      sum = sum +numbers[i];
    }
    System.out.printf("Сумма элементов массива равна %d%n", sum);
        for (int i=0; i < numbers.length; i++){
      int current = numbers[i];
      if (current % 2 ==0) {
        System.out.println(current+" ");
      }

    }

        sum =0;
        int index =0;
        for (int current : numbers ){
          sum+=current;

        }
    System.out.printf("Сумма эл массива равна %d%n",sum);

        sum=0;
        index =0;
        while (index < numbers.length){
          sum+=numbers[index++];

        }
    System.out.printf("Сумма эл массива равна %d%n",sum);
  }
}
