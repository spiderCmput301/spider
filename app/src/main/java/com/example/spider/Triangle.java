package com.example.spider;

public class Triangle extends Shape{
    int base;
    int height;

    public Triangle(int x, int y, int base, int height) {
        super(x, y);
        this.base = base;
        this.height = height;
    }
    public int area() {
        return (base * height) / 2;
    }
}