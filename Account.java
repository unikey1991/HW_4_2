/**
 * Created by unike on 12.11.2016.
 */
public class Account {
    int id;
    int amount;

    public Account(int id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public Account(int id) {
        this.id = id;
    }

    public Account() {
    }

    String getAmount() {
        return "amount = " + amount;
    }

    String getId() {
        return "id = " + id;
    }
}
