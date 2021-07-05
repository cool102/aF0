package lesson9.task2;

public class Action {
    public static void doAction(Object o) {
        if (o instanceof Drawable) {
            ((Drawable) o).draw();
        }
        if (o instanceof Movable) {
            ((Movable) o).move();
        }

    }
}
