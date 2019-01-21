package ca.prog1400;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //demo code: Explicit assignment of objects to array.
       /* Car[] garage = new Car[3];

        Car honda = new Car();
        Car dodge = new Car();
        Car nissan = new Car();

        garage[0] = honda;
        garage[1] = dodge;
        garage[2] = nissan;*/

       //This is the same as the 7 lines above
       Car[] garage = {new Car("honda"), new Car("dodge"), new Car("nissan")};


       //Accessing in the arry
        Car todaysRide = garage[2];
        todaysRide.accelerate(120);

        garage[2].accelerate(120);
        garage[1].accelerate(-120);

        for (int i = 0; i < garage.length; i++) {
            Car current = garage[i];
            // How do I get the current speed?
            System.out.println(current.currentSpeed);
            System.out.println(current.getSpeed());
            System.out.println(current.getSpeed());

        }



        for (int i = 0; i < garage.length; i++) {
            Car current = garage[i];
            // How do I get the current speed?
            System.out.println(current.getMake());
            //System.out.println(current.getSpeed());
//            System.out.println(current.getSpeed());
            current.start();
            current.accelerate(100);

        }

        Food [] picknicBasket = {
                new Food("Ronan","human"),
                new Food("carrot","vegetable"),
                new Food("candy","good")
        };

        for (int i = 0; i < picknicBasket.length; i++) {
            Food currentFood = picknicBasket[i];
            if(currentFood.getType() == "vegetable") {
                System.out.println(currentFood.denyIt());
            }
            else {
                System.out.println(currentFood.eatIt());
            }
        }

    }
}
