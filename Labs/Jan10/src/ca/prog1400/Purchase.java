package ca.prog1400;
import java.util.Scanner;


public class Purchase {


    //Behivior
    public void calculateShipping() {

        System.out.println("Welcome to our shipping charging calculator!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your total purchase: ");
        double totalPur = scanner.nextInt();
        if (totalPur < 50){
            totalPur +=10;
            System.out.println("Your shipping fee is: $10.0");
        }
        else {
            System.out.println("Your final total costs is: free");
        }
        System.out.println("Your final total costs is: $" + totalPur);

    }
}
