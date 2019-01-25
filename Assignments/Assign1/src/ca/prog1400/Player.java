package ca.prog1400;
import java.util.*;

public class Player {

    String name;
    int goal;
    int assist;
    String teamName;
    int totalGoalsAndAssist;

    public void setTeamName (String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName(){
        return this.teamName;
    }

    // Make a constructor
    public Player(String playerName, int playerGoal, int playerAssistant) {
        this.name = playerName;
        this.goal = playerGoal;
        this.assist = playerAssistant;

    }


    // Add the goals and assists

    public int getTotalGoalsAndAssist() {

        return this.assist + this.goal;
    }

    // make a output report of players
    public void outputPlayerInfo(Player[][] myPlayer) {

        for (int i = 0; i < myPlayer.length; i++) {

            for (int j = 0; j < myPlayer[i].length; j++) {
                System.out.println(myPlayer[i][j].teamName);
                System.out.println(myPlayer[i][j].name +": "
                        + " G - " + myPlayer[i][j].goal
                        + "  A - " + myPlayer[i][j].assist
                        + "  Total - " + myPlayer[i][j].getTotalGoalsAndAssist());

            }

        }
    }


}
