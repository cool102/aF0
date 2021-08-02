package tests.lesson12.task1;

import lesson12.helpers.FileHelper;
import lesson12.helpers.XmlHelper;
import lesson12.model.Flat;
import lesson12.model.House;
import lesson12.model.Room;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class XmlDeseriliazationTests {
    String roomXmlPath = "src/main/java/lesson12/model/room.xml";
    String flatXmlPath = "src/main/java/lesson12/model/flat.xml";
    String houseXmlPath = "src/main/java/lesson12/model/house.xml";
    XmlHelper xmlHelper = new XmlHelper();
    FileHelper fileHelper = new FileHelper();

    @Test
    @DisplayName("Десериализация room из xml")
    public void roomDeserilizationTest() {
        String roomXmlContext = fileHelper.getFileContext(roomXmlPath);
        Room actualRoom = (Room) xmlHelper.deserialize(roomXmlContext, Room.class);
        Assertions.assertEquals(6,actualRoom.getWidth());

    }

    @Test
    @DisplayName("Десериализация flat из xml")
    public void flatDeserilizationTest() {
        String flatXmlContext = fileHelper.getFileContext(flatXmlPath);
        Flat actualFlat = (Flat) xmlHelper.deserialize(flatXmlContext, Flat.class);
        Assertions.assertEquals(3, actualFlat.getRooms().size());
        Assertions.assertEquals(6, actualFlat.getRooms().get(1).getWidth());
    }

    @Test
    @DisplayName("Десериализация house из xml")
    public void houseDeserilizationTest() {
        String houseXmlContext = fileHelper.getFileContext(houseXmlPath);
        House expectedHouse = (House) xmlHelper.deserialize(houseXmlContext, House.class);
        Assertions.assertEquals(3,expectedHouse.getFlats().size());
    }


}
