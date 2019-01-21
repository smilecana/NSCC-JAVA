package ca.prog1400;
import java.util.*;
import java.text.*;

public class Team {

    String name;
    double budget;
//    int goals;
//    int assistant;
    int totalGoals;
//    String star;

    public Team (String teamName) {

        this.name = teamName;
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
}
