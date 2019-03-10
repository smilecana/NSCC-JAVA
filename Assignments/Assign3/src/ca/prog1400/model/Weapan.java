package ca.prog1400.model;

import javax.swing.*;

public class Weapan {

    private ImageIcon weaponPic;
    private String type;
    private String attackModifier;
    private String weight;
    private String description;

    public Weapan(String type, ImageIcon swordPic, String attackModifier, String weight, String description) {
        this.type = type;
        this.weaponPic = swordPic;
        this.attackModifier = attackModifier;
        this.weight = weight;
        this.description = description;
    }

    public ImageIcon getWeaponPic() {
        return weaponPic;
    }


    public String getAttackModifier() {
        return attackModifier;
    }

    public String getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }
}
