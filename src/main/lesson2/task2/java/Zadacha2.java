public class Zadacha2 {

  static int[][] arrayOfInteger = {{0,1,0,1,0,1,0,1},{1,0,1,0,1,0,1,0},{0,1,0,1,0,1,0,1},{1,0,1,0,1,0,1,0},{0,1,0,1,0,1,0,1},{1,0,1,0,1,0,1,0},{0,1,0,1,0,1,0,1},{1,0,1,0,1,0,1,0}};

    static void printArrayWithFor(int[][] args) {
    for (int i = 0; i < arrayOfInteger.length; i++) {
      for (int j = 0; j < arrayOfInteger.length; j++) {
        System.out.print(arrayOfInteger[i][j]);
      }
      System.out.println();
    }

    }


  public static void main(String[] args) {
    printArrayWithFor(arrayOfInteger);
  }
}
