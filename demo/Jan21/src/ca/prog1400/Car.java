package ca.prog1400;

public class Car {

    int currentSpeed = 0;
    String make;

    public Car(String make) {
        this.make = make;
        //no other code here, apart from class initialization


    }
    public void start() {
        System.out.println("start");
    }



    public void accelerate(int speed) {
        //set the speed on this car
        if(speed > 150){
            System.out.println("that's illegal");
            return;
        }else if(speed < 0){
            System.out.println("impossible");
            return;
        }
        this.currentSpeed = speed;
        System.out.println("Voom");
    }

    public int getSpeed(){
        return this.currentSpeed;
    }

    public String getMake() {
        return this.make;
    }

    public void floorIt() {
        System.out.println("hello");
    }
}
