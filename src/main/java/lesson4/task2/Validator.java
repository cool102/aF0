package lesson4.task2;

public class Validator {

  private final String regexString = "^[\\S]+\\s[\\S]+\\s[\\S]+$";
  String inputString = "строки";
  String createdObject = "объекта";
  String array = "массива Human";

  /**
   * метод валидирует строку на 2 пробела
   */
  public boolean StringFormatValidation(String stringFromInput) {
    //валидна, если в строке 2 пробела
    //невалидна -вывести сообщение
    boolean matches = stringFromInput.matches(regexString);
   /* if (matches) {
      goodResultOfOperation(inputString);
    } else {
      badResultOfOperation(inputString);
    }*/
    return matches;
  }

  /**
   * метод возвращает массив строк разделением по пробелам
   */
  public String[] returnStringSpacedArray(String inputString) {
    //вывести результат операций
    return inputString.split(" ");
  }

  /**
   * метод валидирует Объект типа Human
   */
  public boolean isHumanValid(Human object) {

    boolean isHumanValid = object.getLastName() != null && object.getFirstName() != null && object.getBirthDate() != null;
   /* if (isHumanValid) {
      goodResultOfOperation(createdObject);

    } else {
      badResultOfOperation(createdObject);

    }*/
    return isHumanValid;
  }

  /**
   * метод валидирует массив объектов типа Human
   */
  public boolean isArrayOfHumanFull(Human[] arrayOfHuman) {

    boolean isArrayOfHumanFull = true;
    for (Human current : arrayOfHuman) {
      if (current == null) {
        //goodResultOfOperation(array);
        isArrayOfHumanFull = false;
        break;
      }
    }
    String output = isArrayOfHumanFull ?
            "массив полон" :
            "массив доступен для заполнения";
    System.out.println(output);
    return isArrayOfHumanFull;

  }
}






