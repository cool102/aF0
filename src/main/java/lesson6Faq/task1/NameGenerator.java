package lesson6Faq.task1;

import java.util.Random;

public class NameGenerator {
    public static String generateName() {
        //длина имени
        int lenghtOfName = 5 + new Random().nextInt(8);

        final String alphabetUpperCase = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЫЭЮЯ";
        final String alphabetLowerCase = "абвгдеёжзийклмнопрстуфхцчшщыэюя";
        final int N = alphabetUpperCase.length();
        Random r = new Random();
        StringBuilder sb = new StringBuilder().append(alphabetUpperCase.charAt(r.nextInt(N)));
        for (int i = 0; i < lenghtOfName; i++) {
            sb.append(alphabetLowerCase.charAt(r.nextInt(N)));
        }
        return sb.toString();
    }
}
