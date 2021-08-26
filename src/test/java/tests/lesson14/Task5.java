package tests.lesson14;

import lesson14.task0.helpers.JsonHelper;
import lesson14.task0.model.Account;
import lesson14.task0.model.Person;
import lesson14.task0.model.Property;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Task5 {
    private final List<Person> person = JsonHelper.getPersonsFromFile("src/main/java/lesson14/dataset.json");

    Function<List<Account>, Double> getSumm = accounts -> {
        double[] summ = {0d};
        accounts.forEach(current -> summ[0] = summ[0] + current.getAccountBalance());
        return summ[0];
    };
    Function<List<Property>, Double> getSummOfLivingProperties = properties -> {
        final double[] summ = {0d};
        properties.forEach(current -> {
                    if (current.getType().equals("Жилая"))
                        summ[0] = summ[0] + current.getPrice();
                }
        );
        return summ[0];
    };

    @Test
    void accountSumLessThan2100000() {
        person.stream()
                .filter(p -> p.getAccounts().size() > 0)
                .filter(person1 -> getSumm.apply(person1.getAccounts()) < 2_100_000)
                .forEach(person1 -> System.out.printf("%s %.2f\n", person1.getLastName(), getSumm.apply(person1.getAccounts())));

    }

    @Test
    void maxPriceOfLivingProperty() {
        Optional<Person> pers = person.stream()
                .filter(person -> person.getProperties().size() > 0)
                .max((person1, person2) -> {
                    return (int) (getSummOfLivingProperties.apply(person1.getProperties())
                            - getSummOfLivingProperties.apply(person2.getProperties()));
                });

        System.out.printf("%s %s %s: %.2f%n", pers.get().getLastName(),
                pers.get().getFirstName(),
                pers.get().getPatronymic(),
                getSummOfLivingProperties.apply(pers.get().getProperties()));


    }
}
