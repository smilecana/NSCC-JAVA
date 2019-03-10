package ca.prog1400.model;

import javax.swing.*;

public class Monster extends Character{

    private String type;
    private ImageIcon monsterPic;

    public Monster(String type, ImageIcon monsterPic) {
        this.type = type;
        this.monsterPic = monsterPic;

    }

    public String getType() {
        return type;
    }

    public ImageIcon getMonsterPic() {
        return monsterPic;
    }
}
