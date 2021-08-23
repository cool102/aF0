package lesson14.task0.helpers;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lesson14.task0.model.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JsonHelper {
    public static List<Person> getPersonsFromFile(String path) {

        try {
            String json = String.join("", Files.readAllLines(Paths.get(path)));
            return new Gson().fromJson(json, new TypeToken<List<Person>>() {
            }.getType());

        } catch (IOException exc) {
            return null;
        }
    }
}
