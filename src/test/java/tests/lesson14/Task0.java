package tests.lesson14;

import lesson14.task0.helpers.JsonHelper;
import lesson14.task0.model.Person;

import java.io.IOException;
import java.util.List;

public class Task0 {
    public static void main(String[] args) throws IOException {
        List<Person> person = JsonHelper.getPersonsFromFile("src/main/java/lesson14/dataset.json");
    }
}
