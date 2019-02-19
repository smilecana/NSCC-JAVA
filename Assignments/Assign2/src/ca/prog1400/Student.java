package ca.prog1400;

public class Student extends Person {
    private int year;
    private int numStudent;
    private double yearFee;

    // constructor
    public Student(String name, String address, int year,double yearFee) {
        super(name,address);
        this.year = year;
        this.yearFee = yearFee;
    }

    //get yearFee
    public double getYearFee() {
        return yearFee;
    }

    // get number of student
    public int getNumStudent() {
        return numStudent;
    }

    // set the number of student
    public void setNumStudent(int numStudent) {
        this.numStudent = numStudent;
    }

    public String toString() {

        return String.format("%d. name = %s, address = %s, year = %d, fee = $%.2f",
                this.getNumStudent(), this.getName(),this.getAddress(),this.year, this.yearFee);
    }
}
