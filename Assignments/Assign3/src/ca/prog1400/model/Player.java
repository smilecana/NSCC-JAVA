package ca.prog1400.model;

public class Player extends Character {

    private String playerName;
    private Weapan weapon;

    public Player() {
        super();
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Weapan getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapan weapon) {
        this.weapon = weapon;
    }
}
