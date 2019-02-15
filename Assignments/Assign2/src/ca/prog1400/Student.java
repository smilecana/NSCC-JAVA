package ca.prog1400;

public class Student extends Person {
    private int year;
    private int numStudent;

    // constructor
    public Student(String name, String address, int year) {
        super(name,address);
        this.year = year;
    }

    // get fee
    public double yearFee() {

        return 3000+this.year*100 - 100;

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
                this.getNumStudent(), this.getName(),this.getAddress(),this.year, this.yearFee());
    }
}
