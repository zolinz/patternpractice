package builder;

import java.util.List;

/**
 * Created by Zoli on 24/05/2017.
 */
public class Pizza {

    public List<Topping> getToppings() {
        return toppings;
    }

    public String getSize() {
        return size;
    }

    public String getSouce() {
        return souce;
    }

    private final List<Topping> toppings;
    private final String size;
    private final String souce;

    public Pizza(Builder builder) {
        this.size = builder.getSize();
        this.souce = builder.getSouce();
        this.toppings = builder.getToppings();
    }


    public String description() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("This is a %s sized pizza with %s souce.", size, souce));
        if (toppings != null) {
            sb.append("\nIt contains;");
            for (Topping topping : toppings) {
                sb.append(String.format("\n%s", topping.description()));
            }
        }

        return sb.toString();
    }


}
