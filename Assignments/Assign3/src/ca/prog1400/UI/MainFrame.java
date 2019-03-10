package ca.prog1400.UI;

import ca.prog1400.model.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class MainFrame extends JFrame {

    private static FirstPage page1;
    private static CharSelection page2;
    private static Battle page3;
    private static Warrior warrior;
    private static Wizard wizard;
    private static Cleric cleric;

    private static Player player;
    private static ArrayList<Weapan> weapons = new ArrayList<>();
    private static ArrayList<Monster> monsters = new ArrayList<>();



    public MainFrame() {
        setTitle("DND Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(30,30,600,600);
        setVisible(true);
        setLayout(null);

        page1 = new FirstPage();
        add(page1);

        page2 = new CharSelection();
        add(page2);

        page3 = new Battle();
        add(page3);

        page2.setVisible(false);
        page3.setVisible(false);

        String name = CharSelection.getSelectedPlayerName();

        warrior = new Warrior(name);
        wizard = new Wizard(name);
        cleric = new Cleric(name);


        String daggerDescription = "You get a +2 bonus on Sleight of Hand checks made to conceal a dagger on your body.";
        ImageIcon daggerIcon = new ImageIcon(getClass().getResource("/images/dagger.jpg"));
        daggerIcon.setImage(daggerIcon.getImage().getScaledInstance(90, 100, Image.SCALE_DEFAULT));
        Weapan dagger = new Weapan("Dagger",daggerIcon,"+2","1",daggerDescription);

        String swordDescription = "When the sword appears, you make a melee spell attack against " +
                "a target of your choice within 5 feet of the sword. ";
        ImageIcon swordIcon = new ImageIcon(getClass().getResource("/images/sword.jpg"));
        swordIcon.setImage(swordIcon.getImage().getScaledInstance(90, 100, Image.SCALE_DEFAULT));
        Weapan sword = new Weapan("Sword",swordIcon,"+5","1",swordDescription);

        String hammerDescription = "The Lucerne hammer is a type of polearm with a three pronged hammer, a spiked tip, and a curved pick-like spike. ";
        ImageIcon hammerIcon = new ImageIcon(getClass().getResource("/images/hammer.jpg"));
        hammerIcon.setImage(hammerIcon.getImage().getScaledInstance(90, 100, Image.SCALE_DEFAULT));
        Weapan hammer = new Weapan("Hammer",hammerIcon,"+6","10",hammerDescription);

        weapons.add(dagger);
        weapons.add(sword);
        weapons.add(hammer);

        player = new Player(name);

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

    public static FirstPage getPage1() {
        return page1;
    }

    public static void setPage1(FirstPage page1) {
        MainFrame.page1 = page1;
    }

    public static CharSelection getPage2() {
        return page2;
    }

    public static void setPage2(CharSelection page2) {
        MainFrame.page2 = page2;
    }

    public static Battle getPage3() {
        return page3;
    }

    public static void setPage3(Battle page3) {
        MainFrame.page3 = page3;
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

    public static ArrayList<Weapan> getWeapons() {
        return weapons;
    }

    public static ArrayList<Monster> getMonsters() {
        return monsters;
    }
}
