package lesson9.task3.figures.implementations;

import lesson9.task3.figures.TwoParameterFigure;

public class RightTriangle extends TwoParameterFigure {


    @Override
    public double getArea() {
        return (parameter1*parameter2)/2;
    }

    @Override
    public double getLength() {
        return parameter1+parameter2+getHypotinuse();
    }

    double getHypotinuse(){
        return Math.sqrt(parameter1*parameter1+parameter2*parameter2);
    }
}
