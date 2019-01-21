package ca.prog1400;

public class Food {

    String name;
    String type;

    public Food (String foodName, String foodType) {
        this.name = foodName;
        this.type = foodType;
    }

    public String eatlt(String name) {
        //System.out.println("You just ate the " + name);
        return "You just ate the " + name;
    }

    public String denylt(String type) {
        //System.out.println("Not eating that! I hate " + name);
        return "Not eating that! I hate "+ type;
    }


}
