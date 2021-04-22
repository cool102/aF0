package main.lesson2.java;

public class Array {
  public static void main(String[] args) {
    System.out.println(calcSum(1,2,3));
  }
  static int calcSum(int...numbers){
    int sum =0;
    for (int current : numbers) {
      sum+=current;
    }
     return sum;
  }

}
