package lesson3.task4;

public class Application {

  public static void main(String[] args) {
    Human Alex = new Human("Александр");
    Human Egor = new Human("Егор");
    Human Grig = new Human("Григорий");
    Human Stan = new Human("Станислав");
    Human Mikh = new Human("Михаил");
    Human Vale = new Human("Валерий");
    Human Serg = new Human("Сергей");
    Alex.addFriend(Grig);
    Alex.addFriend(Egor);
    Alex.addFriend(Mikh);
    Egor.addFriend(Grig);
    Grig.addFriend(Serg);
    Mikh.addFriend(Stan);
    Stan.addFriend(Vale);
    Vale.addFriend(Serg);
    System.out.println(areFriends(Serg,Grig));
    System.out.println(areFriends(Serg,Alex));
    System.out.println(areFriends(Stan,Mikh));
    System.out.println(areFriends(Mikh,Vale));
  }

  /**
   * создан метод проверяющий являются ли два человека друзьями
   *
   * @param human1
   * @param human2
   * @return
   */
  static boolean areFriends(Human human1, Human human2) {
    for (Human currentInHuman1 : human1.friends)
      if (currentInHuman1 == human2) return true;
    return false;
  }
 }





