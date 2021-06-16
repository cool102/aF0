public class CmToMeter {
  static int cmToMeter(int numberInMeters) {
    return numberInMeters / 100;
  }

  public static void main(String[] args) {
    System.out.println(cmToMeter(115));
    System.out.println(cmToMeter(800));
    System.out.println(cmToMeter(278));
  }
}
