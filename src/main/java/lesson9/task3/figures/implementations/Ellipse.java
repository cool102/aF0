package lesson9.task3.figures.implementations;

import lesson9.task3.figures.TwoParameterFigure;

public class Ellipse extends TwoParameterFigure {

    @Override
    public double getArea() {
        return Math.PI * parameter1 * parameter2;
    }

    @Override
    public double getLength() {
        int a = (int) Math.max(parameter1, parameter2);
        int b = (int) Math.min(parameter1, parameter2);
        return 4d * (Math.PI * a * b + a - b) / (a + b);
    }
}
