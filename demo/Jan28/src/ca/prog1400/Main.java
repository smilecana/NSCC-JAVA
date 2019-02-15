package ca.prog1400;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // System.out.println("I am public");
        SpaceShip spaceX = new SpaceShip(
                1000,3.22,"Dragon");

        spaceX.launch();

        System.out.println("Report? " + spaceX.telemetry());


    }
}
