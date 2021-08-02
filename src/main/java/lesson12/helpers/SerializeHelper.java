package lesson12.helpers;

import lesson12.model.Generatable;

public interface SerializeHelper <T extends Generatable>{
    T deserialize(String data, Class<T> clazz);
    String serialize(T object);

}
