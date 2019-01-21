package ca.prog1400;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Team
        Scanner scan = new Scanner(System.in);

//        String[] str = scan.nextLine().split(" "); //字符串以空格分割
//        scan.close();
//
//        int[] num = new int[str.length];
//
//        for(int i=0;i<str.length;i++)
//            num[i] = Integer.parseInt(String.valueOf(str[i]));//将字符串的数字保存到整型数组里



        //Team
        Team team1 = new Team("abc");
        String budget1 = team1.getBudget();
        System.out.println(budget1);
        String rate1 = team1.getRate(30);
        System.out.println(rate1);


        Player player1 = new Player("pp",2,3);
        Player player2 = new Player("pp",2,3);
        Player player3 = new Player("pp",2,3);
        Player player4 = new Player("pp",2,3);
        System.out.println(Player.getTotalGoals());
        System.out.println(Player.getTotalAssist());


        Player[] mytest = new Player[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter name for player # " + i+1 + ": ");
            //char name = scan.next().charAt(0);
            String name = scan.next();
            System.out.println("Enter number of goals for " + name + ": ");
            int g = scan.nextInt();
            System.out.println("Enter number of assists for " + name + ":");
            int a = scan.nextInt();

            Player my = new Player(name,g,a);
            mytest[i] = my;
//            System.out.println(mytest[i]);
        }




    }



}
