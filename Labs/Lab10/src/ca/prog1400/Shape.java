package ca.prog1400;

public class Shape {
    private String color;
    private String size;


    public Shape(String color, String size ) {
        this.color = color;
        this.size = size;
    }

    public double getArea() {
        return 0;
    }

    public String toString() {

        return String.format("Color is %s, Size is %s",this.color,this.size);
    }


}
