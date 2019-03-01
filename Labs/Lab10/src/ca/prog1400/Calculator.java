package ca.prog1400;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField textfield;


    public Calculator() {
        super();

        setTitle("Shape Calculator");
        setBounds(10,10,500,300);
        setVisible(true);
        setLayout(null); //absolute positioning

        JRadioButton button1 = new JRadioButton("Circle");
        button1.setBounds(50,50,100,20);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getValue = textfield.getText();
                if (getValue.length() > 0) {
                    System.out.println(getValue);
                    Circle circle = new Circle("green", "big", Integer.parseInt(getValue));
                    String message = String.format("Radius = %s \nArea = %.2f", getValue, circle.getArea());
                    JOptionPane.showMessageDialog(null, message);
                }
            }
        });
        add(button1);


        JRadioButton button2 = new JRadioButton("Triangle");
        button2.setBounds(50,100,100,20);
        add(button2);

        JRadioButton button3 = new JRadioButton("Rectangle");
        button3.setBounds(50,150,100,20);
        add(button3);

        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);
        group.add(button3);

        // Add a textfield
        textfield = new JTextField();
        textfield.setBounds(320,50,80,20);

        add(textfield);

        JLabel circleLabel = new JLabel("Radius:");
        circleLabel.setBounds(250, 50, 50, 20);
        circleLabel.setForeground(new Color(0,0,0));
        add(circleLabel);

    }
}
