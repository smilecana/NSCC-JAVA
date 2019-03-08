package ca.nscc.Classes;

public abstract class Shape {

    //Declare properties of ANY shape
    private String name;


    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Define a getArea() method, to be inherited by subclasses
    public abstract double getArea();
    public abstract String getDimensionsString();

    @Override
    public String toString() {
        return  "My area is " + getArea() + ".";
    }
}
