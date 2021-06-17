package lesson6Faq.task2.generators;

import java.util.Locale;
import java.util.Random;

public class NameGenerator {


    public static String generateName() {
        int lenghtOfName = 5 + new Random().nextInt(7);
        String upperCasesForName = "АБВГДРМНОЛЕ";
        String lowerCasesForName = upperCasesForName.toLowerCase(Locale.ROOT);
        int lenght = upperCasesForName.length();
        StringBuilder sb = new StringBuilder();
        sb.append(upperCasesForName.charAt(new Random().nextInt(lenght)));
        for (int i = 0; i < lenghtOfName; i++) {
            sb.append(lowerCasesForName.charAt(new Random().nextInt(lenght)));

        }
        return sb.toString();
    }

}
