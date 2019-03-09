package ca.prog1400.model;

import java.util.Random;

public class Character {

    private int hitPoint;
    private int defense;
    private int agility;
    private int baseAttack;
    Random random = new Random();

    public Character() {
        this.hitPoint = random.nextInt(200);
        this.defense = random.nextInt(200);
        this.agility = random.nextInt(200);
        this.baseAttack = random.nextInt(200);
    }


    public int getHitPoint() {
        hitPoint = random.nextInt(200);
        return hitPoint;
    }

    public int getDefense() {
        defense = random.nextInt(200);
        return defense;
    }

    public int getAgility() {
        agility = random.nextInt(200);
        return agility;
    }

    public int getBaseAttack() {
        baseAttack = random.nextInt(200);
        return baseAttack;
    }
}
