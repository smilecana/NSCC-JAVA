package ca.prog1400;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Here's where you create and make your frame visible
                    SwingPanel frame = new SwingPanel();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

/*
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Here's where you create and
                    // make your frame visible
                    Lab9Frame frame = new Lab9Frame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
*/

    }

}
