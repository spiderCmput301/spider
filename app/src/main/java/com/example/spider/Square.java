package com.example.spider;

public class Square extends Shape {
    int side;

    // Constructor
    public Square(int x, int y, int side) {
        super(x, y);      // calls Shape(int x, int y)
        this.side = side;
    }
}
