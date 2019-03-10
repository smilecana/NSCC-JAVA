package ca.prog1400.model;

import javax.swing.*;
import java.awt.*;

public class Wizard extends Player{

    private ImageIcon wizardPic;
    private String type = "Wizard";
    private boolean isSelected = false;

    public Wizard(String playerName) {
        super(playerName);
        this.wizardPic = new ImageIcon(getClass().getResource("/images/wizard.jpg"));
        wizardPic.setImage(wizardPic.getImage().getScaledInstance(90, 100, Image.SCALE_DEFAULT));
    }

    public ImageIcon getWizardPic() {
        return wizardPic;
    }

    @Override
    public String toString() {
        return "Drawing on the subtle weave of magic that permeates the cosmos," +
                " wizards cast spells of explosive fire, arcing lightning, subtle deception, and brute-force mind control.";
    }

    public String getType() {
        return type;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
