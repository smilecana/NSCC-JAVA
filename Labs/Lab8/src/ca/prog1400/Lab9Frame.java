package ca.prog1400;

import javax.swing.*;
import java.awt.*;

public class Lab9Frame extends JFrame {

    public Lab9Frame() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Take A Swing!");

        // Create, size and position left panel
        JPanel leftPanel = new JPanel();
        leftPanel.setSize(300,200);  //Using separate setSize and setLocation
        leftPanel.setLocation(0,50);
        leftPanel.setBackground(new Color(0,0,255));

        //Create, size and position left panel (red)
        JPanel rightPanel = new JPanel();
        rightPanel.setSize(300, 200);
        rightPanel.setLocation(300,50);
        rightPanel.setBackground(new Color(255,0,0));

        JLabel leftLabel = new JLabel("This is the left panel");
        leftLabel.setBounds(50, 50, 200, 30);
        leftLabel.setFont(new Font("Arial",Font.BOLD, 24));
        leftLabel.setForeground(new Color(255,0,0));

        //Create, size and position right label (blue text)
        JLabel rightLabel = new JLabel("This is the right panel");
        rightLabel.setBounds(50, 50, 200, 30);
        rightLabel.setFont(new Font("Arial",Font.BOLD, 24));
        rightLabel.setForeground(new Color(0,0,255));

        ////Create, size and position left button
        JButton leftButton = new JButton("Toggle Left");
        leftButton.setBounds(75, 0, 150, 50);

        ////Create, size and position right button
        JButton rightButton = new JButton("Toggle Right");
        rightButton.setBounds(375, 0, 150, 50);
        add(leftButton);
        add(rightButton);

        //Add each label to their respective panels
        leftPanel.add(leftLabel);
        rightPanel.add(rightLabel);

        add(leftPanel);
        add(rightPanel);
        setSize(600,250);    //Set size of window
        setLayout(null);                //Use no layout managers
        setVisible(true);
    }
}
