package ca.prog1400;

public class Car extends Vehicle {

    private String make;

    public Car(int speed, String make) {
        super(speed);      // Call parent constructor with same method signature.
        this.make = make;
    }

}
