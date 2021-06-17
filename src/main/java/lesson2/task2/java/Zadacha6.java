import java.util.Random;

public class Zadacha6 {

    public static void main(String[] args) {

        System.out.println("создаю массив случайными числами 1 и 0");
        final int m = new Random().nextInt(4) + 7;
        final int n = new Random().nextInt(4) + 7;
        int[][] sArray = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                sArray[i][j] = new Random().nextInt(2);

            }
        }

        //создаю координаты х у в которые запишу число 2
        int x = new Random().nextInt(1) + (m - 2);
        int y = new Random().nextInt(1) + (n - 3);
        //записал число 2
        sArray[x][y] = 2;

        //инвертирую число после 2
        int[][] rArray = new int[m][n];
        boolean was2 = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (sArray[i][j] == 2) {
                    rArray[i][j] = 2;
                    was2 = true;
                } else {
                    rArray[i][j] = was2 ? (sArray[i][j] + 1) % 2 : sArray[i][j];

                }

            }
        }

        System.out.println("печатаю исходный массив");
        for (int[] row : sArray) {
            System.out.println();
            for (int i : row) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        System.out.println("");


        System.out.println("печатаю инвертированный после числа \"2\" массив");
        for (int[] row : rArray) {
            System.out.println();
            for (int i : row) {
                System.out.print(i + " ");
            }

        }
    }
}
