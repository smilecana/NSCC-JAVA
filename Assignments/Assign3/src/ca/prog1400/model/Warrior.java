package ca.prog1400.model;

import javax.swing.*;
import java.awt.*;

public class Warrior extends Player{


    private ImageIcon warriorPic;
    private String type = "Warrior";

    public Warrior() {
        super();
        this.warriorPic = new ImageIcon(getClass().getResource("/images/warrior.jpg"));
        warriorPic.setImage(warriorPic.getImage().getScaledInstance(90, 100,Image.SCALE_DEFAULT));
    }

    public ImageIcon getWarriorPic() {
        return warriorPic;
    }

    @Override
    public String toString() {
        return "They all share an unparalleled mastery with weapons and armor," +
                " and a thorough knowledge of the skills of combat.";
    }

    public String getType() {
        return type;
    }


}
