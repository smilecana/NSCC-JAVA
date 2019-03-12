package ca.prog1400.model;

import javax.swing.*;
import java.awt.*;

public class Sword extends Weapan{

    private ImageIcon swordPic;

    public Sword(String type, String attackModifier, String weight) {
        super(type,attackModifier,weight);

        this.swordPic = new ImageIcon(getClass().getResource("/images/sword.jpg"));
        swordPic.setImage(swordPic.getImage().getScaledInstance(90, 100, Image.SCALE_DEFAULT));
    }

    public ImageIcon getSwordPic() {
        return swordPic;
    }

    @Override
    public String toString() {
        return "When the sword appears, you make a melee spell attack against " +
                "a target of your choice within 5 feet of the sword. ";
    }
}
