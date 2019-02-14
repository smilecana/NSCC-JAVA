package ca.prog1400;

public class Friend extends Person {
    private String foodToBring;
    private String GuestInvited = "";

    public Friend (String firstName, String lastName, boolean isInvited, String foodToBring) {
        super(firstName,lastName,isInvited);
        this.foodToBring = foodToBring;

    }
    @Override
    public String toString() {
        if(!isInvited()){

            GuestInvited = "NOT";
        }
        String friendDetails = "";
        friendDetails += getFullName() + " is bringing " + this.foodToBring +
                ". They are " + GuestInvited + " invited to the party.";

        return friendDetails;
    }

    @Override
    public void goToParty() {
        System.out.println("Hello");
    }

    @Override
    public String getFullName() {

        return "My full name is " + super.getFullName();
    }
}
