package ca.prog1400;

public class Food {
    String name;

    public Food (String foodName) {
        this.name = foodName;
    }

    public void eatlt(String name) {
        System.out.println("You just ate the " + name);
    }

    public void denylt(String name) {
        System.out.println("Not eating that! I hate " + name);
    }
}
