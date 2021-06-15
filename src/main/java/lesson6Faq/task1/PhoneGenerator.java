package lesson6Faq.task1;

import java.util.Random;

public class PhoneGenerator {
  public static String generatePhone() {
    String str = "+7(9" + String.valueOf(new Random().nextInt(10)) + String.valueOf(new Random().nextInt(10)) + ")" + String.valueOf(new Random().nextInt(10)) + String.valueOf(new Random().nextInt(10)) + String.valueOf(new Random().nextInt(10)) + "-" + String.valueOf(new Random().nextInt(10)) + String.valueOf(new Random().nextInt(10)) + "-" + String.valueOf(new Random().nextInt(10)) + String.valueOf(new Random().nextInt(10));
    return str;
  }

}
