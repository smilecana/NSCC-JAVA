package ca.prog1400.UI;

import javax.swing.*;
import java.awt.*;

public class Battle extends JPanel {

    public Battle() {

        setSize(600, 600);    //Using separate setSize and setLocation
        setLocation(0,0);
        setBackground(new Color(155,155,150));
        setLayout(null);

        JLabel title3 = new JLabel("Battle To The Death");
        title3.setBounds(150, 50, 500, 50);
        title3.setFont(new Font("Arial",Font.BOLD, 35));
        title3.setForeground(new Color(0,0,0));
        add(title3);

        JLabel player = new JLabel("Player: ");
        player.setBounds(100, 100, 100, 50);
        player.setFont(new Font("Arial",Font.BOLD, 24));
        player.setForeground(new Color(0,0,0));
        add(player);

        JLabel monster = new JLabel("Monster: ");
        monster.setBounds(350, 100, 150, 50);
        monster.setFont(new Font("Arial",Font.BOLD, 24));
        monster.setForeground(new Color(0,0,0));
        add(monster);

        JTextArea testDisplay = new JTextArea();
        testDisplay.setBounds(50,300,500,200);
        add(testDisplay);

        JButton againButton = new JButton("Play Again");
        againButton.setBounds(200, 520, 200, 50);
        againButton.setFont(new Font("Arial",Font.BOLD, 20));
        add(againButton);

    }
}
