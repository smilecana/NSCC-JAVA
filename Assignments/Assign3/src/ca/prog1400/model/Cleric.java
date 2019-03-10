package ca.prog1400.model;

import javax.swing.*;
import java.awt.*;

public class Cleric extends Player {

    private ImageIcon clericPic;
    private String type = "Cleric";

    public Cleric(String playerName) {
        super(playerName);
        this.clericPic = new ImageIcon(getClass().getResource("/images/cleric.jpg"));
        clericPic.setImage(clericPic.getImage().getScaledInstance(90, 100, Image.SCALE_DEFAULT));
    }

    public ImageIcon getClericPic() {
        return clericPic;
    }


    @Override
    public String toString() {
        return "Clerics are intermediaries between the mortal world and the distant planes of the gods. " +
                "As varied as the gods they serve, they strive to embody the handiwork of their deities.";
    }

    public String getType() {
        return type;
    }



}
