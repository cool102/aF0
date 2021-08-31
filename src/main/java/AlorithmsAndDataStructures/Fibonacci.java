package AlorithmsAndDataStructures;

public class Fibonacci {
    public static void main(String[] args) {
              System.out.println(fibNaive(2));
              System.out.println(fibNaive(5));
              System.out.println(fibNaive(10));
              System.out.println(fibNaive(11));
              System.out.println(fibNaive(12));
        System.out.println("-----------------------");
        System.out.println(fibEffective(2));
        System.out.println(fibEffective(5));
        System.out.println(fibEffective(10));
        System.out.println(fibEffective(11));
        System.out.println(fibEffective(12));
        System.out.println(fibEffective(100));
    }

    // наивный, медленный и очевидный
    public static long fibNaive(int n) {
        if (n <= 1)
            return  n;
        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    //
     private static  long fibEffective(int n){
        long[] arr = new long[n+1];
        arr[0]=0;
        arr[1]=1;
         for (int i = 2; i < arr.length; i++) {
             arr[i] = arr[i-1]+arr[i-2];
         }
         return arr[n];

     }

}

