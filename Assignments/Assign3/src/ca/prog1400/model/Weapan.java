package ca.prog1400.model;

public class Weapan {

    private String type;
    private int attackModifier;
    private int weight;


    public Weapan(String type, int attackModifier, int weight) {
        this.type = type;
        this.attackModifier = attackModifier;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }


    public int getAttackModifier() {
        return attackModifier;
    }


    public int getWeight() {
        return weight;
    }

}
