package ca.prog1400.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SplashPage extends JPanel {
    private static JButton StartButton;

    public SplashPage() {

            super();

            setSize(600, 600);    //Using separate setSize and setLocation
            setLocation(0,0);
            setBackground(new Color(98,186,96));
            setLayout(null);

            // Main page Title
            JLabel titleLabel = new JLabel("Dragons and Dungeons");
            titleLabel.setBounds(150, 50, 400, 50);
            titleLabel.setFont(new Font("Old English Text MT",Font.BOLD, 32));
            add(titleLabel);

            // add image
            JLabel imageLabel = new JLabel();
            imageLabel.setBounds(40,120,530,350);
            ImageIcon icon = new ImageIcon(this.getClass().getResource("/images/main.jpeg"));
            icon.setImage(icon.getImage().getScaledInstance(530, 350,Image.SCALE_DEFAULT));

            imageLabel.setIcon(icon);
            add(imageLabel);

            //add a button
            StartButton = new JButton("Build a Character");
            StartButton.setBounds(200, 500, 200, 50);
            StartButton.setFont(new Font("Old English Text MT",Font.BOLD, 20));
            StartButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    MainFrame.getCharSelectionPage().setVisible(true);
                    setVisible(false);
                }
            });
            add(StartButton);

    }

}
