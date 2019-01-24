package ca.prog1400;
import java.util.*;

public class Player {

    String name;
    int goal;
    int assist;
    public static int totalGoals;
    public static int totalAssist;



    public Player(String playerName, int playerGoal, int playerAssistant) {
        this.name = playerName;
        this.goal = playerGoal;
        this.assist = playerAssistant;
//        Player.totalGoals += playerGoal;
//        Player.totalAssist += playerAssistant;
    }


    public int getTotalGoalsAndAssist() {

        return this.assist + this.goal;
    }

//    public static int getTotalAssist() {
//        return Player.totalAssist;
//    }

   // public int[] getGrade() {
//        //return GradeConverter;
//
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < 3; i++) {
//
//
//            System.out.println("Please input your grade: ");
//            goal[i] = scanner.nextInt();
//            System.out.println("Please input your grade: ");
//            assistant[i] = scanner.nextInt();
//
//            //  total.prototype.push.apply(goal,assistant);
//
//        }
//
//        return goal;
//
//    }
}
