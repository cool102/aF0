package tests.lesson12.task1;

import lesson12.helpers.FileHelper;
import lesson12.helpers.JsonHelper;
import lesson12.model.Flat;
import lesson12.model.House;
import lesson12.model.Room;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JsonDeserializationTests {
    private final String roomPath = "src/main/java/lesson12/model/room.json";
    private final String flatPath = "src/main/java/lesson12/model/flat.json";
    private final String housePath = "src/main/java/lesson12/model/house.json";
    JsonHelper jsonHelper = new JsonHelper();

    FileHelper fileHelper = new FileHelper();


    @Test
    @DisplayName("Десериализация комнаты из Json")
    public void deserializeRoomTest(){
       String roomContext = fileHelper.getFileContext(roomPath);
       Room expectedRoom = (Room) jsonHelper.deserialize(roomContext, Room.class);
        Assertions.assertEquals(6, expectedRoom.getWidth());
        Assertions.assertEquals(5, expectedRoom.getHeight());

    }
    @Test
    @DisplayName("Десериализация квартиры из Json")
    public void deserializeFlatTest(){
        String flatContext = fileHelper.getFileContext(flatPath);
        Flat expectedFlat = (Flat) jsonHelper.deserialize(flatContext, Flat.class);
        Assertions.assertEquals(3, expectedFlat.getRooms().size());
        Assertions.assertEquals(4, expectedFlat.getRooms().get(0).getWidth());
        Assertions.assertEquals(3, expectedFlat.getRooms().get(0).getHeight());
        Assertions.assertEquals(2, expectedFlat.getRooms().get(2).getWidth());
        Assertions.assertEquals(3, expectedFlat.getRooms().get(2).getHeight());
    }
    @Test
    @DisplayName("Десериализация дома из Json")
    public void deserializeHouseTest(){
        String houseContext = fileHelper.getFileContext(housePath);
        House expectedHouse = (House) jsonHelper.deserialize(houseContext, House.class);
        Assertions.assertEquals(3, expectedHouse.getFlats().size());
        Assertions.assertEquals(1, expectedHouse.getFlats().get(1).getRooms().size());
        Assertions.assertEquals(3, expectedHouse.getFlats().get(2).getRooms().size());


    }
}
