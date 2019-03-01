package ca.prog1400;

import javax.swing.*;

public class Lab9 extends JFrame {
    public Lab9 (){
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        setTitle("Lab9");

        JButton leftButton = new JButton("Left button");
        leftButton.setBounds(75,0,150,150);

        JButton rightButton = new JButton("Right button");
        rightButton.setBounds(375,0,150,50);

    }
}
