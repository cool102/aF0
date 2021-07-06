package lesson6Faq.task4;

import java.util.Locale;
import java.util.Random;


public class NameGenerator {
    public static String generateName() {
        //длина имени
        int lenghtOfName = 5 + new Random().nextInt(7);

        final String ALPHABETUPPERCASE = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЫЭЮЯ";
        final String alphabetLowerCase = ALPHABETUPPERCASE.toLowerCase(Locale.ROOT);
        final int N = ALPHABETUPPERCASE.length();
        Random r = new Random();
        StringBuilder sb = new StringBuilder().append(ALPHABETUPPERCASE.charAt(r.nextInt(N)));
        for (int i = 0; i < lenghtOfName; i++) {
            sb.append(alphabetLowerCase.charAt(r.nextInt(N)));
        }
        return sb.toString();
    }
}


