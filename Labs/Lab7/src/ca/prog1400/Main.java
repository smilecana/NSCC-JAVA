package ca.prog1400;
import java.util.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String message1 = "Welcome to the Party Picker.\n\n";
        message1 += "Enterperson'name and the type of food they're likely to bring, \n";
        message1 += "then indicate whether they are actually invited to the party or not.";

        JOptionPane.showMessageDialog(null,
                message1);

        ArrayList<Friend> friends = new ArrayList<>();
        int val;
        boolean valInvitedGuest = true;

        do {

            String inputFirstName = JOptionPane.showInputDialog(null,"Enter first name",
                    "Party Picker",JOptionPane.QUESTION_MESSAGE);

            String inputLastName = JOptionPane.showInputDialog(null,"Enter last name",
                    "Party Picker",JOptionPane.QUESTION_MESSAGE);

            String inputFood = JOptionPane.showInputDialog(null,
                    "Enter the food they usually bring","Party Picker",
                    JOptionPane.QUESTION_MESSAGE);

            Object[] isInvitedGuest = {"Invited","Not Invited"};

            int valInvited = JOptionPane.showOptionDialog(null,
                    "Choose if this guested is Invited or Not Invite",
                    "Party Picker",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,isInvitedGuest,isInvitedGuest[0]);

            if (valInvited == 1) {
                valInvitedGuest = false;
            }

            friends.add(new Friend(inputFirstName,inputLastName,valInvitedGuest,inputFood));

            val = JOptionPane.showConfirmDialog(null,
                    "Enter another guest?","Party Picker",JOptionPane.YES_NO_OPTION);

        }while(val == 0);

        String output = "";

        for (Friend currentValue:friends) {

            output += currentValue.toString() + "\n";

        }

        JOptionPane.showMessageDialog(null,
                "Guests:\n\n" + output);


    }
}
