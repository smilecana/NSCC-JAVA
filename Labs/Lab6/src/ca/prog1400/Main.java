package ca.prog1400;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Square square = new Square("red","small",10,10 );
        System.out.println(square.toString());
        System.out.println(String.format("This square area is %.2f\n",square.getArea()));

        Circle circle = new Circle("green","big", 100);
        System.out.println(circle.toString());
        System.out.println(String.format("This circle area is %.2f\n",circle.getArea()));

        Triangle triangle = new Triangle("black","small", 10,10);
        System.out.println(triangle.toString());
        System.out.println(String.format("This triangle area is %.2f\n",triangle.getArea()));

    }
}
