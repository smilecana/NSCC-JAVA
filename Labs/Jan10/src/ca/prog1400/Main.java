package ca.prog1400;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

      /*  Car player1 = new Car("XYZ123", 34, Color.RED, true);
        Car player2 = new Car("ABC123", 60, Color.BLUE, false);

        player1.driveQuick();
        player2.driveQuick();

        //Strings
        String str1 = "hello world";
        System.out.println(str1.charAt(0));
        System.out.println(str1.contains("wor"));
        System.out.println(str1.split(" ")[0]);

        //Arrays
        int [] integers = {1,2,3,4,5};
        String [] strings = {"abc","dfs"};
        System.out.println(integers[3]);
        boolean [] bools = new boolean[3];
        bools[0] = true;
        System.out.println(bools[0]);
        System.out.println(bools[1]);

        //Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me string");
        String input = scanner.next(); //only print the next one word, not all words.
        System.out.println(input);
        String input2 = scanner.nextLine();
        System.out.println(input2);

        // Loops
        char[] myCharArray = {'A', 'B','V'};
        for (int i = 0; i<myCharArray.length;i++){
            System.out.println(myCharArray[i]);
        }
*/
      Purchase  purchase = new Purchase();
      purchase.calculateShipping();
    }
}
