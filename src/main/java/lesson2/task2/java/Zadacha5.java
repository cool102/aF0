import java.util.Random;

public class Zadacha5 {

    static int[][] createArrayOfRandomNumbers(int m, int n) {
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

    static void transposedArrayOfRandomNumbers(int[][] arr) {

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
        transposedArrayOfRandomNumbers(createArrayOfRandomNumbers(new Random().nextInt(3) + 7, new Random().nextInt(3) + 3));
    }

}