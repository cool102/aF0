package lesson2.task2;

public class Zadacha1 {

  static String[] array = {"Пятница", "это", "лучший", "день", "недели"};

  static void outputArrayWithFor(String[] args) {
    for (int i = 0; i < array.length - 1; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.print(array[array.length - 1]);
    System.out.println(".");
  }

  static void outputArrayWithForEach(String[] args) {
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

  static void outputArrayWithWhile(String[] args) {
    int index = 0;
    while (index < array.length - 1) {

      System.out.print(array[index] + " ");
      index++;
    }
    System.out.print(array[array.length - 1]);
    System.out.println(".");

  }

  public static void main(String[] args) {
    outputArrayWithFor(array);
    System.out.println("----------");
    outputArrayWithForEach(array);
    System.out.println("----------");
    outputArrayWithWhile(array);

  }
}
