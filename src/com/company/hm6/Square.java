package com.company.hm6;
//square - квадрат
public class Square implements Figure{
    int k;
    int kv;
    Square(int k) {
        this.k = k;
    }

    @Override
    public double Area() {
        kv = k * k;
        return kv;
    }
}