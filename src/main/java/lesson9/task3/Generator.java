package lesson9.task3;

import lesson9.task3.figures.*;
import lesson9.task3.figures.implementations.*;

public class Generator {
    private static int roundRobin = 0;

    public static Figure generateFigure(){
        roundRobin %= 6;
        switch (roundRobin++) {
            case 0:
                return new Square();
            case 1:
                return new Circle();
            case 2:
                return new EquilateralTriangle();
            case 3:
                return new Rectangle();
            case 4:
                return new Ellipse();
            case 5:
                return new RightTriangle();
        }
        return null;

    }
}
