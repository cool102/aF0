package lesson10.task2;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileHelper {

    public static void write(List<String> content) throws IOException {
        Path path = Paths.get(Config.getProperty("output.file"));
        OutputStream os = new FileOutputStream(String.valueOf(path));
        String fullString = String.join(",", content.toString());
        byte[] outputContent = fullString.getBytes(StandardCharsets.UTF_8);
        os.write(outputContent);
        os.flush();
        os.close();
    }

    public static void write2(List<String> content) throws IOException {
        FileWriter writer = new FileWriter(Config.getProperty("output.file"));
        for (String str : content) {
            writer.write(str + System.lineSeparator());
        }
        writer.close();
    }

}
