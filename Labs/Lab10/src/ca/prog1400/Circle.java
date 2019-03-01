package ca.prog1400;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, String size, double radius) {
        super(color,size);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }



}
