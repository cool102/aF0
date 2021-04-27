import java.util.Random;

public class Zadacha5 {

  static int vozvratM(int n) {
    int M = n;
    int rM = new Random().nextInt(M);
    System.out.print("строк в массиве = ");
    return rM;
  }

  static int vozvratN(int n) {
    int N = n;
    int rN = new Random().nextInt(N);
    System.out.print("столбцов в массиве = ");
    return rN;
  }

  static int[][] createArray(int m, int n) {
    int[][] array = new int[m][n];
    for (int i = 0; i < m; i++) {
      System.out.println();
      for (int j = 0; j < n; j++) {
        array[i][j] = new Random().nextInt(7);
        System.out.print(" " + array[i][j]);
      }

    }
    System.out.println();
    System.out.println("----------");

return array;
  }

  static void transponiationArray(int[][] arr) {

     int[][] tarray = new int[arr[0].length][arr.length];
     tarray[0][0] = arr[0][0];
    for (int i = 0; i < (arr[0].length); i++) {
      System.out.println();
      for (int j = 0; j < (arr.length); j++) {
        tarray[i][j] = arr[j][i];
        System.out.print(" " + tarray[i][j]);
      }

    }


  }

  public static void main(String[] args) {
    /*int a = new Random().nextInt(4);
    int b = new Random().nextInt(6);
    System.out.println(a);System.out.println(b);*/

    //createAndPrint2DimensionArray(new Random().nextInt(7),new Random().nextInt(8));
   ;

    //createArray(new Random().nextInt(4), new Random().nextInt(6));

    transponiationArray(createArray(new Random().nextInt(3) + 7, new Random().nextInt(3) + 3));
  }

}