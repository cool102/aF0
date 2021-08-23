package tests.lesson14;

import lesson14.task0.helpers.JsonHelper;
import lesson14.task0.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class task1 {
    private List<Person> person = JsonHelper.getPersonsFromFile("src/main/java/lesson14/dataset.json");
    @Test
    void personWithNoPassportButThreeProperties(){
        long nullPassports= person.stream()
                .filter(o -> o.getPassport() == null).filter(o->o.getProperties().size()==3)
                .peek(o-> System.out.printf("%s %s %s\n", o.getLastName(),o.getFirstName(),o.getPatronymic()))
                .count();
        Assertions.assertEquals(3,nullPassports);


    }




}
