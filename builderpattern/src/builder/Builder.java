package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zoli on 24/05/2017.
 */
public class Builder {

    private List<Topping> toppings;
    private String size;
    private String souce;

    //getters setters
    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSouce() {
        return souce;
    }

    public void setSouce(String souce) {
        this.souce = souce;
    }


    //constructors
    public Builder(String size) {
        this.size = size;
    }

    public Builder with(String name) {
        if (toppings == null) {
            toppings = new ArrayList<>();
        }
        toppings.add(new Topping(name));
        return this;
    }


    public Builder cooked() {
        if (toppings != null && toppings.size() > 0) {
            Topping topping = toppings.get(toppings.size() - 1);
            topping.setCooked(true);
        }
        return this;
    }

    public Builder souce(String souce) {
        this.souce = souce;
        return this;
    }

    public Pizza build() {
        return new Pizza(this);
    }
}
