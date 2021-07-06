package lesson9.task3.figures.implementations;


import lesson9.task3.figures.TwoParameterFigure;

public class Rectangle extends TwoParameterFigure {
    @Override
    public double getArea() {
        return parameter2*parameter1;
    }

    @Override
    public double getLength() {
        return 2*(parameter1+parameter2);
    }
}
