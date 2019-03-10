package ca.prog1400.model;

import java.util.Random;

public class Character {

    private int hitPoint;
    private int defense;
    private int agility;
    private int baseAttack;

    public Character() {
//        this.hitPoint = random.nextInt(200);
//        this.defense = random.nextInt(200);
//        this.agility = random.nextInt(200);
//        this.baseAttack = random.nextInt(200);
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }
}
