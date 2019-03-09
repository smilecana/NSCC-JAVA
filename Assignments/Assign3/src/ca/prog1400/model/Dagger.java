package ca.prog1400.model;

import javax.swing.*;
import java.awt.*;

public class Dagger {

    private ImageIcon daggerPic;
    private String attackModifier = "+6";
    private String weight = "10";

    public Dagger() {

        this.daggerPic = new ImageIcon(getClass().getResource("/images/dagger.jpg"));
        daggerPic.setImage(daggerPic.getImage().getScaledInstance(90, 100, Image.SCALE_DEFAULT));
    }

    public ImageIcon getDaggerPic() {
        return daggerPic;
    }

    public String getAttackModifier() {
        return attackModifier;
    }

    public String getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "You get a +2 bonus on Sleight of Hand checks made to conceal a dagger on your body.";
    }
}
