public class Zadacha7 {

  static void detemineAgeCategory(int age) {

    if (age > 24 && age < 90) {
      if (age >= 25 && age < 44)
        System.out.println("молодой возраст");
      if (age >= 44 && age < 60)
        System.out.println("средний возраст");
      if (age >= 60 && age < 75)
        System.out.println("пожилой возраст");
      if (age >= 75 && age <= 89)
        System.out.println("старческий возраст");
    } else System.out.println("неизвестный возраст");
  }

  public static void main(String[] args) {

    detemineAgeCategory(32);
    detemineAgeCategory(52);
    detemineAgeCategory(66);
    detemineAgeCategory(82);
    detemineAgeCategory(25);
    detemineAgeCategory(44);
    detemineAgeCategory(60);
    detemineAgeCategory(75);
    detemineAgeCategory(22);
    detemineAgeCategory(119);

  }

}