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

public class MainFrame extends JFrame {

    public MainFrame() {    //Constructor

        //Set Frame Properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 750, 750);
        setTitle("Shapetastic!");
        setLayout(new CardLayout());

        //Add Panel "screens"
        ChoosePanel chooseScreen = new ChoosePanel();
        DisplayPanel displayScreen = new DisplayPanel();
        add(chooseScreen);
        add(displayScreen);

    }
}
