package lesson4.task1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * создан класс Human c полями фамилия, имя, дата рождения
 * конструктор без параметров
 * геттеры - вывести поле с сообщением в консоль(3 методы)
 * сеттеры (фамиля и имя из кириллицы,первая буква заглавная,
 * остальные строчыне, общая длина не меее 3 символы)
 * дата рождение -не позже сегодняшнего дня.
 * если поля имют некорректное знач сообщение в консоль
 */

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
        boolean matches = lastName.matches("\\b[А-Я]\\B[а-я]{2,}+");
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
            String formatedDate = sdf.format(birthDate); //парсинг строки в дату по шаблону выше);
            setInCorrectPrint(DATEBIRTH, formatedDate);

        } else {

            this.birthDate = birthDate;
            String formatedDate = sdf.format(birthDate); //парсинг строки в дату по шаблону выше);
            setCorrectPrint(DATEBIRTH, formatedDate);
        }
    }

    //получаем фамилию
    void getLastName() {
        getPrint(LASTNAME, lastName);

    }

    //получаем имя
    void getFirstName() {
        getPrint(FIRSTNAME, firstName);
    }

    //получаем дату рождения
    void getBirthDate() {
        String formatedDate = sdf.format(this.birthDate); //парсинг строки в дату по шаблону выши
        getPrint(DATEBIRTH, formatedDate);
    }

    //печатаем сообщение о том что Геттер отработал
    void getPrint(String type, String string) {
        System.out.printf("Получено значение %s: %s\n", type, string);
    }

    //печатаем сообщение что сеттер принял значение
    void setCorrectPrint(String type, String string) {
        System.out.printf("Установлено корректное значение %s : %s\n", type, string);
    }

    //печатаем сообщение что сеттер вернул ошибку и не принял значение
    void setInCorrectPrint(String type, String string) {
        System.out.printf("Введенное значение %s некорректно: %s\n", type, string);
    }
}
