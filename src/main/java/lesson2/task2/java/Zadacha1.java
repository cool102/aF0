public class Zadacha1 {


    static void outputArrayWithFor(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print(array[array.length - 1]);
        System.out.println(".");
    }

    static void outputArrayWithForEach(String[] array) {
        int indexOfArray = 0;
        for (String current :
                array) {
            if (indexOfArray < array.length - 1) {
                String result = "";
                result += current;
                System.out.print(result + " ");
                indexOfArray++;
            }
        }
        System.out.print(array[array.length - 1]);
        System.out.println(".");
    }

    static void outputArrayWithWhile(String[] array) {
        int index = 0;
        while (index < array.length - 1) {

            System.out.print(array[index] + " ");
            index++;
        }
        System.out.print(array[array.length - 1]);
        System.out.println(".");

    }

    public static void main(String[] args) {
        String[] array = {"Пятница", "это", "лучший", "день", "недели"};

        outputArrayWithFor(array);
        System.out.println("----------");
        outputArrayWithForEach(array);
        System.out.println("----------");
        outputArrayWithWhile(array);

    }
}
