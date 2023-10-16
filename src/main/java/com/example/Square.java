package com.example;

public class Square extends Shape {

    // TODO: Define attributes for the square
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        // TODO: Implement the method
        return side * side;
    }

    @Override
    public double perimeter() {
        // TODO: Implement the method
        return 0;
    }
}