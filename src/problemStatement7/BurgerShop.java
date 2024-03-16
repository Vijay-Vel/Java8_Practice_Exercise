package problemStatement7;

import java.util.function.Function;

public class BurgerShop {
	
	Function<Burger, Burger> decoration;

    public BurgerShop(Function<Burger, Burger> decoration) {
        this.decoration = decoration;
    }

    public Burger use(Burger baseBurger) {
        System.out.println("Base Burger: " + baseBurger);
        return decoration.apply(baseBurger);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Burger baseBurger = new Burger("");

        // Create a BurgerShop with decorations
        BurgerShop burgerShop = new BurgerShop(Function.identity());

        baseBurger = burgerShop.use(baseBurger);
        // Place an order with veggies
        baseBurger = burgerShop.use(baseBurger.addVeggies());
        // Place an order with cheese
        baseBurger = baseBurger.addCheese();

        // Final order
        System.out.println("I get " + baseBurger);
    }
}
