package teht06;

public class Pineapple extends ToppingDecorator implements Pizza {
	
	public Pineapple(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
	public double getPrice() {
		return pizzaToBeDecorated.getPrice() + 0.50;
	}
	
	public String getDescription() {
		return pizzaToBeDecorated.getDescription()+", Pineapple";
	}
	
}