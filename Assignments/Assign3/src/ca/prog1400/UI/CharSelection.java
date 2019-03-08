package ca.prog1400.UI;

import javax.swing.*;
import java.awt.*;

public class CharSelection extends JPanel {

    public CharSelection() {

        setSize(600, 600);    //Using separate setSize and setLocation
        setLocation(0,0);
        setBackground(new Color(55,50,250));
        setLayout(null);

        JLabel title2 = new JLabel("Character Generator");
        title2.setBounds(30, 10, 400, 50);
        title2.setFont(new Font("Arial",Font.BOLD, 24));
        title2.setForeground(new Color(0,0,0));
        add(title2);

        JLabel labelName = new JLabel("Enter Name");
        labelName.setBounds(30, 60, 200, 40);
        labelName.setFont(new Font("Arial",Font.BOLD, 22));
        labelName.setForeground(new Color(0,0,0));
        add(labelName);


        JTextField nameText = new JTextField();
        nameText.setBounds(200,60,150,40);
        add(nameText);

        JLabel label2 = new JLabel("Character Chap");
        label2.setBounds(30, 110, 200, 40);
        label2.setFont(new Font("Arial",Font.BOLD, 22));
        label2.setForeground(new Color(0,0,0));
        add(label2);

        JLabel label3 = new JLabel("Character Start");
        label3.setBounds(330, 110, 200, 40);
        label3.setFont(new Font("Arial",Font.BOLD, 22));
        label3.setForeground(new Color(0,0,0));
        add(label3);


        JRadioButton button1 = new JRadioButton("Warrior");
        button1.setBounds(30,150,100,30);
        add(button1);

        JRadioButton button2 = new JRadioButton("Wizard");
        button2.setBounds(30,180,100,30);
        add(button2);

        JRadioButton button3 = new JRadioButton("Cleric");
        button3.setBounds(30,210,100,30);
        add(button3);

        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);
        group.add(button3);


        JTextArea text1 = new JTextArea();
        text1.setBounds(30,260,290,60);
        add(text1);


        JLabel label4 = new JLabel("Hit Points");
        label4.setBounds(330, 150, 100, 25);
        label4.setFont(new Font("Arial",Font.BOLD, 15));
        label4.setForeground(new Color(0,0,0));
        add(label4);

        JTextField textpoint = new JTextField();
        textpoint.setBounds(480,150,70,25);
        add(textpoint);

        JLabel label5 = new JLabel("Defense");
        label5.setBounds(330, 175, 100, 25);
        label5.setFont(new Font("Arial",Font.BOLD, 15));
        label5.setForeground(new Color(0,0,0));
        add(label5);

        JTextField text5 = new JTextField();
        text5.setBounds(480,175,70,25);
        add(text5);

        JLabel label6 = new JLabel("Agility");
        label6.setBounds(330, 200, 100, 25);
        label6.setFont(new Font("Arial",Font.BOLD, 15));
        label6.setForeground(new Color(0,0,0));
        add(label6);

        JTextField text6 = new JTextField();
        text6.setBounds(480,200,70,25);
        add(text6);

        JLabel label7 = new JLabel("Base Attack");
        label7.setBounds(330, 225, 100, 25);
        label7.setFont(new Font("Arial",Font.BOLD, 15));
        label7.setForeground(new Color(0,0,0));
        add(label7);

        JTextField text7 = new JTextField();
        text7.setBounds(480,225,70,25);
        add(text7);


        JButton roroll = new JButton("Reroll");
        roroll.setBounds(360, 260, 100, 40);
        roroll.setFont(new Font("Arial",Font.BOLD, 15));
        add(roroll);

        JLabel label8 = new JLabel("Character Chap");
        label8.setBounds(30, 330, 200, 40);
        label8.setFont(new Font("Arial",Font.BOLD, 22));
        label8.setForeground(new Color(0,0,0));
        add(label8);

        JRadioButton button8 = new JRadioButton("Warrior");
        button8.setBounds(30,380,100,30);
        add(button8);

        JRadioButton button9 = new JRadioButton("Wizard");
        button9.setBounds(30,410,100,30);
        add(button9);

        JRadioButton button10 = new JRadioButton("Cleric");
        button10.setBounds(30,440,100,30);
        add(button10);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(button8);
        group2.add(button9);
        group2.add(button10);

        JLabel label11 = new JLabel("Weapon Stats");
        label11.setBounds(330, 330, 200, 40);
        label11.setFont(new Font("Arial",Font.BOLD, 22));
        label11.setForeground(new Color(0,0,0));
        add(label11);

        JLabel label12 = new JLabel("Attack Modifier");
        label12.setBounds(330, 390, 130, 25);
        label12.setFont(new Font("Arial",Font.BOLD, 15));
        label12.setForeground(new Color(0,0,0));
        add(label12);

        JTextField text12 = new JTextField();
        text12.setBounds(480,390,70,25);
        add(text12);


        JLabel label13 = new JLabel("Character Chap");
        label13.setBounds(330, 420, 200, 25);
        label13.setFont(new Font("Arial",Font.BOLD, 15));
        label13.setForeground(new Color(0,0,0));
        add(label13);

        JTextField text13 = new JTextField();
        text13.setBounds(480,420,70,25);
        add(text13);

        JTextArea text2 = new JTextArea();
        text2.setBounds(30,480,290,70);
        add(text2);

        JButton startBattle = new JButton("Start Battle");
        startBattle.setBounds(360, 500, 200, 40);
        startBattle.setFont(new Font("Arial",Font.BOLD, 15));
        add(startBattle);
    }
}
