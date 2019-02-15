package ca.prog1400;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* Main launcher = new Main();
        System.out.println(launcher.addSomeNumbers(3,7));
        System.out.println(launcher.addSomeNumbers(3,7,9));*/


       /*Car danger = null;
        System.out.println("What's the make? " + danger.getMake());

        Object z = new Object();
        System.out.println(z);

        Car toyota = new Car("Toyota","Rav4");
        System.out.println(toyota.toString());
        System.out.println(toyota);  //same result

        Animal cat = new Animal();
        */

       Animal[] zoo = new Animal[3];
       Animal zebra = new Animal("Zebra",300,"Savanah",false);
       Animal gorilla = new Animal("abc",100,"bcd",true);
       Animal giraffe = new Animal("dcd",20,"err",false);

       zoo[0] = zebra;
       zoo[1] = gorilla;
       zoo[2] = giraffe;

        for (int i = 0; i < zoo.length; i++) {
            Animal animal = zoo[i];
            System.out.println(animal);

            if(animal.isEndangered()){
                System.out.println(animal.feed("Nice food"));
            }
            else{
                System.out.println(animal.makeSound());
            }
        }

    }

    public int addSomeNumbers(int a, int b) {
        return a + b;
    }

    public int addSomeNumbers(int a, int b,int c) {
        return a + b + c;
    }
}
