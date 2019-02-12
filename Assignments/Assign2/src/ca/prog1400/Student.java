package ca.prog1400;

public class Student extends Person {
    private int year;
    private int numStudent;

    public Student(String name, String address, int year) {
        super(name,address);
        this.year = year;
    }

    public double yearFee() {

        return 3000+this.year*100 - 100;

    }

    public int getNumStudent() {
        return numStudent;
    }

    public void setNumStudent(int numStudent) {
        this.numStudent = numStudent;
    }

    public String toString() {

        return String.format("%d. name = %s, address = %s, year = %d, fee = $%.2f",
                this.getNumStudent(), this.getName(),this.getAddress(),this.year, this.yearFee());
    }
}
