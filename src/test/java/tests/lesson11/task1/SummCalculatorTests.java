package tests.lesson11.task1;

import lesson11.task1.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SummCalculatorTests {


    @Test
    @DisplayName("Проверка метода калькулятора: суммирование n чисел")
    public void summTest() {
        Assertions.assertEquals(10, Calculator.summ(1, 2, 3, 4));
        Assertions.assertEquals(8, Calculator.summ(5,3));
    }
}
