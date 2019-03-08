package ca.prog1400.UI;

import javax.swing.*;

public class MainFrame extends JFrame {

//    public static FirstPage getPage1;
//    public static CharSelection getPage2;
//    public static Battle getPage3;
    private static FirstPage page1;
    private static CharSelection page2;
    private static Battle page3;

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
}
