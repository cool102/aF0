package lesson10.task2;

import java.util.Random;

public class StringHelper {

    public static String generate() {
        StringBuilder sb = new StringBuilder();
        int rMin = Config.getIntegerProperty("lines.max.length");
        int rMax = Config.getIntegerProperty("lines.min.length");

        String pattern = Config.getProperty("lines.pattern");
        int linesLenght = rMin + new Random().nextInt(rMax);
        for (int i = 0; i < linesLenght; i++) {
            sb.append(pattern.charAt(new Random().nextInt(linesLenght)));
        }
        System.out.println(String.format(Config.getProperty("lines.message"), sb.toString()));
        return sb.toString();
    }
}
