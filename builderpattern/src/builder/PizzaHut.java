package builder;

/**
 * Created by Zoli on 24/05/2017.
 */
public class PizzaHut {


    public static void main(String[] args) {
        Pizza pizza = new Builder("medium")
                .souce("tomato")
                .with("Onion")
                .with("Sausage").cooked()
                .with("Mozzarella")
                .build();

        System.out.println(pizza.description());
    }
}
