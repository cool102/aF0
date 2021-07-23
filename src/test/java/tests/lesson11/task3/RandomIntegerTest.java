package tests.lesson11.task3;

import lesson11.task3.Generator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomIntegerTest {

    Generator generator = new Generator();

    @Test
    @DisplayName("Тест границ генератора случайных чисел")
    public void integerGeneratorTest() {
        for (int i = 0; i < 10_000; i++) {
            int from  = new Random().nextInt(1_000);
            int to = 1_000+new Random().nextInt(1_000);
            int actual = generator.randomIntegr(from, to);
            Assertions.assertEquals(from, actual,to-from);
        }
    }

}

