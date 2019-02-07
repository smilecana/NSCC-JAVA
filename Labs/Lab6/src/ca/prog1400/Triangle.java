package ca.prog1400;
import java.awt.*;


public class Triangle extends Shape {

    private double height;
    private double bottom;

    public Triangle(String color, String size, double height, double bottom) {
        super(color,size);
        this.height = height;
        this.bottom = bottom;
    }

    public double getArea() {
        return this.height*this.bottom/2;
    }
}
