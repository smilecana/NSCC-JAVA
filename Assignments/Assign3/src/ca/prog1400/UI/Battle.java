package ca.prog1400.UI;

import ca.prog1400.model.Cleric;
import ca.prog1400.model.Player;
import ca.prog1400.model.Warrior;
import ca.prog1400.model.Wizard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Battle extends JPanel {

    private JLabel title;
    private JLabel player;
    private JLabel monster;
    private static JTextArea textDisplay;
    private Font fontTitle = new Font("Old English Text MT",Font.BOLD, 35);
    private Font fontText = new Font("Arial",Font.BOLD, 24);

    private static JLabel playerCha;
    private static JLabel imagePlayer;
    private static JLabel imageMonster;
    private static JLabel monsterType;

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



        playerCha = new JLabel();
        playerCha.setBounds(200,100,100,50);
        playerCha.setFont(fontText);
        add(playerCha);

        imagePlayer = new JLabel();
        imagePlayer.setBounds(140, 150, 120, 140);
        add(imagePlayer);


        monster = new JLabel("Monster: ");
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
                MainFrame.getPage2().setVisible(true);
                setVisible(false);
//                MainFrame.getPage2().repaint();
//                MainFrame.getPage2().revalidate();
                MainFrame.getPage2().getGroupType().clearSelection();
                MainFrame.getPage2().getGroupWeapon().clearSelection();
                MainFrame.getPage2().getNameText().setText("");
                MainFrame.getPage2().getImageLabel().setIcon(null);
                MainFrame.getPage2().getImageWeapon().setIcon(null);
                MainFrame.getPage2().getTextType().setText("");
                MainFrame.getPage2().getTextWeapon().setText("");
                MainFrame.getPage2().getTextAttack().setText("");
                MainFrame.getPage2().getTextWeight().setText("");
                MainFrame.getPage2().getTextAgility().setText("");
                MainFrame.getPage2().getTextHit().setText("");
                MainFrame.getPage2().getTextBase().setText("");
                MainFrame.getPage2().getTextDefense().setText("");

            }
        });
        add(againButton);

    }
//    public disWi;

    public static void disPlayer() {


        if (CharSelection.getSelectedCharater().equals("Wizard")) {


            Wizard wi = MainFrame.getWizard();
            playerCha.setText(wi.getType());
            imagePlayer.setIcon(wi.getWizardPic());


        }
        else if(CharSelection.getSelectedCharater().equals("Warrior")) {

            Warrior wa = MainFrame.getWarrior();
            playerCha.setText(wa.getType());
            imagePlayer.setIcon(wa.getWarriorPic());

        }
        else if(CharSelection.getSelectedCharater().equals("Cleric")) {

            Cleric cer = MainFrame.getCleric();
            playerCha.setText(cer.getType());
            imagePlayer.setIcon(cer.getClericPic());

        }

        Random random = new Random();
        int num = random.nextInt(2);
        System.out.println(num);
        monsterType.setText(MainFrame.getMonsters().get(num).getType());
        imageMonster.setIcon(MainFrame.getMonsters().get(num).getMonsterPic());


        String result = "Player: " + CharSelection.getSelectedPlayerName() + "\n---------------------------";
        result += "\nClass: " + CharSelection.getSelectedCharater();
        result += "\nHP: " + MainFrame.getPlayer().getHitPoint() + " Defense: " + MainFrame.getPlayer().getDefense() +
                " Agility: " + MainFrame.getPlayer().getAgility() + " Base Attack: " + MainFrame.getPlayer().getBaseAttack();


        int selectedIndex = CharSelection.getSelectedWeaponIndex();
        result += "\nWeapon: " + MainFrame.getWeapons().get(selectedIndex).getType() + "              "+
                "Weight: " + MainFrame.getWeapons().get(selectedIndex).getWeight() +
                "Attack Mod: " + MainFrame.getWeapons().get(selectedIndex).getAttackModifier();


        result += "\n\nMonster: " + MainFrame.getMonsters().get(num).getType() + "\n---------------------------";
        result += "\nHP: " + MainFrame.getMonsters().get(num).getHitPoint() +
                "  Defense: " + MainFrame.getMonsters().get(num).getDefense() +
                "  Agility: " + MainFrame.getMonsters().get(num).getAgility() +
                "  Base Attack: " + MainFrame.getMonsters().get(num).getBaseAttack();

        textDisplay.setText(result);


    }


}
