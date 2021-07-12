package lesson10.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileHelper {

    public static Map<String, String> readFile(File inputFile) throws IOException {
        Path path = Paths.get(String.valueOf(inputFile));
        List<String> contentInList = Files.readAllLines(path);

        Map<String, String> map = new HashMap<>();

        for (String line : contentInList
        ) {
            String key = line.split("=")[0];
            if (line.contains("=") && line.split("=").length == 1) {
                map.put(key, "[]");
                continue;
            }
            String value = parse(line.split("=")[1]);
            map.put(key, value);
        }
        return map;
    }


    private static String parse(String value) {
        String deafaultValue = "\"" + value + "\"";
        if (value.equals(null)) return null;
        if (value.equals("")) return "\"[]\"";
        if (value.contains(".")) {
            try {
                return String.valueOf(Double.parseDouble(value));
            } catch (NumberFormatException notfloatException) {
                return deafaultValue;
            }


        }
        try {
            return String.valueOf(Long.parseLong(value));
        } catch (NumberFormatException ignore) {
        }

        return value.equals("true") || value.equals("false")
                ? value
                : deafaultValue;

    }

    public static void saveFile(File inputFile, Map<String, String> map) {
        StringBuilder sb = new StringBuilder("{");
        sb.append(System.lineSeparator());
        for (Map.Entry<String, String> entry : map.entrySet())
            sb.append(String.format("  \"%s\": %s,\r\n", entry.getKey(), entry.getValue()));
        int lastComma = sb.lastIndexOf(",");
        sb.replace(lastComma, lastComma + 1, "");
        sb.append("}");
        String output = sb.toString();
        System.out.println(output);
        try (FileWriter writer = new FileWriter(inputFile)) {
            writer.write(output);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}






