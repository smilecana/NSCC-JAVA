package ca.prog1400;

public class Staff extends Person{
    private int yearService;
    private int numStaff;
    private double yearSalary;

    // constructor
    public Staff(String name, String address, int yearService,double yearSalary) {
        super(name,address);
        this.yearService = yearService;
        this.yearSalary = yearSalary;
    }

    // get the salary
    public double getYearSalary() {
        return yearSalary;
    }

    // get the number of staff
    public int getNumStaff() {
        return numStaff;
    }

    //set the number of staff
    public void setNumStaff(int numStaff) {
        this.numStaff = numStaff;
    }

    public String toString() {

        return String.format("%d. name = %s, address = %s, years = %d, pay = $%.2f",
                this.getNumStaff(),this.getName(),this.getAddress(),this.yearService, this.yearSalary);
    }


}
