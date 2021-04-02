package teht06;

public class Pepperoni extends ToppingDecorator implements Pizza {
	
	public Pepperoni(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
	public double getPrice() {
		return pizzaToBeDecorated.getPrice() + 1.25;
	}
	
	public String getDescription() {
		return pizzaToBeDecorated.getDescription()+", Pepperoni";
	}
	
}
