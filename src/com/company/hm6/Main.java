package com.company.hm6;
public class Main {
    public static double getSumArea(Figure[] figure) {
        double result = 0.0;
        for (Figure value : figure) {
            result += value.Area();
        }
        System.out.println("Square area = " + result);
        return result;
    }
    public static void main(String[] args) {
        Figure[] figure = getFigure();
    }
    static Figure[] getFigure() {
        return new Figure[]{
                new Circle(3.0), new Square(8), new Triangle(3.5, 1.8, 2.2)
        };
    }
}