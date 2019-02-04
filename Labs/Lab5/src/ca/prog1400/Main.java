package ca.prog1400;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle[] circles = new Circle[3];

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(4);
        Circle circle3 = new Circle(8,"red");

        circles[0] = circle1;
        circles[1] = circle2;
        circles[2] = circle3;

        for (int i = 0; i < circles.length; i++) {
            Circle circleEx = circles[i];

            System.out.println(circleEx.toString());
            System.out.println(String.format("Area of this circle is: %.2f",circleEx.getArea()));

        }

    }
}
