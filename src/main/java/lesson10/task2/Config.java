package lesson10.task2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    static Properties properties = new Properties();


    static {
        try {
            properties.load(new FileInputStream("D:/devel/aF0/src/main/java/lesson10/task2/application.properties"));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    private static Boolean getBooleanProperty(String key, Boolean defaultValue) {
        return Boolean.parseBoolean(properties.getProperty(key));
    }

    static Integer getIntegerProperty(String key) {
        return Integer.parseInt(properties.getProperty(key));
    }

    static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
