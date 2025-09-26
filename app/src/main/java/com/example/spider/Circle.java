package com.example.spider;

public class Circle extends Shape{
    int radius;

    // Constructor
    public Circle(int x, int y, int radius) {
        super(x, y);       // calls Shape(int x, int y)
        this.radius = radius;
    }

    
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}