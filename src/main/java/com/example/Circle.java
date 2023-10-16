package com.example;

public class Circle extends Shape {

    // TODO: Define attributes for the circle
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // TODO: Implement the method
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        // TODO: Implement the method
        return 2 * Math.PI * radius;
    }
}