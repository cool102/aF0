package lesson4.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {

  public static void main(String[] args) throws ParseException {
    Human almaz = new Human();

    //установил фамилию
    almaz.setLastName("Саляхов");

    //установил имя
    almaz.setFirstName("Алмаз");

    //установил дату рождения
    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    Date parsedDate = sdf.parse("07.05.1984"); //парсинг строки в дату по шаблону выши

    Date today = new Date();
    Date tommorow = new Date(90000000000000L);

    almaz.setBirthDate(parsedDate);

    //получил фамилию
    almaz.getLastName();

    //получил имя
    almaz.getFirstName();

    //получил дату рождения
    almaz.getBirthDate();
    System.out.println("--------------------------");
    System.out.println("Проверочные кейсы на фамилию");
    almaz.setLastName("Са");
    almaz.setLastName("САЛЯХОВ");
    almaz.setLastName("SALYAKHOV");
    almaz.setLastName("САляхов");
    almaz.setLastName("саляхов");

    System.out.println("--------------------------");
    System.out.println("Проверочные кейсы на имя");
    almaz.setFirstName("Almaz");
    almaz.setFirstName("Ал");
    almaz.setFirstName("5Алмаз");
    almaz.setFirstName("Аlma3");


    System.out.println("--------------------------");
    System.out.println("Проверочные кейсы на дату");
    almaz.setBirthDate(today);
    almaz.setBirthDate(tommorow);
  }
}
