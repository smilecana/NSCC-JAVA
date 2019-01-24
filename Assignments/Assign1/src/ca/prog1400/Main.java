package ca.prog1400;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("FANTASY HOCKEY APPLICATION");
        System.out.println("TEAM ENTRY");
        System.out.println("================================");

        // Team input.
        Team [] myTeam = new Team[3];
        String regEx = "^[a-zA-Z]{3,}";
        Pattern pattern = Pattern.compile(regEx);
        boolean m;
        String teamName;

        for (int i = 0; i < 3; i++) {
            int num = i +1;
            System.out.println("Enter name for team # "+ num + ": ");

            do {
                teamName = scan.nextLine();
                String a = teamName.replace(" ","");
                String b = a.replace("'","");
                Matcher match = pattern.matcher(b);
                m = match.matches();
                if(!m){
                    System.out.println("Please input names(at least 3 characters).");
                }
                //System.out.println(m);
            }while(!m);

            Team team1 = new Team(teamName);
            myTeam[i] = team1;
        }

        // players' information input
        Player[][] myPlayer = new Player[3][4];
        int[] goals = new int[3];
        int[] assists = new int[3];
        int goalsSum = 0;
        int assistsSum = 0;
        String name;
        String regEx2 = "[0-9]{1,}$";
        Pattern pattern2 = Pattern.compile(regEx2);
        boolean n;
        String g;
        int a;

        System.out.println();
        System.out.println("PLAYER ENTRY");
        System.out.println("===================================");

        for (int i = 0; i < myTeam.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Enter players for " + myTeam[i].getName());
                int num = j + 1;
                System.out.println("Enter name for player # " + num + ": ");
                //char name = scan.next().charAt(0);
                do {
                    name = scan.nextLine();
                    Matcher match = pattern.matcher(name.replace(" ",""));
                    m = match.matches();
                    if(!m){
                        System.out.println("Please input names(at least 3 characters).");
                    }
                }while(!m);
                //String name = scan.next();
                System.out.println("Enter number of goals for " + name + ": ");
                do {
                    g = scan.nextLine();
                    Matcher match = pattern2.matcher(g);
                    n = match.matches();
                    if(!n){
                        System.out.println("Please input a number(zero or greater than zero).");
                    }
                }while(!n);

                int gNum = Integer.parseInt(g);
                System.out.println("Enter number of assists for " + name + ":");
                do {
                    g = scan.nextLine();
                    Matcher match = pattern2.matcher(g);
                    n = match.matches();
                    if(!n){
                        System.out.println("Please input a number(zero or greater than zero).");
                    }
                }while(!n);

                //a = scan.nextInt();

                int gNum2 = Integer.parseInt(g);
                Player player1 = new Player(name,gNum,gNum2);
                myPlayer[i][j] = player1;

                goalsSum += myPlayer[i][j].goal;
                assistsSum += myPlayer[i][j].assist;

            }
            goals[i] = goalsSum;
            assists[i] = assistsSum;
            goalsSum = 0;
            assistsSum = 0;
        }

        // Team report
        System.out.println();
        System.out.println("REPORT: Stats per Team");
        System.out.println("===============================");

        for (int i = 0; i < myTeam.length; i++) {
            int totalGA = goals[i] + assists[i];
            System.out.println(myTeam[i].name + ": "
            + " G - " + goals[i]
            + " A - " + assists[i]
            + " Total - " + totalGA
            + " Budget - $" + myTeam[i].getBudget()
            + " Rating: " + myTeam[i].getRate(totalGA) + " stars");
        }
        

        // Player report
        System.out.println();
        System.out.println("REPORT: Stats per Team");
        System.out.println("=================================");
        for (int i = 0; i < myPlayer.length; i++) {
            System.out.println(myTeam[i].name);
            for (int j = 0; j < myPlayer[i].length; j++) {

                System.out.println(myPlayer[i][j].name +": "
                + " G - " + myPlayer[i][j].goal
                + "  A - " + myPlayer[i][j].assist
                + "  Total - " + myPlayer[i][j].getTotalGoalsAndAssist());

            }

        }


    }



}
