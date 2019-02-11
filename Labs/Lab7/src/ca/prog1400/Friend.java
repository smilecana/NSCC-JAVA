package ca.prog1400;

public class Friend extends Person {
    private String foodToBring;
    private String GuestInvited;

    public Friend (String firstName, String lastName, boolean isInvited, String foodToBring) {
        super(firstName,lastName,isInvited);
        this.foodToBring = foodToBring;

    }

    public String toString() {
        if(super.isInvited()){
            GuestInvited = "";
        }
        else
        {
            GuestInvited = "NOT";
        }
        return super.getFullName() + " is bringing " + this.foodToBring +
                ". They are " + GuestInvited + " invited to the party.";
    }
}
