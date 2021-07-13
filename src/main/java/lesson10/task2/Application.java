package lesson10.task2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) throws IOException {
        // сгенерировать LINES_AMOUNT строк и записать их в OUTPUT_FILE файл.
        //1. Считать LINES_AMOUNT строк из properties
        //2. Сгенерировать контент в виде List
        //3. Получить путь к OUTPUT_FILE из properties
        //4. Записать контент в OUTPUT_FILE


        int lines_amont = Config.getIntegerProperty("lines.amount");
        List<String> content = new ArrayList<>();
        for (int i = 0; i < lines_amont; i++) {
            content.add(StringHelper.generate());

        }


        FileHelper.write(content);


    }
}
