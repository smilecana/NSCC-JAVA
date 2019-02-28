package ca.prog1400;

public abstract class Person {
    private String name;
    private String address;

    //Constructor
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    // get the name
    public String getName() {
        return name;
    };


    // get the address

    public String getAddress() {
        return address;
    }


}
