package teht06;

public class Onion extends ToppingDecorator implements Pizza {
	
	public Onion(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
	public double getPrice() {
		return pizzaToBeDecorated.getPrice() + 0.50;
	}
	
	public String getDescription() {
		return pizzaToBeDecorated.getDescription()+", Onion";
	}
	
}