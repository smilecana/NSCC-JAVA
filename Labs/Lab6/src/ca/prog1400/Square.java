package ca.prog1400;
import java.awt.*;


public class Square extends Shape {

    private int height;
    private int width;

    public Square(String color, String size, int height, int width) {
        super(color,size);
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.height*this.width;
    }




}

