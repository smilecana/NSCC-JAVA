package ca.prog1400;

public class Car {
    public static int carCount;

    private String model;
    private int currentspeed;

    //Constructor
    public Car(String model, int currentspeed) {
        this.model = model;
       // Car.carCount++;
        this.currentspeed = currentspeed;
    }

    //static function to set car count
    public static void setCarCount(int count) {
        carCount = count;
    }
    public static int getCarCount() {
        return Car.carCount;
    }
}

