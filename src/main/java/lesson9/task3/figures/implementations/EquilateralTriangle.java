package lesson9.task3.figures.implementations;

import lesson9.task3.figures.TwoParameterFigure;

public class EquilateralTriangle extends TwoParameterFigure {

    @Override
    public double getArea() {
        return (parameter1*parameter2)/2;
    }

    @Override
    public double getLength() {
        return 3*parameter1;
    }

    }


