package ca.prog1400;
import java.util.Scanner;


public class GradeConverter {


    public static char [] grade = {'A','B','C','D','F'};
    public static int [] score = {4,3,2,1,0};


    public void getGrade () {
        //return GradeConverter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your grade: ");
        char yourGrade = scanner.next().charAt(0);

        for (int i = 0; i < grade.length; i++) {
            if (grade[i] == yourGrade){
                System.out.println("Your grade is: " + score[i]);
                //System.out.println(String.format("Your grade is: %.1f", score[i]));
            }
        }


    }

    public static void main(String[] args) {
        GradeConverter score = new GradeConverter();
        score.getGrade();
    }
}
