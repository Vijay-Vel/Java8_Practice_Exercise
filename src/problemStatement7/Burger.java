package problemStatement7;

public class Burger {

	private String burgerType;

    public Burger(String burgerType) {
        this.burgerType = burgerType;
    }

    public String getBurgerType() {
        return burgerType;
    }

    public Burger addVeggies() {
        System.out.println("Adding veggies to the burger");
        return new Burger(this.burgerType + " Veggie");
    }

    public Burger addCheese() {
        System.out.println("Adding cheese to the burger");
        return new Burger(this.burgerType + " Cheese");
    }

    @Override
    public String toString() {
        return burgerType + " burger";
    }
}
