package lesson12.helpers;

import com.google.gson.Gson;
import lesson12.model.Generatable;

public class JsonHelper implements SerializeHelper{
    @Override
    public Generatable deserialize(String json, Class clazz) {
        return (Generatable) new Gson().fromJson(json,clazz);
    }

    @Override
    public String serialize(Generatable object) {
        return  new Gson().toJson(object);
    }
}
