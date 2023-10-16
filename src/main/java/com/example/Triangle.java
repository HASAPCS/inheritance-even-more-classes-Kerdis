package com.example;

public class Triangle extends Shape {

    // TODO: Define attributes for the triangle
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1 ,int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        // TODO: Implement the method
        double s = (side1 + side2 + side3) / 2;
        return  Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        // TODO: Implement the method
        return side1 + side2 + side3;
    }
}

// TODO: Implement similar classes for Circle and Square
