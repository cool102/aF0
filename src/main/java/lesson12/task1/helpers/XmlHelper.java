package lesson12.task1.helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lesson12.task1.model.Generatable;

public class XmlHelper implements SerializeHelper {

    public XmlHelper() {
    }

    @Override
    public Generatable deserialize(String data, Class clazz) {
        XmlMapper xmlMapper = new XmlMapper();

        try {
            return (Generatable) xmlMapper.readValue(data, clazz);

        } catch (JsonProcessingException jpe) {
            throw  new RuntimeException(jpe);
        }

    }

    @Override
    public String serialize(Generatable object) {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            String xml = xmlMapper.writeValueAsString(object);
            return xml;
        } catch (JsonProcessingException jpe) {
            throw new RuntimeException(jpe);
        }

    }

}
