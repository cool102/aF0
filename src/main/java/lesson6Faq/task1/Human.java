package lesson6Faq.task1;

public class Human {
  String surname;
  String name;
  int age;
  String phoneNumber;

  public Human(String surname, String name, int age, String phoneNumber) {
    this.surname = surname;
    this.name = name;
    this.age = age;
    this.phoneNumber = phoneNumber;
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

  public String getPhoneNumber() {
    return phoneNumber;
  }
}
