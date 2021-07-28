package lesson11.task4;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthDate=" + birthDate +
                ", passport=" + passport +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(lastName, person.lastName) && Objects.equals(firstName, person.firstName) && Objects.equals(patronymic, person.patronymic) && Objects.equals(birthDate, person.birthDate) && Objects.equals(passport, person.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, patronymic, birthDate, passport);
    }

    String lastName;
    String firstName;
    String patronymic;
    LocalDate birthDate;
    Passport passport;


    public Person(String lastName,
                  String firstName,
                  String patronymic,
                  LocalDate birthDate,
                  Passport passport) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.passport = passport;
    }
}
