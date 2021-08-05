package tests.lesson12.task1;

import lesson12.task1.helpers.FileHelper;
import lesson12.task1.helpers.JsonHelper;
import lesson12.task1.helpers.XmlHelper;
import lesson12.task1.model.House;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SerializationTests {
    private final JsonHelper jsonHelper = new JsonHelper();
    private final XmlHelper xmlHelper = new XmlHelper();
    private final FileHelper fileHelper = new FileHelper();
    private  final String pathJson= "src/main/java/lesson12/model/expected_json.json";
    private  final String pathXml= "src/main/java/lesson12/model/expected_xml.xml";
    String expectedHouseJson = fileHelper.getFileContext(pathJson);
    String expectedHouseXml = fileHelper.getFileContext(pathXml);

    House actualHouse = new House().generate();

    @Test
    @DisplayName("Сериализация house в json")
    public void houseJsonSerialization() {

        String actualHouseJson = jsonHelper.serialize(actualHouse);
        Assertions.assertEquals(actualHouseJson,expectedHouseJson);
    }

    @Test
    @DisplayName("Сериализация house в xml")
    public void houseXMLSerialization() {
        String actualHouseXml = xmlHelper.serialize(actualHouse);
        Assertions.assertEquals(actualHouseXml,expectedHouseXml);
    }

}
