/**
 * Created by unike on 12.11.2016.
 */
public class Eagle extends Bird {
    int rangeOfFlight = 1000;
    boolean plumage = true;

    private Eagle() {
        super(true,"birds","Eagle");
    }

    Eagle (int rangeOfFlight){
        super(false,"meat","Eagle");
        this.rangeOfFlight = rangeOfFlight;
    }

    Eagle(boolean vegetarian, String eats, boolean plumage){
        super (vegetarian,eats,"Eagle");
        this.plumage = plumage;
    }

    String getEagleProperties() {
        return "plumage = " + plumage +  " , type = " + type;
    }
}
