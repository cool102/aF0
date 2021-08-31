package lesson16.task1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AirplaneApplication {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Airplane plane = new Airplane();
        Class<Airplane> clazz = Airplane.class;
        Field planeSpeedField = clazz.getDeclaredField("speed");
        planeSpeedField.setAccessible(true);
        planeSpeedField.set(plane, 230);

        Method inspectMethod = clazz.getDeclaredMethod("inspect");
        inspectMethod.setAccessible(true);
        inspectMethod.invoke(plane);

        Method flyMethod = clazz.getDeclaredMethod("fly");
        flyMethod.setAccessible(true);
        flyMethod.invoke(plane);

    }
}
