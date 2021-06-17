package lesson6Faq.task1;

import java.util.Random;

public class AgeGenerator {
    public static int generateAge() {
        return 20 + new Random().nextInt(55);
    }

}
