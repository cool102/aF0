package lesson9.task3.figures.implementations;

import lesson9.task3.figures.OneParameterFigure;

public class Circle extends OneParameterFigure {

    @Override
    public double getArea() {
        return 3.14* parameter1 * parameter1;
    }

    @Override
    public double getLength() {
        return 2*3.14* parameter1;

    }
}
