package tests.lesson13.task3;

import lesson13.task3.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FuncSummTests {
    @Test
    @DisplayName("вычислять сумму чисел в списке: положительные числа")

    public void pozitiveIntSummTest(){
        List<Integer> pozitiveIntegers = Arrays.asList(1,2,3,4);
        Assertions.assertEquals(10,Functions.summFunction.execute(pozitiveIntegers));
    }

    @Test
    @DisplayName("вычислять сумму чисел в списке: отриц. числа")

    public void negativeIntsummTest(){
        List<Integer> pozitiveIntegers = Arrays.asList(-1,-2,-3,-4);
        Assertions.assertEquals(-10,Functions.summFunction.execute(pozitiveIntegers));
    }

}
