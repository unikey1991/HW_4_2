/**
 * Created by unike on 12.11.2016.
 */
public class Fish extends Animal {
    String type;


    Fish(String type, boolean vegetarian, String eats) {
        super(vegetarian, eats, 0);
        this.type = type;
    }


}
