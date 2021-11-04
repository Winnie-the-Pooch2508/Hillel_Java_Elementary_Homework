package com.company.hm6;

public class Circle implements Figure {
    double r;
    double pi = 3.1415;

    Circle(double r) {
        this.r = r;
    }
    @Override
    public double Area() {
        double p = pi * r * r;
        return p;
    }
}
