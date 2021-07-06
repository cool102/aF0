package lesson4.task2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    private String lastName;
    private String firstName;
    private Date birthDate;
    String LASTNAME = "фамилии";
    String FIRSTNAME = "имени";
    String DATEBIRTH = "даты рождения";

    Human() {

    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");


    public void setLastName(String lastName) {
        //проверка длины  имени
        // проверка что первая буква Заглавная
        boolean matches = lastName.matches("\\b[А-Я]{1,1}\\B[а-я]+");
        if (lastName.length() >= 3 && matches) {
            this.lastName = lastName;
            setCorrectPrint(LASTNAME, lastName);
        } else {
            setInCorrectPrint(LASTNAME, lastName);
        }

    }

    //устанавливаем ИМЯ
    public void setFirstName(String firstName) {
        boolean matches = firstName.matches("\\b[А-Я]{1,1}\\B[а-я]+");
        if (firstName.length() >= 3 && matches) {
            this.firstName = firstName;
            setCorrectPrint(FIRSTNAME, firstName);
        } else {
            setInCorrectPrint(FIRSTNAME, firstName);
        }

    }

    //устанваливаем Дату рождения
    public void setBirthDate(Date birthDate) {
        if (birthDate.after(new Date())) {
            String formatedDate = sdf.format(birthDate); //парсинг строки в дату по шаблону выши);
            setInCorrectPrint(DATEBIRTH, formatedDate);

        } else {

            this.birthDate = birthDate;
            String formatedDate = sdf.format(birthDate); //парсинг строки в дату по шаблону выши);
            setCorrectPrint(DATEBIRTH, formatedDate);
        }
    }


    String getLastName() {
        return lastName;
    }


    String getFirstName() {
        return firstName;
    }


    String getBirthDate() {
        String formatedDate = sdf.format(this.birthDate); //парсинг строки в дату по шаблону выши
        return formatedDate;
    }


    void getPrint(String type, String string) {
        System.out.printf("Получено значение %s: %s\n", type, string);
    }


    void setCorrectPrint(String type, String string) {
        System.out.printf("Установлено корректное значение %s : %s\n", type, string);
    }


    void setInCorrectPrint(String type, String string) {
        System.out.printf("Введенное значение %s некорректно: %s\n", type, string);
    }
}
