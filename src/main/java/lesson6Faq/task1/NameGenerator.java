package lesson6Faq.task1;

import java.util.Locale;
import java.util.Random;

public class NameGenerator {
    public static String generateName() {

        int nameLength = 5 + new Random().nextInt(8);

        final String ALPHABETUPPERCASE = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЫЭЮЯ";
        final String ALPHABETLOWERCASE = ALPHABETUPPERCASE.toLowerCase(Locale.ROOT);
        final int N = ALPHABETUPPERCASE.length();
        Random r = new Random();
        StringBuilder sb = new StringBuilder().append(ALPHABETUPPERCASE.charAt(r.nextInt(N)));
        for (int i = 0; i < nameLength; i++) {
            sb.append(ALPHABETLOWERCASE.charAt(r.nextInt(N)));
        }
        return sb.toString();
    }
}
