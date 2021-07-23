package lesson11.task3;

import java.util.Locale;
import java.util.Random;

public class Generator {
    public int randomIntegr(int start, int end) {
        return start + new Random().nextInt(end+1-start);
    }

   public String randomString(int startLength, int endLenght) {
        String patternUpperCase = "ABCDEFGHIJKLOMOPQRSTUVWXYZ";
        String patternLowerCase = patternUpperCase.toLowerCase(Locale.ROOT);
        String resultPattern = patternLowerCase + patternUpperCase;
        int resultStringLenght = startLength + new Random().nextInt(endLenght-startLength);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= resultStringLenght; i++) {
            int random = new Random().nextInt(resultPattern.length());
            sb.append(resultPattern.charAt(random));
        }
        return sb.toString();
    }

}
