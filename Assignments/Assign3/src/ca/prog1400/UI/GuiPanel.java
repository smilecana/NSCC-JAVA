package ca.prog1400.UI;

import javax.swing.*;
import java.awt.*;

public class GuiPanel extends JFrame {

    public GuiPanel() {
        super();
        setTitle("DND Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(30,30,600,600);
        setVisible(true);
        setLayout(null);

        // Panel1 main page
        JPanel panelMain = new JPanel();
        panelMain.setSize(600, 600);    //Using separate setSize and setLocation
        panelMain.setLocation(0,0);
        panelMain.setBackground(new Color(255,255,0));
        panelMain.setLayout(null);
        add(panelMain);

        // Main page Title
        JLabel titleLabel = new JLabel("Dragons and Dungeons");
        titleLabel.setBounds(150, 50, 400, 50);
        titleLabel.setFont(new Font("Arial",Font.BOLD, 24));
        titleLabel.setForeground(new Color(0,0,0));
        panelMain.add(titleLabel);

        // add image
        JLabel imageLabel = new JLabel();
        imageLabel.setBounds(40,120,530,350);
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/images/main.jpeg"));
        icon.setImage(icon.getImage().getScaledInstance(530, 350,Image.SCALE_DEFAULT));

        imageLabel.setIcon(icon);
        panelMain.add(imageLabel);

        //add a button
        JButton StartButton = new JButton("Build a Character");
        StartButton.setBounds(200, 500, 200, 50);
        StartButton.setFont(new Font("Arial",Font.BOLD, 20));
        panelMain.add(StartButton);


        // Second page
        JPanel panelPlay = new JPanel();
        panelPlay.setSize(600, 600);    //Using separate setSize and setLocation
        panelPlay.setLocation(0,0);
        panelPlay.setBackground(new Color(55,50,250));
        panelPlay.setLayout(null);
        add(panelPlay);

        panelPlay.setVisible(true);
        panelMain.setVisible(false);

        JLabel title2 = new JLabel("Character Generator");
        title2.setBounds(30, 10, 400, 50);
        title2.setFont(new Font("Arial",Font.BOLD, 24));
        title2.setForeground(new Color(0,0,0));
        panelPlay.add(title2);

        JLabel labelName = new JLabel("Enter Name");
        labelName.setBounds(30, 60, 200, 40);
        labelName.setFont(new Font("Arial",Font.BOLD, 22));
        labelName.setForeground(new Color(0,0,0));
        panelPlay.add(labelName);


        JTextField nameText = new JTextField();
        nameText.setBounds(200,60,150,40);
        panelPlay.add(nameText);

        JLabel label2 = new JLabel("Character Chap");
        label2.setBounds(30, 110, 200, 40);
        label2.setFont(new Font("Arial",Font.BOLD, 22));
        label2.setForeground(new Color(0,0,0));
        panelPlay.add(label2);

        JLabel label3 = new JLabel("Character Start");
        label3.setBounds(330, 110, 200, 40);
        label3.setFont(new Font("Arial",Font.BOLD, 22));
        label3.setForeground(new Color(0,0,0));
        panelPlay.add(label3);


        JRadioButton button1 = new JRadioButton("Warrior");
        button1.setBounds(30,150,100,30);
        panelPlay.add(button1);

        JRadioButton button2 = new JRadioButton("Wizard");
        button2.setBounds(30,180,100,30);
        panelPlay.add(button2);

        JRadioButton button3 = new JRadioButton("Cleric");
        button3.setBounds(30,210,100,30);
        panelPlay.add(button3);

        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);
        group.add(button3);


        JTextArea text1 = new JTextArea();
        text1.setBounds(30,260,290,60);
        panelPlay.add(text1);


        JLabel label4 = new JLabel("Hit Points");
        label4.setBounds(330, 150, 100, 25);
        label4.setFont(new Font("Arial",Font.BOLD, 15));
        label4.setForeground(new Color(0,0,0));
        panelPlay.add(label4);

        JTextField textpoint = new JTextField();
        textpoint.setBounds(480,150,70,25);
        panelPlay.add(textpoint);

        JLabel label5 = new JLabel("Defense");
        label5.setBounds(330, 175, 100, 25);
        label5.setFont(new Font("Arial",Font.BOLD, 15));
        label5.setForeground(new Color(0,0,0));
        panelPlay.add(label5);

        JTextField text5 = new JTextField();
        text5.setBounds(480,175,70,25);
        panelPlay.add(text5);

        JLabel label6 = new JLabel("Agility");
        label6.setBounds(330, 200, 100, 25);
        label6.setFont(new Font("Arial",Font.BOLD, 15));
        label6.setForeground(new Color(0,0,0));
        panelPlay.add(label6);

        JTextField text6 = new JTextField();
        text6.setBounds(480,200,70,25);
        panelPlay.add(text6);

        JLabel label7 = new JLabel("Base Attack");
        label7.setBounds(330, 225, 100, 25);
        label7.setFont(new Font("Arial",Font.BOLD, 15));
        label7.setForeground(new Color(0,0,0));
        panelPlay.add(label7);

        JTextField text7 = new JTextField();
        text7.setBounds(480,225,70,25);
        panelPlay.add(text7);


        JButton roroll = new JButton("Reroll");
        roroll.setBounds(360, 260, 100, 40);
        roroll.setFont(new Font("Arial",Font.BOLD, 15));
        panelPlay.add(roroll);

        JLabel label8 = new JLabel("Character Chap");
        label8.setBounds(30, 330, 200, 40);
        label8.setFont(new Font("Arial",Font.BOLD, 22));
        label8.setForeground(new Color(0,0,0));
        panelPlay.add(label8);

        JRadioButton button8 = new JRadioButton("Warrior");
        button8.setBounds(30,380,100,30);
        panelPlay.add(button8);

        JRadioButton button9 = new JRadioButton("Wizard");
        button9.setBounds(30,410,100,30);
        panelPlay.add(button9);

        JRadioButton button10 = new JRadioButton("Cleric");
        button10.setBounds(30,440,100,30);
        panelPlay.add(button10);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(button8);
        group2.add(button9);
        group2.add(button10);

        JLabel label11 = new JLabel("Weapon Stats");
        label11.setBounds(330, 330, 200, 40);
        label11.setFont(new Font("Arial",Font.BOLD, 22));
        label11.setForeground(new Color(0,0,0));
        panelPlay.add(label11);

        JLabel label12 = new JLabel("Attack Modifier");
        label12.setBounds(330, 390, 130, 25);
        label12.setFont(new Font("Arial",Font.BOLD, 15));
        label12.setForeground(new Color(0,0,0));
        panelPlay.add(label12);

        JTextField text12 = new JTextField();
        text12.setBounds(480,390,70,25);
        panelPlay.add(text12);


        JLabel label13 = new JLabel("Character Chap");
        label13.setBounds(330, 420, 200, 25);
        label13.setFont(new Font("Arial",Font.BOLD, 15));
        label13.setForeground(new Color(0,0,0));
        panelPlay.add(label13);

        JTextField text13 = new JTextField();
        text13.setBounds(480,420,70,25);
        panelPlay.add(text13);

        JTextArea text2 = new JTextArea();
        text2.setBounds(30,480,290,70);
        panelPlay.add(text2);

        JButton startBattle = new JButton("Start Battle");
        startBattle.setBounds(360, 500, 200, 40);
        startBattle.setFont(new Font("Arial",Font.BOLD, 15));
        panelPlay.add(startBattle);




        // Result panel
        JPanel panelResult = new JPanel();
        panelResult.setSize(600, 600);    //Using separate setSize and setLocation
        panelResult.setLocation(0,0);
        panelResult.setBackground(new Color(155,155,150));
        panelResult.setLayout(null);
        add(panelResult);


        panelResult.setVisible(false);
//        panelMain.setVisible(false);


        JLabel title3 = new JLabel("Battle To The Death");
        title3.setBounds(150, 50, 500, 50);
        title3.setFont(new Font("Arial",Font.BOLD, 35));
        title3.setForeground(new Color(0,0,0));
        panelResult.add(title3);

        JLabel player = new JLabel("Player: ");
        player.setBounds(100, 100, 100, 50);
        player.setFont(new Font("Arial",Font.BOLD, 24));
        player.setForeground(new Color(0,0,0));
        panelResult.add(player);

        JLabel monster = new JLabel("Monster: ");
        monster.setBounds(350, 100, 150, 50);
        monster.setFont(new Font("Arial",Font.BOLD, 24));
        monster.setForeground(new Color(0,0,0));
        panelResult.add(monster);

        JTextArea testDisplay = new JTextArea();
        testDisplay.setBounds(50,300,500,200);
        panelResult.add(testDisplay);

        JButton againButton = new JButton("Play Again");
        againButton.setBounds(200, 520, 200, 50);
        againButton.setFont(new Font("Arial",Font.BOLD, 20));
        panelResult.add(againButton);

    }
}
