package builder;

/**
 * Created by Zoli on 24/05/2017.
 */
public class Topping {

    private final String name;
    private boolean cooked;

    public Topping(String name) {
        this.name = name;
    }

    public void setCooked(boolean cooked) {
        this.cooked = cooked;
    }

    public String description() {
        return String.format("%s%s", cooked ? "Cooked " : "", name);
    }
}
