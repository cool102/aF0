package lesson9.task3;

import lesson9.task3.figures.Figure;
import lesson9.task3.figures.OneParameterFigure;
import lesson9.task3.figures.TwoParameterFigure;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        for (int i = 0; i < 18; i++) {
            figures.add(Generator.generateFigure());}

        for (Figure f:figures
             ) {
            if (f instanceof OneParameterFigure){
                System.out.printf("Класс фигуры %s [%s]: Длина - %.1f, Площадь - %.1f\n", f.getClass().getSimpleName(), f.getParameter1(), f.getLength(),f.getArea());
            } if (f instanceof TwoParameterFigure){
                System.out.printf("Класс фигуры %s [%s, %s]: Длина - %.1f, Площадь - %.1f\n", f.getClass().getSimpleName(), f.getParameter1(), ((TwoParameterFigure) f).getParameter2(), f.getLength(),f.getArea());
            }
        }

        }


    }

