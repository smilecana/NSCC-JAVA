package ca.prog1400;

public class Staff extends Person{
    private int yearService;
    private int numStaff;

    // constructor
    public Staff(String name, String address, int yearService) {
        super(name,address);
        this.yearService = yearService;
    }

    // calculate the salary
    public double yearSalary() {
        return 50000 + this.yearService * 500;
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
                this.getNumStaff(),this.getName(),this.getAddress(),this.yearService, this.yearSalary());
    }


}
