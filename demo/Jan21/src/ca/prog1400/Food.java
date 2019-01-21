package ca.prog1400;

public class Food {
    String name;
    String type;

    public Food(String name, String type){
        this.name = name;
        this.type = type;

    }

    public String eatIt() {
        return "I just ate a " + this.name;
    }

    public String denyIt() {
        return "Yuck! I woun't eat this " + this.name;

    }

    public String getType() {
        return this.type;
    }
}
