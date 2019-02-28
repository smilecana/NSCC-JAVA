package ca.prog1400.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoUI extends JFrame {
    private JTextField textfield;
    private JTextArea textarea;
    public DemoUI(){
        super();
        setTitle("Feb 28 Demo");
        setBounds(10,10,500,400);
        setVisible(true);
        setLayout(null); //absolute positioning

        //Add label for images
        JLabel label = new JLabel("Demo");
//        label.setBackground(Color.DARK_GRAY);
//        label.setOpaque(true) ; //To show its own background
        label.setIcon(new ImageIcon(getClass().getResource("/images/puppy.jpg")));
        label.setBounds(20,20,250,250);

        //add an image
        label.setVisible(true);

        add(label);

        JRadioButton button1 = new JRadioButton("Yes");
        button1.setBounds(280,30,100,20);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked Yes");
            }
        });
        add(button1);


        JRadioButton button2 = new JRadioButton("No");
        button2.setBounds(410,30,100,20);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Why don" +
                        "t you liike poodles?");
                System.out.println(textfield.getText());
            }
        });
        add(button2);

        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);

        // Add a textfield
        textfield = new JTextField();
        textfield.setBounds(280,60,200,20);

        add(textfield);

        // Add text
        textarea = new JTextArea();
        JScrollPane pane = new JScrollPane(textarea);
        textarea.setLineWrap(true);
        pane.setBounds(280,100,200,200);

        add(pane);

    }
}
