package main.lesson2.java;

import java.util.Locale;

public class Strings {
  public static void main(String[] args) {
    // Обхявление строки
    String string = "Новая строка";



    // Выделение подстроки из строки


    String upper =string.toUpperCase();
    String lower =string.toLowerCase();
    System.out.println(upper);
    System.out.println(lower);

    // replace
    String replacedString = string.replace("о","0");
    System.out.println(replacedString);
    //String regexReplacedString = string.replaceAll();
    String passport = "8006 123123";
    boolean matches = passport.matches("^\\d{4} \\d{6}$");
    System.out.println(matches);

  }
}
