package ca.prog1400.UI;

import ca.prog1400.model.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class MainFrame extends JFrame {

    private static CharSelection charSelectionPage;
    private static Battle battlePage;
    private static Warrior warrior;
    private static Wizard wizard;
    private static Cleric cleric;

    private static Player player;
    private static ArrayList<Monster> monsters = new ArrayList<>();

    private static Dagger dagger;
    private static Sword sword;
    private static Hammer hammer;


    public MainFrame() {
        setTitle("DND Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(30,30,600,600);
        setVisible(true);
        setLayout(new CardLayout());

        SplashPage splashpage = new SplashPage();
        charSelectionPage = new CharSelection();
        battlePage = new Battle();


        charSelectionPage.setVisible(false);
        battlePage.setVisible(false);

        add(splashpage);
        add(charSelectionPage);
        add(battlePage);

        warrior = new Warrior();
        wizard = new Wizard();
        cleric = new Cleric();


        dagger = new Dagger("Dagger",5,2);
        sword = new Sword("Sword",10,4);
        hammer = new Hammer("Hammer",15,10);

        player = new Player();

        ImageIcon gazerIcon = new ImageIcon(getClass().getResource("/images/gazer.jpeg"));
        gazerIcon.setImage(gazerIcon.getImage().getScaledInstance(90, 100, Image.SCALE_DEFAULT));
        Monster gazer = new Monster("Gazer",gazerIcon);

        Random num = new Random();
        gazer.setAgility(num.nextInt(200));
        gazer.setHitPoint(num.nextInt(200));
        gazer.setDefense(num.nextInt(200));
        gazer.setBaseAttack(num.nextInt(200));

        ImageIcon owlbearIcon = new ImageIcon(getClass().getResource("/images/Owlbear.jpeg"));
        owlbearIcon.setImage(owlbearIcon.getImage().getScaledInstance(90, 100, Image.SCALE_DEFAULT));
        Monster owlbear = new Monster("Owlbear",owlbearIcon);

        owlbear.setHitPoint(num.nextInt(200));
        owlbear.setAgility(num.nextInt(200));
        owlbear.setDefense(num.nextInt(200));
        owlbear.setBaseAttack(num.nextInt(200));

        monsters.add(gazer);
        monsters.add(owlbear);


    }


    public static CharSelection getCharSelectionPage() {
        return charSelectionPage;
    }


    public static Battle getBattlePage() {
        return battlePage;
    }


    public static Warrior getWarrior() {
        return warrior;
    }

    public static Wizard getWizard() {
        return wizard;
    }

    public static Cleric getCleric() {
        return cleric;
    }


    public static Player getPlayer() {
        return player;
    }


    public static ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public static Dagger getDagger() {
        return dagger;
    }

    public static Sword getSword() {
        return sword;
    }

    public static Hammer getHammer() {
        return hammer;
    }
}
