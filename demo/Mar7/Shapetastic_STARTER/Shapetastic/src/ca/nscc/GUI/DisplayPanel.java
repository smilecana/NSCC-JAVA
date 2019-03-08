package ca.nscc.GUI;

import ca.nscc.Classes.Circle;
import ca.nscc.Classes.Rectangle;
import ca.nscc.Classes.Triangle;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel {

    private JTextArea displayText;

    public DisplayPanel() {

        Font myFont = new Font("Calibri", Font.BOLD, 24);

        //Set Panel Properties
        setLayout(null);

        JLabel choiceLabel = new JLabel("Your choice of shape is:");
        choiceLabel.setFont(new Font("Calibri", Font.BOLD, 24));
        choiceLabel.setBounds(50, 10, 250, 50);

        displayText = new JTextArea();
        displayText.setBounds(50, 50, 500, 200);
        displayText.setFont(myFont);
        displayText.setLineWrap(true);
        displayText.setEnabled(false);
        displayText.setWrapStyleWord(true);

        add(choiceLabel);
        add(displayText);
    }
}
