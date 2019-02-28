package ca.prog1400;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SwingPanel extends JFrame {
    private JPanel panelOne;
    private JPanel panelTwo;

    public SwingPanel() {
        super();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,600,250);
        setTitle("Take a swing!");
//
        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new CardLayout(0, 0));
        getContentPane().setLayout(new BorderLayout());


        panelOne = new JPanel();
        panelOne.setBackground(Color.BLUE);
        panelOne.setPreferredSize(new Dimension(300, 100));
        contentPane.add(panelOne,BorderLayout.WEST);
        panelOne.setLayout(null);

        panelTwo = new JPanel();
        panelTwo.setBackground(Color.RED);
        panelTwo.setPreferredSize(new Dimension(300, 100));
        contentPane.add(panelTwo,BorderLayout.EAST);
        panelTwo.setLayout(null);

        JPanel panelNor = new JPanel();
        panelNor.setPreferredSize(new Dimension(600, 50));
        contentPane.add(panelNor,BorderLayout.NORTH);
        panelNor.setLayout(null);


        JButton button1 = new JButton();
        button1.setText("Toggle Left");
        button1.setBounds(80,0,160,50);
        panelNor.add(button1);

        JButton button2 = new JButton();
        button2.setText("Toggle Right");
        button2.setBounds(380,0,160,50);
        panelNor.add(button2);

        JLabel label1 = new JLabel("This is the left pane!",JLabel.CENTER);
        label1.setBounds(0,0,300,50);
        label1.setForeground(Color.red);
        label1.setFont(new Font("", Font.BOLD, 20));
        panelOne.add(label1);

        JLabel label2 = new JLabel("This is the right pane!",JLabel.CENTER);
        label2.setBounds(0,0,300,50);
        label2.setForeground(Color.blue);
        label2.setFont(new Font("", Font.BOLD, 20));
        panelTwo.add(label2);




    }
}
