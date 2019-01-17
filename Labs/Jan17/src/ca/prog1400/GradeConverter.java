package ca.prog1400;

import java.util.Scanner;

public class GradeConverter {

    public static void main(String[] args) { //psvm

        char [] grades = {'A','B','C','D','F'};
        double [] numbers = {4,3,2,1,0};

        System.out.println("Grade Converter");
        System.out.println("Please enter a grade: ");

        Scanner scanner = new Scanner(System.in);
        //Let's grad a grade

        char inputgrade = scanner.next().charAt(0);

        for (int i = 0; i < grades.length; i++) {
            char compareGrade = grades[i];
            //System.out.println(compareGrade);
            if (compareGrade == inputgrade) {
                System.out.println(
                        String.format("The number grade for %s is %.2f",inputgrade,numbers[i])
                );
            }
        }


    }

}
