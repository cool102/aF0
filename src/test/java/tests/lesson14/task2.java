package tests.lesson14;

import lesson14.task0.helpers.JsonHelper;
import lesson14.task0.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class task2 {
    private List<Person> person = JsonHelper.getPersonsFromFile("src/main/java/lesson14/dataset.json");

    @Test
    void personWithAccountsNotEqualCards() {
        long count = person.stream()
                .filter(o->o.getAccounts().size() != o.getCards().size())
                .filter(o->"Васильев".equals(o.getLastName()))
                .peek(o -> System.out.printf("%s %s %s \n", o.getLastName(), o.getFirstName(), o.getPatronymic()))
                .count();
        Assertions.assertEquals(10, count);


    }


}
