package ca.prog1400.model;

import javax.swing.*;
import java.awt.*;

public class Hammer extends Weapan{

    private ImageIcon hammerPic;


    public Hammer(String type, int attackModifier, int weight){
        super(type,attackModifier,weight);
        this.hammerPic = new ImageIcon(getClass().getResource("/images/hammer.jpg"));
        hammerPic.setImage(hammerPic.getImage().getScaledInstance(90, 100, Image.SCALE_DEFAULT));
    }

    public ImageIcon getHammerPic() {
        return hammerPic;
    }

    @Override
    public String toString() {
        return "The Lucerne hammer is a type of polearm with a three pronged hammer, a spiked tip, and a curved pick-like spike. ";
    }
}
