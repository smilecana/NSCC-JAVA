package ca.prog1400.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Battle extends JPanel {

    private JLabel title;
    private JLabel player;
    private JLabel monster;
    private JTextArea textDisplay;
    private Font fontTitle = new Font("Old English Text MT",Font.BOLD, 35);
    private Font fontText = new Font("Arial",Font.BOLD, 24);

    public Battle() {

        setSize(600, 600);    //Using separate setSize and setLocation
        setBackground(new Color(98,168,96));
        setLayout(null);


        title = new JLabel("Battle To The Death");
        title.setBounds(150, 50, 500, 50);
        title.setFont(fontTitle);
        add(title);

        player = new JLabel("Player: ");
        player.setBounds(100, 100, 100, 50);
        player.setFont(fontText);
        add(player);

        monster = new JLabel("Monster: ");
        monster.setBounds(350, 100, 150, 50);
        monster.setFont(fontText);
        add(monster);

        textDisplay = new JTextArea();
        textDisplay.setBounds(50,300,500,200);
        add(textDisplay);

        JButton againButton = new JButton("Play Again");
        againButton.setBounds(200, 520, 200, 50);
        againButton.setFont(new Font("Old English Text MT",Font.BOLD, 20));
        againButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.getPage2().setVisible(true);
                setVisible(false);
            }
        });
        add(againButton);

    }
}
