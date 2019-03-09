package ca.prog1400.model;

import javax.swing.*;
import java.awt.*;

public class Hammer {

    private ImageIcon hammerPic;
    private String attackModifier = "+2";
    private String weight = "2";

    public Hammer(){
        this.hammerPic = new ImageIcon(getClass().getResource("/images/hammer.jpg"));
        hammerPic.setImage(hammerPic.getImage().getScaledInstance(90, 100, Image.SCALE_DEFAULT));
    }

    public ImageIcon getHammerPic() {
        return hammerPic;
    }

    public String getAttackModifier() {
        return attackModifier;
    }

    public String getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "The Lucerne hammer is a type of polearm with a three pronged hammer, a spiked tip, and a curved pick-like spike. ";
    }
}
