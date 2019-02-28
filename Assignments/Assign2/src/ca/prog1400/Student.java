package ca.prog1400;

import java.util.ArrayList;

public class Student extends Person {
    private int year;
    private int numStudent;
    private double yearFee;
    //private double yearIncrease = 100;

    // constructor
    public Student(String name, String address, int year) {
        super(name,address);
        this.year = year;
        //this.yearFee += (this.year-1)*this.yearIncrease;
        this.yearFee = calculateYearFee(year);
    }

    // calculate the yearFee
    public static double calculateYearFee(int year){
        return 3000+(year-1)*100;
    }

    // get number of student
    public int getNumStudent() {
        return numStudent;
    }

    // set the number of student
    public void setNumStudent(int numStudent) {
        this.numStudent = numStudent;
    }

    // calculate the total incoming
    public static double getTotalIncoming(ArrayList<Student> studentsFee) {

        double totalFee = 0;

        for (Student element : studentsFee) {
            totalFee += element.yearFee ;
        }
        totalFee = totalFee / 2 ;

        return totalFee;
        }


    @Override
    public String toString() {

        return String.format("%d. name = %s, address = %s, year = %d, fee = $%.2f",
                this.getNumStudent(), this.getName(),this.getAddress(),this.year, this.yearFee);
    }
}
