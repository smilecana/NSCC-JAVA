package ca.prog1400;
import java.awt.*;

public class Car {
    // Properties or Attributes. The Class State.
    String licensePlate;
    double avgMilesPerGallon;
    Color color;
    boolean tailLightsWorking;

    // Constructor
    public Car(String plate, double mpg,
               Color inputColor, boolean tailLights) {
        //USe the input parameters to initialize the class.
        this.licensePlate = plate;
        this.avgMilesPerGallon = mpg;
        this.color = inputColor;
        this.tailLightsWorking = tailLights;

    }
    //Behaviour
    public void driveQuick(){
        System.out.println(this.licensePlate + " goes Vroom Vroom!");
    }

}
