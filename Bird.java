/**
 * Created by unike on 12.11.2016.
 */
public class Bird extends Animal {
    String type;

    Bird(boolean vegetarian, String eats, String type) {
        super(vegetarian, eats, 2);
        this.type = type;
    }

}
