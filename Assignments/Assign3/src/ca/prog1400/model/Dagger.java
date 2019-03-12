package ca.prog1400.model;

import javax.swing.*;
import java.awt.*;

public class Dagger extends Weapan{

    private ImageIcon daggerPic;

    public Dagger(String type, String attackModifier, String weight) {
        super(type,attackModifier,weight);
        this.daggerPic = new ImageIcon(getClass().getResource("/images/dagger.jpg"));
        daggerPic.setImage(daggerPic.getImage().getScaledInstance(90, 100, Image.SCALE_DEFAULT));
    }

    public ImageIcon getDaggerPic() {
        return daggerPic;
    }

    @Override
    public String toString() {
        return "You get a +2 bonus on Sleight of Hand checks made to conceal a dagger on your body.";
    }
}
