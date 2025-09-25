package com.example.spider;

import android.graphics.drawable.shapes.Shape;

public abstract class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius) {
        super();
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

