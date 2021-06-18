package lesson6Faq.task2.generators;

import java.util.Random;

public class PhoneNumberGenerator {
    public static String generatePhoneNumber() {
        String str = "+7(9" + new Random().nextInt(10) + new Random().nextInt(10) + ")" + new Random().nextInt(10) + new Random().nextInt(10) + new Random().nextInt(10) + "-" + new Random().nextInt(10) + new Random().nextInt(10) + "-" + new Random().nextInt(10) + new Random().nextInt(10);
        return str;
    }

}