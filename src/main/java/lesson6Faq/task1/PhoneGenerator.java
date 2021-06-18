package lesson6Faq.task1;

import java.util.Random;

public class PhoneGenerator {
    public static String generatePhone() {
        String str = "+7(9" + new Random().nextInt(10) + new Random().nextInt(10) + ")" + new Random().nextInt(10) + new Random().nextInt(10) + new Random().nextInt(10) + "-" + new Random().nextInt(10) + new Random().nextInt(10) + "-" + new Random().nextInt(10) + new Random().nextInt(10);
        return str;
    }

}
