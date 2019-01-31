package ca.prog1400;
/*
* Class for Animal of Zoo
*/
public class Animal {
    private String species;   // required
    private double maxWeight;   // not required. default 0/-1
    private String habitat;    //  required
    private boolean isEndangered; // not required, default false

    //Default constructor. SUpplying values
    public Animal() {
        this.species = null; //N/A
        this.maxWeight = 0;
        this.habitat = null;
        this.isEndangered = false;
    }

    // Standard Constructor. parameterized constructor.
    public Animal(String species, double maxWeight, String habitat, boolean isEndangered) {
        this.species = species;
        this.maxWeight = maxWeight;
        this.habitat = habitat;
        this.isEndangered = isEndangered;
    }

    //method positon
    public String feed(String food) {
        maxWeight += food.length();
        return String.format("NOM. I ate the %s",food);
    }

    public String makeSound() {
        return String.format("I am a %s and I made a sound",this.species);
    }

    // To String
    public String toString() {
        String returnValue = String.format("I am a %s that lives in the %s,",this.species,this.habitat);

        if(this.isEndangered) {
            returnValue += "I am endangerous";

        }
        else
        {
            returnValue += "I am dangerous";
        }
        return returnValue;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        if(species != null && !species.equals(""))
        {
            this.species = species;
        }

    }
    //only read
    public double getMaxWeight() {
        return maxWeight;
    }

    //
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if(habitat != null && habitat.equals(""))
        {
            this.habitat = habitat;
        }

    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }



}
