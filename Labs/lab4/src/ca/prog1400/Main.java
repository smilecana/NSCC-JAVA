package ca.prog1400;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Food[] picnicBasket = new Food[3];

        Food banana = new Food("banana","fruit");
        Food buger = new Food("buger", "meat");
        Food lettuce = new Food("lettuce", "vegetable");

        picnicBasket[0] = banana;
        picnicBasket[1] = buger;
        picnicBasket[2] = lettuce;

        for (int i = 0; i < picnicBasket.length; i++) {
            Food currentFood = picnicBasket[i];

            if(currentFood.type.equals("vegetable")){
                String eatIt = currentFood.eatlt(currentFood.name);
                System.out.println(eatIt);
            }
            else if (currentFood.type.equals("meat")){
                String deny = currentFood.denylt(currentFood.type);
                System.out.println("My food is " + currentFood.name);
                System.out.println(deny);
            }
            else{
                System.out.println("My food is " + currentFood.name);
                //System.out.println("The type is " + currentFood.type);
            }
            System.out.println();
        }
    }
}
