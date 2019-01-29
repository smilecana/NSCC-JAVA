package ca.prog1400;

public class SpaceShip {
    protected int fuelLevel;
    private double o2level;

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    private String name;

    public SpaceShip(int fuelLevel, double o2level, String name) {
        this.fuelLevel = fuelLevel;
        this.o2level = o2level;
        this.name = name;
    }


    public void launch() {
        if(checkLaunchReady()) {
            System.out.println("We have lift off!!!");
        }
        else {
            System.out.println("Houston, we have a problem.");
        }
    }

    public String telemetry() {
        return String.format(
                "Houston, report from %s: \nfuel: %d\nO2: %.3f",
                this.name,this.fuelLevel,o2level);
    }

    private boolean checkLaunchReady() {
        if (this.fuelLevel > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
