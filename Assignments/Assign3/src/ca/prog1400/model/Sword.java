package ca.prog1400.model;

import javax.swing.*;
import java.awt.*;

public class Sword{

    private ImageIcon swordPic;
    private String attackModifier = "+5";
    private String weight = "1";

    public Sword() {
        this.swordPic = new ImageIcon(getClass().getResource("/images/sword.jpg"));
        swordPic.setImage(swordPic.getImage().getScaledInstance(90, 100, Image.SCALE_DEFAULT));
    }

    public ImageIcon getSwordPic() {
        return swordPic;
    }

    public String getAttackModifier() {
        return attackModifier;
    }

    public String getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "When the sword appears, you make a melee spell attack against " +
                "a target of your choice within 5 feet of the sword. ";
    }
}
