package ca.prog1400;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        System.out.println("FANTASY HOCKEY APPLICATION");
        System.out.println("TEAM ENTRY");
        System.out.println("================================");

        // Team name input.
        Team [] myTeam = new Team[3];   //make an Team object array
        String teamName;

        for (int i = 0; i < 3; i++) {
            int num = i +1;
            System.out.println("Enter name for team # "+ num + ": ");
            teamName = getValidUserInputName();  //input team names and valid the input

            Team teamEach = new Team(teamName);
            myTeam[i] = teamEach;
        }


        // players' information input
        Player[][] myPlayer = new Player[3][4];   //make a player array
        int goalsSum = 0;
        int assistsSum = 0;
        String playName;

        System.out.println();
        System.out.println("PLAYER ENTRY");
        System.out.println("===================================");

        for (int i = 0; i < myTeam.length; i++) {
            System.out.println("Enter players for " + myTeam[i].getName());
            for (int j = 0; j < 4; j++) {

                int num = j + 1;
                System.out.println("Enter name for player # " + num + ": ");
                playName = getValidUserInputName();                                  //input a player name and valid input

                System.out.println("Enter number of goals for " + playName + ": ");
                int goalEach = getValidInputNum();                                  //input a goal and valid input

                System.out.println("Enter number of assists for " + playName + ":");
                int assistEach = getValidInputNum();                                  //input a assist and valid input

                Player playerEach = new Player(playName,goalEach,assistEach);        //make a new object
                playerEach.setTeamName(myTeam[i].getName());
                myPlayer[i][j] = playerEach;

                goalsSum += myPlayer[i][j].goal;
                assistsSum += myPlayer[i][j].assist;

            }
            myTeam[i].setGoalsTotalInOneTeam(goalsSum);           //get the total goals in one team and set to team method
            myTeam[i].setAssisTotalInOneTeam(assistsSum);        //get the total assist in one team and set to team method

            goalsSum = 0;
            assistsSum = 0;
        }

        // Team report
        System.out.println();
        System.out.println("REPORT: Stats per Team");
        System.out.println("===============================");

//       Make a new empty Team
        Team outputTeam = new Team("");
        outputTeam.outputTeamReport(myTeam);

        // Player report
        System.out.println();
        System.out.println("REPORT: Stats per Player");
        System.out.println("=================================");

        Player outputPlayer = new Player("",0,0);
        outputPlayer.outputPlayerInfo(myPlayer);

    }

    // Valid name input (at least 3 characters)
    private static String getValidUserInputName() {

        String nameInput;
        Scanner sc = new Scanner(System.in);
        do {
            nameInput = sc.nextLine();  //

            if(nameInput.length() < 3){   // if the length is less than 3, input again and get a warning message
                System.out.println("Please input names(at least 3 characters).");
            }

        }while(nameInput.length() < 3);

        return nameInput;

    }

    // Valid number input (greater than zero)
    private static int getValidInputNum() {

        int number;
        Scanner sc = new Scanner(System.in);
        do {

            while(!sc.hasNextInt()){        // validate the input is a number
                System.out.println("Enter a positive number.");
                sc.next();
            }

            number = sc.nextInt();  //
            if(number < 0){              // validate the number is greater than 0
                System.out.println("Enter a positive number.");
            }

        }while(number < 0);

        return number;
    }


}
