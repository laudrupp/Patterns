package teht06;

public class BlueCheese extends ToppingDecorator implements Pizza {
	
	public BlueCheese(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
	public double getPrice() {
		return pizzaToBeDecorated.getPrice() + 1.15;
	}
	
	public String getDescription() {
		return pizzaToBeDecorated.getDescription()+", Blue Cheese";
	}
	
}
