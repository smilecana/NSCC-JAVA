package ca.prog1400;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] myDoubles = new double[5];

        int [] myInts = new int[5];
//        for (int i = 0; i < myDoubles.length; i++) {
//            myDoubles[i] = getUserInput(i+1);
//        }

        for (int i = 0; i < myInts.length; i++) {
            myInts[i] = getUserInputInt(i);
        }
        //Arrays.toString() <- prints contents of array
        System.out.println(Arrays.toString(myInts));

        for (int i = 0; i < myInts.length; i++) {
            myInts[i] = getValidUserInt(i);
        }
    }

    private static int getUserInputInt(int num) {
        int returnValue = -1;

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        returnValue = Integer.parseInt(input);
        return returnValue;
    }

    private static double getUserInput(int num) {
        double returnValue;
        System.out.println(
                String.format("%d. Give me number: ",num));
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextDouble()){
            returnValue = sc.nextDouble(); //compile time
        } else {
            returnValue = -1;
            System.out.println("You didn't enter a number.");
            System.out.println("Assuming value is -1.");
        }
        /*try {
            returnValue = sc.nextDouble();
        } catch(InputMismatchException exception) { //run time
            // what do I do?
            returnValue = -1;
            System.out.println("You didn't enter a number.");
            System.out.println("Assuming value is -1.");
        }*/
        return returnValue;
    }

    private static int getValidUserInt(int num) {
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a number");
            while(!sc.hasNextInt()){
                System.out.println("Enter a positive number.");
                sc.next();
            }
            number = sc.nextInt();  //
        }while(number < 0);
        return number;
    }




}
