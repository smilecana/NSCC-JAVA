package ca.prog1400.model;

public class Player extends Character {

    private String playerName;

    public Player(String playerName) {
        super();
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }
}
