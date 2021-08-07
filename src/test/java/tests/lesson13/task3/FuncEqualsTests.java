package tests.lesson13.task3;

import lesson13.task3.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FuncEqualsTests {
    @Test
    @DisplayName("Все ли объекты эквививаленты: все эквиваленты")

    public void equalObjTest(){
        Object object1= new Object();
        Object object2 = object1;
        List<Object> equalObjects = Arrays.asList(object1,object2);
        Assertions.assertTrue((Boolean) Functions.onlyEqualsObjects.execute(equalObjects));
    }


    @Test
    @DisplayName("Все ли объекты эквививаленты: не все эквиваленты")

    public void notEqualObjTest(){
        Object object1= new Object();
        Object object5 = new Object();
        List<Object> notEqualObjects = Arrays.asList(object1,object5);
        Assertions.assertFalse((Boolean) Functions.onlyEqualsObjects.execute(notEqualObjects));
    }

    @Test
    @DisplayName("Все ли объекты эквививаленты: пустой список")

    public void zeroListObjTest(){
        List<Object> zeroList = Arrays.asList();
        Assertions.assertTrue((Boolean) Functions.onlyEqualsObjects.execute(zeroList));
        Assertions.assertTrue((Boolean) Functions.onlyEqualsObjects.execute(Collections.EMPTY_LIST));
    }

}
