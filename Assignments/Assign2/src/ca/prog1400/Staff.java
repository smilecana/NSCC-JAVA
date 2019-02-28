package ca.prog1400;

import java.util.ArrayList;

public class Staff extends Person{
    private int yearService;
    private int numStaff;
    private double yearSalary = 50000;
    private double yearIncrease = 500;

    // constructor
    public Staff(String name, String address, int yearService) {
        super(name,address);
        this.yearService = yearService;
        this.yearSalary += this.yearService * this.yearIncrease;
    }

    // get the number of staff
    public int getNumStaff() {
        return numStaff;
    }

    //set the number of staff
    public void setNumStaff(int numStaff) {
        this.numStaff = numStaff;
    }

    // calculate the total incoming
    public static double getTotalOutgoing(ArrayList<Staff> staffSalary) {
        if(staffSalary.size()<1){
            return 0;
        }
        else {
            double totalSalary = 0;
            for (Staff element : staffSalary) {
                totalSalary += element.yearSalary;
            }
            return totalSalary / 26;
        }
    }

    @Override
    public String toString() {

        return String.format("%d. name = %s, address = %s, years = %d, pay = $%.2f",
                this.getNumStaff(),this.getName(),this.getAddress(),this.yearService, this.yearSalary);
    }


}
