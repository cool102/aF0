package main.lesson2.java;

public class fibonacci {
  //1,1,2,3,5,8,13
  public static void main(String[] args) {
    final int N = 9;
    int result = fibonacciElement(N);
    System.out.println(result);


  }

  static int fibonacciElement (final int N){
    int[] fibonacciArray = new int[10];
    fibonacciArray[1] =1;
    fibonacciArray[2] =1;
    for (int i = 3; i <10 ; i++) {
      fibonacciArray[i]=fibonacciArray[i-1]+fibonacciArray[i-2];
      if (i==N){
        break;
      }

    }
    return fibonacciArray[N];
  }
}
