package ca.prog1400.UI;

import ca.prog1400.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Battle extends JPanel {

    private static JTextArea textDisplay;
    private Font fontTitle = new Font("Old English Text MT",Font.BOLD, 35);
    private Font fontText = new Font("Arial",Font.BOLD, 24);

    private static JLabel playerCha;
    private static JLabel imagePlayer;
    private static JLabel imageMonster;
    private static JLabel monsterType;

    private static String weaponType;
    private static String weaponWeight;
    private static String weapongAttack;
    private static Monster monsterRandom;

    public Battle() {

        setSize(600, 600);    //Using separate setSize and setLocation
        setBackground(new Color(98,168,96));
        setLayout(null);



        JLabel title = new JLabel("Battle To The Death");
        title.setBounds(150, 50, 500, 50);
        title.setFont(fontTitle);
        add(title);

        JLabel player = new JLabel("Player: ");
        player.setBounds(100, 100, 100, 50);
        player.setFont(fontText);
        add(player);

        playerCha = new JLabel();
        playerCha.setBounds(200,100,100,50);
        playerCha.setFont(fontText);
        add(playerCha);

        imagePlayer = new JLabel();
        imagePlayer.setBounds(140, 150, 120, 140);
        add(imagePlayer);


        JLabel monster = new JLabel("Monster: ");
        monster.setBounds(350, 100, 150, 50);
        monster.setFont(fontText);
        add(monster);

        monsterType = new JLabel();
        monsterType.setBounds(470,100,100,50);
        monsterType.setFont(fontText);
        add(monsterType);

        imageMonster = new JLabel();
        imageMonster.setBounds(400, 150, 120, 140);
        add(imageMonster);

        textDisplay = new JTextArea();
        textDisplay.setBounds(50,300,500,200);
        textDisplay.setLineWrap(true);
        textDisplay.setEnabled(false);
        textDisplay.setWrapStyleWord(true);
        add(textDisplay);

        JButton againButton = new JButton("Play Again");
        againButton.setBounds(200, 520, 200, 50);
        againButton.setFont(new Font("Old English Text MT",Font.BOLD, 20));
        againButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.getCharSelectionPage().setVisible(true);
                setVisible(false);

                MainFrame.getCharSelectionPage().getGroupType().clearSelection();
                MainFrame.getCharSelectionPage().getGroupWeapon().clearSelection();
                MainFrame.getCharSelectionPage().getNameText().setText("");
                MainFrame.getCharSelectionPage().getImageLabel().setIcon(null);
                MainFrame.getCharSelectionPage().getImageWeapon().setIcon(null);
                MainFrame.getCharSelectionPage().getTextType().setText("");
                MainFrame.getCharSelectionPage().getTextWeapon().setText("");
                MainFrame.getCharSelectionPage().getTextAttack().setText("");
                MainFrame.getCharSelectionPage().getTextWeight().setText("");
                MainFrame.getCharSelectionPage().getTextAgility().setText("");
                MainFrame.getCharSelectionPage().getTextHit().setText("");
                MainFrame.getCharSelectionPage().getTextBase().setText("");
                MainFrame.getCharSelectionPage().getTextDefense().setText("");

            }
        });
        add(againButton);

    }

    public static void disPlayer() {

        if (CharSelection.getSelectedCharater().equals("Wizard")) {


            Wizard wi = MainFrame.getWizard();
            playerCha.setText(wi.getType());
            imagePlayer.setIcon(wi.getWizardPic());

            weaponType = wi.getWeapon().getType();
            weaponWeight = String.valueOf(wi.getWeapon().getWeight());
            weapongAttack = String.valueOf(wi.getWeapon().getAttackModifier());

        }
        else if(CharSelection.getSelectedCharater().equals("Warrior")) {

            Warrior wa = MainFrame.getWarrior();
            playerCha.setText(wa.getType());
            imagePlayer.setIcon(wa.getWarriorPic());

            weaponType = wa.getWeapon().getType();
            weaponWeight = String.valueOf(wa.getWeapon().getWeight());
            weapongAttack = String.valueOf(wa.getWeapon().getAttackModifier());

        }
        else if(CharSelection.getSelectedCharater().equals("Cleric")) {

            Cleric cer = MainFrame.getCleric();
            playerCha.setText(cer.getType());
            imagePlayer.setIcon(cer.getClericPic());

            weaponType = cer.getWeapon().getType();
            weaponWeight = String.valueOf(cer.getWeapon().getWeight());
            weapongAttack = String.valueOf(cer.getWeapon().getAttackModifier());

        }

        Random random = new Random();
        int num = random.nextInt(2);
        monsterRandom = MainFrame.getMonsters().get(num);
        System.out.println(num);
        monsterType.setText(monsterRandom.getType());
        imageMonster.setIcon(monsterRandom.getMonsterPic());


        String line = "\n---------------------------";

        Player playerDis = MainFrame.getPlayer();
        String result = "Player: " + playerDis.getPlayerName() + line;
        result += String.format("\nClass: %s\nHP: %-17sDefense: %-16sAgility: %-16sBase Attack: %-10s",
                CharSelection.getSelectedCharater(),playerDis.getHitPoint(),playerDis.getDefense(),playerDis.getAgility(),playerDis.getBaseAttack());

        result += String.format("\nWeapon: %-40sWeight: %-16sAttack Mod: %s",weaponType,weaponWeight,weapongAttack);


        result += "\n\nMonster: " + monsterRandom.getType() + line;
        result += String.format("\nHP: %-17sDefense: %-17sAgility: %-17sBase Attack: %-17s",
                monsterRandom.getHitPoint(),monsterRandom.getDefense(),monsterRandom.getAgility(),monsterRandom.getBaseAttack());

       textDisplay.setText(result);

    }


}
