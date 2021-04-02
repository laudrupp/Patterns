package teht06;

public class BellPepper extends ToppingDecorator implements Pizza {
	
	public BellPepper(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
	public double getPrice() {
		return pizzaToBeDecorated.getPrice() + 0.75;
	}
	
	public String getDescription() {
		return pizzaToBeDecorated.getDescription()+", Bell Pepper";
	}
	
}
