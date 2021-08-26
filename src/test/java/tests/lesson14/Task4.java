package tests.lesson14;

import lesson14.task0.helpers.JsonHelper;
import lesson14.task0.model.Cards;
import lesson14.task0.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    private final List<Person> person = JsonHelper.getPersonsFromFile("src/main/java/lesson14/dataset.json");

    @Test
    void With3AccountAndZeroCards() {
        List<Person> filteredPersons = person.stream()
                .filter(o -> (o.getPassport() != null && o.getAccounts().size() == 3 && o.getCards().size() == 0))
                .collect(Collectors.toList());
        Assertions.assertEquals(0, filteredPersons.size());

        boolean isAllSeriesIn4Digit = filteredPersons.stream()
                .allMatch(o -> o.getPassport().getSeries().matches("\\d{4}"));
        System.out.println(isAllSeriesIn4Digit);

        boolean isAnySeriesIn4Digit = filteredPersons.stream()
                .anyMatch(o -> o.getPassport().getSeries().matches("\\d{4}"));
        System.out.println(isAnySeriesIn4Digit);

        boolean isNoneSeriesIn4Digit = filteredPersons.stream()
                .noneMatch(o -> o.getPassport().getSeries().matches("\\d{4}"));
        System.out.println(isNoneSeriesIn4Digit);
    }

    @Test
    @DisplayName("Есть карты")
    void isCardHolder() {
        long haveCards = person.stream()
                .filter(o -> o.getCards().size() > 0)
                .count();
        System.out.println(haveCards);
    }

    @Test
    @DisplayName("Есть карты и все они являются действующими")
    void isCardHolderAndCardsValid() {
        long haveValidCards = person.stream()
                .filter(o -> o.getCards().size() > 0)
                .filter(o -> o.getCards().stream()
                        .allMatch(this::isCardValid))
                .count();
        System.out.println(haveValidCards);
    }

    @Test
    @DisplayName("Есть карты и все -недействующие")
    void isCardHolderAndCardsNotValid() {
        long NoValidCards = person.stream()
                .filter(o -> o.getCards().size() > 0)
                .filter(o -> o.getCards().stream()
                        .noneMatch(this::isCardValid))
                .count();
        System.out.println(NoValidCards);
    }

    @Test
    @DisplayName("Есть карты и действующие и недействующие")
    void isCardHolderAndCardsValidAndNonValids() {
        long NoValidCards = person.stream()
                .filter(o -> o.getCards().size() > 0)
                .filter(o -> (o.getCards().stream()
                        .anyMatch(this::isCardValid) && o.getCards().stream()
                        .anyMatch(card -> !(isCardValid(card)))))
                .count();
        System.out.println(NoValidCards);
    }


    private boolean isCardValid(Cards card) {
        try {
            Date cardDate = new SimpleDateFormat("MM.yy").parse(card.getEndDateMonth() + "." + card.getEndDateYear());
            return cardDate.after(new Date());

        } catch (ParseException pe) {
            throw new RuntimeException("ошибка при парсинге даты");
        }


    }
}
