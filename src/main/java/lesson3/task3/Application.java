package lesson3.task3;


public class Application {
  /**
   * создана семья из 8 человек
   */
  //дед и бабушка
  Human valeri = new Human("Валерий", 65, null, null);
  Human alexandra = new Human("Александра", 63, null, null);
  Human ivan = new Human("Иван", 70, null, null);
  Human momOfMarina = new Human(null, 0, null, null);


  //родители
  Human sergey = new Human("Сергей", 35, alexandra.name, valeri.name);
  Human marina = new Human("Марина", 35, momOfMarina.name, ivan.name);
  //дети
  Human vitali = new Human("Виталий", 7, marina.name, sergey.name);
  Human elena = new Human("Елена", 10, marina.name, sergey.name);

  /**
   * создан массив предки с бабушками и дедушками Елены
   */
  public static void main(String[] args) {
    Human[] grandMomsAndGrandFathersOfElena = new Human[4];
    grandMomsAndGrandFathersOfElena[0] = new Human("Валерий", 65, null, null);
    grandMomsAndGrandFathersOfElena[1] = new Human("Александра", 63, null, null);
    grandMomsAndGrandFathersOfElena[2] = new Human("Иван", 70, null, null);
    grandMomsAndGrandFathersOfElena[3] = new Human(null, 0, null, null);


    /**
     * вывести произвольного предка Елены на экран
     */
    for (Human current : grandMomsAndGrandFathersOfElena
    ) {
      System.out.printf("Предок Елены, с именем: %s %s, с возрастом %d", current.name, current.nameOfFather, current.age);
      System.out.println();

    }

  }
}