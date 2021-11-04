package com.company.hm6;
// Triangle - треугольник
public class Triangle implements Figure{
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double Area() {
        if (((a + b) < c) || ((b + c) < a) || ((a + c) < b)) {
            return 0.0;
        }
        double p = (a + b + c) / 2;
        double s;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}