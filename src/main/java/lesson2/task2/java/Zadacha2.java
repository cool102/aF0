public class Zadacha2 {


    static void printArrayOnScreenWithCycleFor(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (i + j) % 2;
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }

    static void printArrayOnScreenWithCycleForeach(int[][] array) {
        for (int[] rowOfArray : array) {
            for (int current : rowOfArray) {
                current = (2 + current) % 2;
                System.out.print(current);
            }
            System.out.println();
        }

    }

    static void printArrayOnScreenWithCycleWhile(int[][] array) {
        int indexForRows = 0;
        while (indexForRows < array.length) {
            int currentIndexOfRow = 0;
            while (currentIndexOfRow < array[indexForRows].length) {
                array[indexForRows][currentIndexOfRow] = (indexForRows + currentIndexOfRow) % 2;
                System.out.print(array[indexForRows][currentIndexOfRow]);
                currentIndexOfRow++;
            }
            System.out.println();
            indexForRows++;
        }

    }


    public static void main(String[] args) {
        int[][] arrayOfInteger = new int[8][8];
        System.out.println("массив в шахматном порядке с помощью for");
        printArrayOnScreenWithCycleFor(arrayOfInteger);
        System.out.println("массив в шахматном порядке с помощью fore");
        printArrayOnScreenWithCycleForeach(arrayOfInteger);
        System.out.println("массив в шахматном порядке с помощью while");
        printArrayOnScreenWithCycleWhile(arrayOfInteger);
    }


}
