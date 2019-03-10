package ca.prog1400.UI;

import ca.prog1400.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class CharSelection extends JPanel {

    private JLabel imageLabel;
    private JLabel title;
    private JLabel labelName;
    private JTextField nameText;
    private JLabel labelType;
    private JLabel labelStats;

    private JRadioButton rbWarrior;
    private JRadioButton rbWizard;
    private JRadioButton rbCleric;
    private JTextArea textType;

    private JLabel labelHit;
    private JLabel labelDefense;
    private JLabel labelAgility;
    private JLabel labelBase;

    private JTextField textHit;
    private JTextField textDefense;
    private JTextField textAgility;
    private JTextField textBase;
    private JButton rbReroll;

    private JLabel labelWeapon;
    private JRadioButton rbDagger;
    private JRadioButton rbSword;
    private JRadioButton rbHammer;
    private JTextArea textWeapon;
    private JLabel imageWeapon;

    private JLabel labelWStats;
    private JLabel labelAttack;
    private JLabel labelWeight;
    private JTextField textAttack;
    private JTextField textWeight;
    private JButton buttonStartBattle;
    Font choiceFont = new Font("Arial",Font.BOLD,15);
    Font lableFont = new Font("Old English Text MT", Font.BOLD, 22);

    private static String selectedPlayerName;
    private static String selectedCharater;
    private static int selectedWeaponIndex;
    private  ButtonGroup groupType;
    private  ButtonGroup groupWeapon;

    Random random = new Random();



    public CharSelection() {

        // JFrame setting
        setSize(600, 600);    //Using separate setSize and setLocation
        setBackground(new Color(98,186,96));
        setLayout(null);

        addCharacterRadios();
        addWeaponRadios();

        // setting player name
        title = new JLabel("Character Generator");
        title.setBounds(30, 10, 400, 50);
        title.setFont(new Font("Old English Text MT",Font.BOLD, 25));
        add(title);

        labelName = new JLabel("Enter Name");
        labelName.setBounds(30, 60, 200, 40);
        labelName.setFont(lableFont);
        add(labelName);


        nameText = new JTextField();
        nameText.setBounds(200,60,150,40);
        add(nameText);


        // character Types
        labelType = new JLabel("Character Type");
        labelType.setBounds(30, 110, 200, 40);
        labelType.setFont(lableFont);
        add(labelType);


        imageLabel = new JLabel();
        imageLabel.setBounds(180, 150, 90, 100);
        add(imageLabel);

        textType = new JTextArea(3,5);
        textType.setBounds(30,260,290,70);
        textType.setLineWrap(true);
        textType.setEnabled(false);
        textType.setWrapStyleWord(true);
        add(textType);



        // character Stats
        labelStats = new JLabel("Character Stats");
        labelStats.setBounds(330, 110, 200, 40);
        labelStats.setFont(lableFont);
        add(labelStats);


        labelHit = new JLabel("Hit Points");
        labelHit.setBounds(330, 150, 100, 25);
        labelHit.setFont(choiceFont);
        add(labelHit);

        textHit = new JTextField();
        textHit.setBounds(480,150,70,25);
        add(textHit);

        labelDefense = new JLabel("Defense");
        labelDefense.setBounds(330, 175, 100, 25);
        labelDefense.setFont(choiceFont);
        add(labelDefense);

        textDefense = new JTextField();
        textDefense.setBounds(480,175,70,25);
        add(textDefense);

        labelAgility = new JLabel("Agility");
        labelAgility.setBounds(330, 200, 100, 25);
        labelAgility.setFont(choiceFont);
        add(labelAgility);

        textAgility = new JTextField();
        textAgility.setBounds(480,200,70,25);
        add(textAgility);

        labelBase = new JLabel("Base Attack");
        labelBase.setBounds(330, 225, 100, 25);
        labelBase.setFont(choiceFont);
        add(labelBase);

        textBase = new JTextField();
        textBase.setBounds(480,225,70,25);
        add(textBase);


        rbReroll = new JButton("Reroll");
        rbReroll.setBounds(360, 260, 100, 40);
        rbReroll.setFont(choiceFont);
        rbReroll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(groupType.getSelection()!=null) {

                    int numHit = random.nextInt(200);
                    textHit.setText(Integer.toString(numHit));
                    MainFrame.getPlayer().setHitPoint(numHit);


                    int numDefense = random.nextInt(200);
                    textDefense.setText(Integer.toString(numDefense));
                    MainFrame.getPlayer().setDefense(numDefense);

                    int numAgility = random.nextInt(200);
                    textAgility.setText(Integer.toString(numAgility));
                    MainFrame.getPlayer().setAgility(numAgility);

                    int numBase = random.nextInt(200);
                    textBase.setText(Integer.toString(numBase));
                    MainFrame.getPlayer().setBaseAttack(numBase);

                }
            }
        });
        add(rbReroll);


        // Select your weapon
        labelWeapon = new JLabel("Select Your Weapon");
        labelWeapon.setBounds(30, 330, 200, 40);
        labelWeapon.setFont(lableFont);
        add(labelWeapon);


        textWeapon = new JTextArea();
        textWeapon.setBounds(30,480,290,70);
        textWeapon.setLineWrap(true);
        textWeapon.setEnabled(false);
        textWeapon.setWrapStyleWord(true);
        add(textWeapon);


        // Weapon Stats
        labelWStats = new JLabel("Weapon Stats");
        labelWStats.setBounds(330, 330, 200, 40);
        labelWStats.setFont(lableFont);
        add(labelWStats);


        labelAttack = new JLabel("Attack Modifier");
        labelAttack.setBounds(330, 390, 130, 25);
        labelAttack.setFont(choiceFont);
        add(labelAttack);

        imageWeapon = new JLabel();
        imageWeapon.setBounds(180, 370, 90, 100);
        add(imageWeapon);



        textAttack = new JTextField();
        textAttack.setBounds(480,390,70,25);
        add(textAttack);


        labelWeight = new JLabel("Weight");
        labelWeight.setBounds(330, 420, 200, 25);
        labelWeight.setFont(choiceFont);
        add(labelWeight);

        textWeight = new JTextField();
        textWeight.setBounds(480,420,70,25);
        add(textWeight);


        buttonStartBattle = new JButton("Start Battle");
        buttonStartBattle.setBounds(360, 500, 200, 40);
        buttonStartBattle.setFont(choiceFont);
        buttonStartBattle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(groupType.getSelection()!=null && groupWeapon.getSelection()!=null && !textDefense.getText().isEmpty()) {

//                    System.out.println(textAgility.getText());
                    MainFrame.getPage3().setVisible(true);

                    setVisible(false);
                    setSelectedPlayerName(nameText.getText());
                    Battle.disPlayer();
                }
            }
        });
        add(buttonStartBattle);
    }

    public void swapImages(ImageIcon newimage) {
        imageLabel.setIcon(newimage);
    }
    public void swapImagesWeapon(ImageIcon newimage2) {imageWeapon.setIcon(newimage2);}

    public void addCharacterRadios() {

        rbWarrior = new JRadioButton("Warrior");
        rbWarrior.setBounds(30,150,100,30);
        rbWarrior.setFont(choiceFont);
        rbWarrior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Warrior wa = MainFrame.getWarrior();
                swapImages(wa.getWarriorPic());
                getTextType().setText(wa.toString());
                selectedCharater = "Warrior";

            }
        });
        add(rbWarrior);

        rbWizard = new JRadioButton("Wizard");
        rbWizard.setBounds(30,180,100,30);
        rbWizard.setFont(choiceFont);
        rbWizard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Wizard wi = MainFrame.getWizard();
                swapImages(wi.getWizardPic());
                getTextType().setText(wi.toString());
                setSelectedCharater("Wizard");
            }
        });
        add(rbWizard);

        rbCleric = new JRadioButton("Cleric");
        rbCleric.setBounds(30,210,100,30);
        rbCleric.setFont(choiceFont);
        rbCleric.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cleric cl = MainFrame.getCleric();
                swapImages(cl.getClericPic());
                getTextType().setText(cl.toString());
                selectedCharater = "Cleric";
            }
        });
        add(rbCleric);

        groupType = new ButtonGroup();
        groupType.add(rbWarrior);
        groupType.add(rbWizard);
        groupType.add(rbCleric);
    }

    public void addWeaponRadios (){

        rbDagger = new JRadioButton("Dagger");
        rbDagger.setBounds(30,380,100,30);
        rbDagger.setFont(choiceFont);
        rbDagger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Weapan da = MainFrame.getWeapons().get(0);
                swapImagesWeapon(da.getWeaponPic());
                getTextWeapon().setText(da.getDescription());
                getTextAttack().setText(da.getAttackModifier());
                getTextWeight().setText(da.getWeight());
                setSelectedWeaponIndex(0);
            }
        });
        add(rbDagger);

        rbSword = new JRadioButton("Sword");
        rbSword.setBounds(30,410,100,30);
        rbSword.setFont(choiceFont);
        rbSword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Weapan sw = MainFrame.getWeapons().get(1);
                swapImagesWeapon(sw.getWeaponPic());
                getTextWeapon().setText(sw.getDescription());
                getTextAttack().setText(sw.getAttackModifier());
                getTextWeight().setText(sw.getWeight());
                setSelectedWeaponIndex(1);

            }
        });
        add(rbSword);

        rbHammer = new JRadioButton("Hammer");
        rbHammer.setBounds(30,440,100,30);
        rbHammer.setFont(choiceFont);
        rbHammer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Weapan ha = MainFrame.getWeapons().get(2);
                swapImagesWeapon(ha.getWeaponPic());
                getTextWeapon().setText(ha.getDescription());
                getTextAttack().setText(ha.getAttackModifier());
                getTextWeight().setText(ha.getWeight());
                setSelectedWeaponIndex(2);

            }
        });
        add(rbHammer);

        groupWeapon = new ButtonGroup();
        groupWeapon.add(rbDagger);
        groupWeapon.add(rbSword);
        groupWeapon.add(rbHammer);
    }

    public JTextArea getTextType() {
        return textType;
    }

    public JTextArea getTextWeapon() {
        return textWeapon;
    }


    public JTextField getTextAttack() {
        return textAttack;
    }

    public JTextField getTextWeight() {
        return textWeight;
    }

    public static String getSelectedPlayerName() {
        return selectedPlayerName;
    }

    public static void setSelectedPlayerName(String selectedPlayerName) {
        CharSelection.selectedPlayerName = selectedPlayerName;
    }


    public static String getSelectedCharater() {
        return selectedCharater;
    }

    public static void setSelectedCharater(String selectedCharater) {
        CharSelection.selectedCharater = selectedCharater;
    }

    public static int getSelectedWeaponIndex() {
        return selectedWeaponIndex;
    }

    public static void setSelectedWeaponIndex(int selectedWeaponIndex) {
        CharSelection.selectedWeaponIndex = selectedWeaponIndex;
    }

    public ButtonGroup getGroupType() {
        return groupType;
    }

    public ButtonGroup getGroupWeapon() {
        return groupWeapon;
    }

    public JTextField getNameText() {
        return nameText;
    }

    public JLabel getImageWeapon() {
        return imageWeapon;
    }

    public JLabel getImageLabel() {
        return imageLabel;
    }

    public JTextField getTextHit() {
        return textHit;
    }

    public JTextField getTextDefense() {
        return textDefense;
    }

    public JTextField getTextAgility() {
        return textAgility;
    }

    public JTextField getTextBase() {
        return textBase;
    }
}
