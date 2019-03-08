package ca.nscc.GUI;

import ca.nscc.Classes.Circle;
import ca.nscc.Classes.Rectangle;
import ca.nscc.Classes.ShapeColor;
import ca.nscc.Classes.Triangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ChoosePanel extends JPanel {

    //Some controls need to be declared at the class level, if referenced in multiple places
    private JLabel dimensionsLabel;
    private JLabel imageLabel;
    private JTextField nameText;
    private JRadioButton rdoCircle;
    private JRadioButton rdoRectangle;
    private JRadioButton rdoTriangle;

    public ChoosePanel() {

        //Set font object
        Font myFont = new Font("Calibri", Font.BOLD, 24);

        //Set Panel Properties
        setLayout(null);
        setVisible(true);

        //Create all GUI objects
        addShapeRadios(myFont);

        //Label control for name
        JLabel nameLabel = new JLabel("Name your shape:");
        nameLabel.setFont(myFont);
        nameLabel.setBounds(50, 10, 200, 50);

        //Textfield control for name
        nameText = new JTextField();
        nameText.setFont(myFont);
        nameText.setBounds(260, 10, 200, 50);

        //Labels to show dimensions of each shape in a single field
        dimensionsLabel = new JLabel();
        dimensionsLabel.setFont(myFont);
        dimensionsLabel.setBounds(260, 70, 300, 50);

        //Label for shape image
        imageLabel = new JLabel();
        imageLabel.setBounds(500, 70, 150, 150);

        //Change screen button
        JButton displayBtn = new JButton("Display Selected");
        displayBtn.setFont(myFont);
        displayBtn.setBounds(500, 220, 200, 50);

        //Add all controls to Panel
        add(rdoCircle);
        add(rdoRectangle);
        add(rdoTriangle);
        add(nameLabel);
        add(nameText);
        add(imageLabel);
        add(dimensionsLabel);
        add(displayBtn);
    }

    private void addShapeRadios(Font myFont) {
        rdoCircle = new JRadioButton("Circle");
        rdoCircle.setFont(myFont);

        rdoRectangle = new JRadioButton("Rectangle");
        rdoRectangle.setFont(myFont);

        rdoTriangle = new JRadioButton("Triangle");
        rdoTriangle.setFont(myFont);

        rdoCircle.setBounds(50, 70, 150, 50);
        rdoRectangle.setBounds(50, 120, 150, 50);
        rdoTriangle.setBounds(50, 170, 150, 50);

        //ButtonGroup to group the radio buttons
        ButtonGroup grpColorRadios = new ButtonGroup();
        grpColorRadios.add(rdoCircle);
        grpColorRadios.add(rdoRectangle);
        grpColorRadios.add(rdoTriangle);
    }
}
