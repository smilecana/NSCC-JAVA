package ca.prog1400.model;

public class Weapan {

    private String type;
    private String attackModifier;
    private String weight;


    public Weapan(String type, String attackModifier, String weight) {
        this.type = type;
        this.attackModifier = attackModifier;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }


    public String getAttackModifier() {
        return attackModifier;
    }


    public String getWeight() {
        return weight;
    }

}
