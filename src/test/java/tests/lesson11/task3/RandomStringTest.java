package tests.lesson11.task3;

import lesson11.task3.Generator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomStringTest {
    Generator generator = new Generator();
    @Test
    @DisplayName("Тест границ генератора случайной строки")
    public void stringGeneratorTest() {
        for (int i = 0; i < 10_000; i++) {
            int from  = new Random().nextInt(1_000);
            int to = 1_000+new Random().nextInt(1_000);
            int actual = generator.randomString(from, to).length();
            Assertions.assertEquals(from, actual,to-from);
        }
    }
}
