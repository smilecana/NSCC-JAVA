package ca.prog1400;

public class Staff extends Person{
    private int yearService;
    private int numStaff;

    public Staff(String name, String address, int yearService) {
        super(name,address);
        this.yearService = yearService;
    }

    public double yearSalary() {
        return 50000 + this.yearService * 500;
    }

    public int getNumStaff() {
        return numStaff;
    }

    public void setNumStaff(int numStaff) {
        this.numStaff = numStaff;
    }

    public String toString() {

        return String.format("%d. name = %s, address = %s, years = %d, pay = $%.2f",
                this.getNumStaff(),this.getName(),this.getAddress(),this.yearService, this.yearSalary());
    }


}
