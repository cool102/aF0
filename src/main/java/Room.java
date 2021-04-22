import jdk.internal.org.objectweb.asm.Handle;

public class Room {
  Desk desk;
  Outlet outlet1;
  Outlet outlet2;
  Door door;
  Window window1;
  Window window2;

  static class Desk {
    int h;
    String material;
  }

  static class Outlet {
    int voltage;
    String type;
  }

  static class Door {
    DoorHandle doorHandle;
    String material;

    static class DoorHandle {
      String material;

    }
  }
  static class Window {
    String size;

  }

  public static void main(String[] args) {
    Room room = new Room();
  }
}
