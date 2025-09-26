package com.example.spider;

public class Rectangle extends Shape{
    int length;
    int breadth;

    // Constructor
    public Rectangle(int x, int y, int length, int breadth) {
        super(x, y);       // calls Shape(int x, int y)
        this.length = length;
        this.breadth = breadth;
    }
}
