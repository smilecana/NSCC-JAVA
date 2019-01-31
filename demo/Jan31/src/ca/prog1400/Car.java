package ca.prog1400;

public class Car {

    private String make;
    private String model;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }


    public Car() {
        /*this.make = "Honda";
        this.model = "Civic";*/
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Custom version fo toString. @return the make the model of the car
    public String toString() {
        return "Make: " + this.getMake() + "\nModel: " + this.getModel();
     }
}
