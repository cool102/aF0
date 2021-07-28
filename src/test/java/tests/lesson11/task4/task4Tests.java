package tests.lesson11.task4;

import lesson11.task4.FileHelper;
import lesson11.task4.Passport;
import lesson11.task4.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import static lesson11.task4.FileHelper.getParse;

public class task4Tests {

    private LocalDate fromString(String parse) throws ParseException {
        return  LocalDate.parse(parse, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    private final String PATH = "D:/devel/aF0/src/main/java/lesson11/task4/persons.xlsx";
    private final String WRONGPATH = "D:/devel1/aF0/src/main/java/lesson11/task4/persons.xlsx";

    private String Persons2 = "Persons2";
    private String Persons1 = "Persons1";
    private String wrongSheet = "Persons3";

    @Test
    @DisplayName("Проверка что в Person1 6 строк")

    public void getPersonsFromExcelTest() {
        List<Person> personList1 = FileHelper.getPersonsFromExcel(PATH, Persons1);
        Assertions.assertEquals(6, personList1.size());

    }

    @Test
    @DisplayName("Проверка что в объекты полученные со строк совпали  с ожидаемыми")

    public void getPersonsFromExcelTest2() throws ParseException {
        List<Person> personList1 = FileHelper.getPersonsFromExcel(PATH, Persons1);
        List<Person> expectedPersons = Arrays.asList(
                new Person("Иванов", "Владимир", "Михайлович", getParse("14.01.1990"), new Passport("4510", "155442")),
               new Person("Петров", "Михаил", "Валерьевич", getParse("12.06.1984"), new Passport("4511", "523533")),
               new Person("Васильев", "Валерий", "Александрович", getParse("17.12.1991"), new Passport("4512", "325235")),
                new Person("Михайлов", "Константин", "Игоревич", getParse("18.05.1972"), new Passport("4500", "535344")),
               new Person("Александрова", "Мария", "Сергеевна", getParse("19.11.1985"), new Passport("4502", "154333")),
                new Person("Кузнецов", "Сергей", "Николаевич", getParse("17.07.1978"), new Passport("4504", "532212"))
        );
        System.out.println(personList1);
        System.out.println(expectedPersons);

        Assertions.assertNotNull(personList1);
        Assertions.assertEquals(expectedPersons.size(), personList1.size());
       for (int i = 0; i < expectedPersons.size(); i++) {
           Assertions.assertEquals(expectedPersons.get(i),personList1.get(i));

       }

    }

    @Test
    @DisplayName("Парсинг строки с ошибкой, объект не создается")

    public void getPersonsFromExcelErorrOnParsingTest() {

        List<Person> personList2 = FileHelper.getPersonsFromExcel(PATH, Persons2);
        Assertions.assertEquals(5, personList2.size());

    }

    @Test
    @DisplayName("Документ не существует - возращаем null")

    public void getPersonsFromExcelFileDoesNotExistTest() {
            List<Person> personList1 = FileHelper.getPersonsFromExcel(WRONGPATH, Persons1);
            // Assertions.assertEquals(null, personList1);
               Assertions.assertNull(personList1);

    }


    @Test
    @DisplayName("В документе нет указанного листа - возращаем null")

    public void getPersonsFromExcelSheetDoesNotExistTest() {
        List<Person> personList1 = FileHelper.getPersonsFromExcel(PATH, wrongSheet);
        Assertions.assertEquals(null, personList1);

    }


}