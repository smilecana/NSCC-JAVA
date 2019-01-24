package ca.prog1400;
import java.util.*;
import java.text.*;

public class Team {

    String name;
    double budget;
//    int goals;
//    int assistant;
    int total;
    int[] goals = new int[3];
    int[] assists = new int[3];
    Team[] teamName = new Team[3];
//    String star;

    public Team (String teamName) {

        this.name = teamName;
    }

    public String getName() {
        return this.name;
    }
    public String getBudget(){
        double max=100000;
        double min=0;
        Random random = new Random();
        //DecimalFormat df = new DecimalFormat("0.00");


        double budget = random.nextDouble()*(max-min+1) + min;
        String budgetDecimal = String.format("%.2f",budget);
        return budgetDecimal;
    }

//    public int setTotalGoals(int totalGoals) {
//        this.totalGoals = totalGoals;
//    }

    public String getRate(int total) {

        if (total > 20) {
            return "***";
        }
        else if (total <= 20 && total >=10){
            return  "**";
        }
        else if (total > 0){
            return "*";
        }
        else{
            return "";
        }

    }

    public void outputTeamReport(int[] goals, int[] assists,Team[] teamName) {
        for (int i = 0; i < teamName.length; i++) {
            int totalGA = goals[i] + assists[i];
            System.out.println(teamName[i].name + ": "
                    + " G - " + goals[i]
                    + " A - " + assists[i]
                    + " Total - " + totalGA
                    + " Budget - $" + teamName[i].getBudget()
                    + " Rating: " + teamName[i].getRate(totalGA) + " stars");
        }
    }
}
