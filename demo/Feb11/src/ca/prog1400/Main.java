package ca.prog1400;
import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // Simple message dialog
//        JOptionPane.showMessageDialog(null,"Hello world Swing!");
//
//        JOptionPane.showMessageDialog(null,"Danger WIll Robinson!",
//                "Intro OOP",JOptionPane.ERROR_MESSAGE);
//
//        //
//        JOptionPane.showMessageDialog(null,"Be careful!",
//                "Intro OOP",JOptionPane.WARNING_MESSAGE);


//        //comfirm dialog
//        int val = JOptionPane.showConfirmDialog(null,"Basic Confirm");
//        System.out.println("Return value was " + val);


//        int val = JOptionPane.showConfirmDialog(null,
//                "Further Confirm","OOP Demo",JOptionPane.YES_NO_OPTION);
//        System.out.println("Return value was " + val);


        // assign the user
//        String userInput = JOptionPane.showInputDialog("Please enter a number (1-10");
//        System.out.println("userInput = " + userInput);// if no input, return empty string

//        Object[] myButtons = {"red","Green","Blue"};
//        int val = JOptionPane.showOptionDialog(null,
//                "What's your fave color?",
//                "Pick a Colour...",
//                JOptionPane.DEFAULT_OPTION,
//                JOptionPane.WARNING_MESSAGE,
//                null,myButtons,myButtons[1]);
//        System.out.println("myButtons[val] = " + myButtons[val]);


        //ArrayList
        ArrayList<String> strings = new ArrayList<>();
        strings.add("My");
        strings.add("Name");
        strings.add("is");
        strings.add("Me");
        strings.add("Name");


//        System.out.println("strings.contains() = "+ strings.contains("Name"));
//        System.out.println(strings.indexOf("Name"));
//        System.out.println(strings.lastIndexOf("Name"));


       // strings.add(Color.RED);  not leagle
//        for (int i = 0; i < strings.size(); i++) {
//            System.out.println("String is " + strings.get(i));
//        }
//
//        strings.clear();
//        System.out.println(strings.size());
//


        // foreach is very useful
        for (String currentString:strings) {
            System.out.println("currentString = " + currentString);
        }


    }
}
