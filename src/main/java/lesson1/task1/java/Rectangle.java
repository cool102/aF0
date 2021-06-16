public class Rectangle {

  boolean isSquareOfRectangleLargerThanPerimetr(int height, int width) {
    int perimetrOfRectangle = 2 * (height + width);
    int squareOfRectangle = height * width;
    return squareOfRectangle > perimetrOfRectangle;

  }

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    System.out.println(rectangle.isSquareOfRectangleLargerThanPerimetr(2, 7));
    System.out.println(rectangle.isSquareOfRectangleLargerThanPerimetr(6, 5));
    System.out.println(rectangle.isSquareOfRectangleLargerThanPerimetr(6, 3));
  }
}
