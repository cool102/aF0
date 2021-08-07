package tests.lesson13.task3;

import lesson13.task3.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FuncToStringTests {

    @Test
    @DisplayName("Тестирование выполнения метода toString(): Cat")

    public void catToStringTests() {
        class Cat {
            private String name;
            private int age;

            @Override
            public String toString() {
                return String.format("Имя:%s, возраст:%d", name, age);
            }

            private Cat(String name, int age) {
                this.name = name;
                this.age = age;

            }
        }
        Cat cat = new Cat("Барсик", 5);
        Assertions.assertEquals("Имя:Барсик, возраст:5", Functions.toStringFunction.execute(cat));
    }

    @Test
    @DisplayName("Тестирование выполнения метода toString(): String")

    public void stringToStringTests() {
        Assertions.assertEquals("Строка", Functions.toStringFunction.execute("Строка"));
    }

    @Test
    @DisplayName("Тестирование выполнения метода toString(): Object")

    public void objectToStringTests() {
        Object object = new Object();
        Assertions.assertEquals(object.getClass().getName()+"@"+Integer.toHexString(object.hashCode()), Functions.toStringFunction.execute(object));
    }



}
