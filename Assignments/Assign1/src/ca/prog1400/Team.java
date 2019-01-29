package ca.prog1400;
import java.util.*;

public class Team {

    String teamName;
    int goalsTotalInOneTeam;
    int assisTotalInOneTeam;

    public Team (String teamName) {   // make a constructor

        this.teamName = teamName;
    }

    public String getName() {
        return this.teamName;
    }

    public void setGoalsTotalInOneTeam(int goalsTotalInOneTeam){
        this.goalsTotalInOneTeam = goalsTotalInOneTeam;
    }

    public int getGoalsTotalInOneTeam() {
        return this.goalsTotalInOneTeam;
    }

    public void setAssisTotalInOneTeam(int assisTotalInOneTeam) {
        this.assisTotalInOneTeam = assisTotalInOneTeam;
    }

    public int getAssisTotalInOneTeam() {
        return this.assisTotalInOneTeam;
    }

    // method to getting budget for each team
    public String getBudget() {

        double max=100000;
        double min=0;
        Random random = new Random();

        double budget = random.nextDouble()*(max-min+1) + min;
        return String.format("%.2f",budget);

    }

    // this method is to give how may stars according to total number.
    public String getRate(int total) {

        if (total > 20) {
            return "***";
        }
        else if (total >=10){
            return  "**";
        }
        else if (total > 0){
            return "*";
        }
        else{
            return "";
        }

    }

    // output a report of team information
    public void outputTeamReport(Team[] myTeam) {

        for (int i = 0; i < myTeam.length; i++) {

            int totalGA = myTeam[i].getGoalsTotalInOneTeam() + myTeam[i].getAssisTotalInOneTeam();

            System.out.println(myTeam[i].teamName + ": "
                    + " G - " + myTeam[i].getGoalsTotalInOneTeam()
                    + "  A - " + myTeam[i].getAssisTotalInOneTeam()
                    + "  Total - " + totalGA
                    + "  Budget - $" + myTeam[i].getBudget()
                    + "  Rating: " + myTeam[i].getRate(totalGA) + " stars");
        }

    }

}
