package lesson3.task1;

public class Calculator {
  /**
   * метод складывает 2 числа
   *
   * @param a
   * @param b
   * @return
   */
  int summ(int a, int b) {
    int s = a + b;
    return s;
  }

  /**
   * метод вычитает из числа a второе число b
   *
   * @param a
   * @param b
   * @return
   */
  int substract(int a, int b) {
    int s = a - b;
    return s;

  }

  /**
   * метод уменожает 2 числа
   *
   * @param a
   * @param b
   * @return
   */
  int multiply(int a, int b) {
    int s = a * b;
    return s;

  }

  /**
   * метод делит число а на число б, остаток отбрасывает
   *
   * @param a
   * @param b
   * @return
   */
  int devide(int a, int b) {
    int s = a / b;
    return s;

  }
}
