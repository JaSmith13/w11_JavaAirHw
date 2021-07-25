package people;

public class Passenger {

    private String name;
    private int noOfBags;

    public Passenger(String name, int noOfBags){
        this.name = name;
        this.noOfBags = noOfBags;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getNoOfBags() {
        return noOfBags;
    }
}
