package ca.prog1400;

public class Circle {
    private double radius;
    private String colour;

    // default constructor
    public Circle() {
        this.radius = 2;
        this.colour = "green";
    }

    // constructor 2
    public Circle(double radius) {
        this.radius = radius;
        this.colour = "green";
    }

    // constructor 3
    public Circle(double radius,String colour) {
        this.colour = colour;
        this.radius = radius;
    }

    // method: getArea
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    //toString() method
    public String toString() {
        return String.format("Radius = %.2f, Colour = %s",this.radius,this.colour);
    }


    //Getters in radius
    public double getRadius() {
        return radius;
    }

    //getters in colour
    public String getColour() {
        return colour;
    }
}
