/**
 * Created by unike on 12.11.2016.
 */
public class Mammal extends Animal {
    String type;

    Mammal(String type) {
        super(true, "grass", 4);
        this.type = type;
    }
}
