//вывод на печать буквы А N раз -1
public class Zadacha8 {
  static void printLetterANTimesWithBreak(int integer) {
    switch (integer) {
      case 1:
        System.out.println("A");
        break;
      case 2:
        System.out.println("AA");
        break;
      case 3:
        System.out.println("AAA");
        break;
      case 4:
        System.out.println("AAAA");
        break;
      default:
        System.out.println("AAAAA");
    }
  }

  static void printLetterANTimesWithoutBreak(int integer) {
    switch (integer) {
      default:
        System.out.print("A");
      case 4:
        System.out.print("A");
      case 3:
        System.out.print("A");
      case 2:
        System.out.print("A");
      case 1:
        System.out.print("A");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    printLetterANTimesWithBreak(-1);
    printLetterANTimesWithBreak(2);
    printLetterANTimesWithBreak(4);
    printLetterANTimesWithBreak(7);
    printLetterANTimesWithBreak(0);

    System.out.println("Второй способ");
    printLetterANTimesWithoutBreak(-1);
    printLetterANTimesWithoutBreak(2);
    printLetterANTimesWithoutBreak(4);
    printLetterANTimesWithoutBreak(7);
    printLetterANTimesWithoutBreak(0);


  }
}
