public class Circle {
    int radius;
    final double PI = 3.14;

    double circleSquare(int rad) {
        radius = rad;
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.circleSquare(0));
        System.out.println(circle.circleSquare(2));
        System.out.println(circle.circleSquare(100));
    }
}
