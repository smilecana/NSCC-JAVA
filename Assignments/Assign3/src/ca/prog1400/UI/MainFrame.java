package ca.prog1400.UI;

import ca.prog1400.model.*;

import javax.swing.*;

public class MainFrame extends JFrame {

    private static FirstPage page1;
    private static CharSelection page2;
    private static Battle page3;
    private static Warrior warrior;
    private static Wizard wizard;
    private static Cleric cleric;
    private static Dagger dagger;
    private static Sword sword;
    private static Hammer hammer;
    private static Player player;


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

        String name = CharSelection.getSetSelectedPlayerName();

        warrior = new Warrior(name);
        wizard = new Wizard(name);
        cleric = new Cleric(name);

        dagger = new Dagger();
        sword = new Sword();
        hammer = new Hammer();

        player = new Player(name);


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

    public static Dagger getDagger() {
        return dagger;
    }

    public static Sword getSword() {
        return sword;
    }

    public static Hammer getHammer() {
        return hammer;
    }

    public static Player getPlayer() {
        return player;
    }
}
