package lesson6Faq.task2.generators;

import java.util.Random;

public class AgeGenerators {
    public static int generateAge() {
        int age = 20 + new Random().nextInt(50);
        return age;
    }
}
