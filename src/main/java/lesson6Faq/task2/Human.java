package lesson6Faq.task2;

import java.util.Map;

public class Human {
    String surname;
    String name;
    int age;
    Map<TypeOfPhone, String> phonesOfHuman;


    public Human(String surname, String name, int age, Map<TypeOfPhone, String> phonesOfHuman) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.phonesOfHuman = phonesOfHuman;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Map<TypeOfPhone, String> getPhonesOfHuman() {
        return phonesOfHuman;
    }
}
