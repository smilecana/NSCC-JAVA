package ca.nscc.Classes;

import javax.swing.*;

public class Rectangle extends Shape {

    //Declare rectangle-specific properties
    private int length;
    private int width;

    //Constructors

    public Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

     //toString method to return a description of the object.
    @Override
    public String toString() {
        return "I'm a circle named " + super.getName() + ". My radius is " + this.length +
                " and my width is " + this.width +  ". " + super.toString()  ;
    }

    //Rectangle's implementation of the inherited getArea() method
    @Override
    public double getArea() {
        //Area = length * width
        return this.length * this.width;
    }

    @Override
    public String getDimensionsString() {
        return "Length: " + this.length + ", Width: " + this.width;
    }


}
