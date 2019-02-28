package ca.prog1400;

import java.util.*;
import javax.swing.*;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Staff> staffs = new ArrayList<>();
        Object[] roleChoose = {"Student","Staff","Finish"};
        int valChoose = 0;
        int numStudent = 0;
        int numStaff = 0;

        // Input information
        while (valChoose != 2) {
            // choose student or staff or finished
            valChoose = JOptionPane.showOptionDialog(null,
                    "Select Student or Staff.",
                    "Accounting App",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null, roleChoose, roleChoose[0]);

            if (valChoose == 0) {

                numStudent++;

                int year = isNumeric(valChoose);
                String name = isBlank("Enter Student Name");
                String address = isBlank("Enter Student Address");

                Student eachStudent = new Student(name, address,year);
                eachStudent.setNumStudent(numStudent);
                students.add(eachStudent);

            }
            else if (valChoose == 1) {

                numStaff++;

                String name = isBlank("Enter Staff Name");
                String address = isBlank("Enter Staff Address");
                int year = isNumeric(valChoose);

                Staff eachStaff = new Staff(name, address, year);
                eachStaff.setNumStaff(numStaff);
                staffs.add(eachStaff);

            }
            else {
                valChoose = 2;
            }
        }
//        double sumFee = 0;
//        double sumPay = 0;
        // output the report
//        if(students.size() != 0 || staffs.size() !=0) {
            double sumFee = Student.getTotalIncoming(students);
            double sumPay = Staff.getTotalOutgoing(staffs);
//
//        }
            String output = "Students [Total: " + students.size() + "]\n";
            for (Student currentValue : students) {

                output += currentValue.toString() + "\n";
            }

            output += "Staffs [Total: " + staffs.size() + "]\n";
            for (Staff currentValue : staffs) {

                output += currentValue.toString() + "\n";
            }

            output += String.format("\n\nResult:\nOutgoing: $%.2f\nIncoming: $%.2f\nTotal: $%.2f",
                    sumPay, sumFee, sumFee - sumPay);

            JOptionPane.showMessageDialog(null, output);


    }
    // method: input variable
    private static String userInput(String message){
        return JOptionPane.showInputDialog(null,
                message,
                "Input", JOptionPane.QUESTION_MESSAGE);

    }

    // Validation method
    // student year validation
    public static boolean isNumericStudent(String str){
        Pattern pattern = Pattern.compile("^[1-4]\\s*$");
        return pattern.matcher(str).matches();
    }
    // staff service year validation
    public static boolean isNumericStaff(String str){
        Pattern pattern = Pattern.compile("^[1-9]|[1-2][0-9]\\s*$");
        return pattern.matcher(str).matches();
    }

    // input number validation
    public static int isNumeric(int type){
        String str="";

        if (type == 0) {
             str = userInput("Enter Student Year (1-4)");

            while(!isNumericStudent(str)) {
                if (str == null || str.equals("")) {
                    JOptionPane.showMessageDialog(null,"Please enter valid information");

                }
                else if (!isNumericStudent(str)) {
                    JOptionPane.showMessageDialog(null,"Please enter a number(1-4)");
                }
                str = userInput("Enter Student Year (1-4)");
            }
        }
        else if (type == 1) {
             str = userInput("Enter staff year of service (1-29)");

            while(!isNumericStaff(str)) {
                if (str == null || str.equals("")) {
                    JOptionPane.showMessageDialog(null,"Please enter valid information");

                }
                else if (!isNumericStaff(str)) {
                    JOptionPane.showMessageDialog(null,"Please enter a number(1-29)");
                }
                str = userInput("Enter staff year of service (1-29)");
            }
        }

        return Integer.parseInt(str);
    }


    // validate not blank
    public static String isBlank(String msg) {

        String strInput = userInput(msg);

        while (strInput == null || strInput.equals("")) {

            JOptionPane.showMessageDialog(null, "Please enter valid information");
            strInput = userInput(msg);
        }
        return strInput;
    }

}
