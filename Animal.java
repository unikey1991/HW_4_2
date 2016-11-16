/**
 * Created by unike on 12.11.2016.
 */
public class Animal {
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;


    Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    protected String isVegetarian() {
        return "vegetarian = " + vegetarian;
    }

    protected String getEats() {
        return "eats = " + eats;
    }

    protected String getNoOfLegs() {
        return "noOfLegs = " + noOfLegs;
    }

}
