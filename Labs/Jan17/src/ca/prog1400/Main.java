package ca.prog1400;
//package java.lang;

public class Main {
    boolean renInServerMode = false;
    static int globlev = 10;

    public Main() {

    }


    public static void main(String[] args) {
	// write your code here
        System.out.println("Main");
        //Make a main instance/object
        Main main = new Main();
        printAline();

        Astronant a1 = new Astronant("Major Tom",32);
        Astronant a2 = new Astronant("Boss",67);
        Astronant a3 = new Astronant("Ga",34);

        Astronant [] astronants = new Astronant[3];
        astronants[0] = a1;
        astronants[1] = a2;
        astronants[2] = a3;

        //Astronant [] astronants1 = {a1, a2, a3};

        for (int i = 0; i < astronants.length; i++) {
            Astronant astronant = astronants[i];
            double oxygen = astronant.groundDontrol();
            System.out.println(
                    String.format("Astronaut %d o2 level = %.2f%%", i+1, oxygen)
            );
        }
    }

    public static void printAline() {
        System.out.println("============");
    }

}

