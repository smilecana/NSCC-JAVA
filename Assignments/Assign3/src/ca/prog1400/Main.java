package ca.prog1400;

import ca.prog1400.UI.MainFrame;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Here's where you  and make your frame visible
                    GuiPanel frame = new GuiPanel();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });*/

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Here's where you  and make your frame visible
                    MainFrame frame = new MainFrame();

                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
