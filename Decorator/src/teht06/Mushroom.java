package teht06;

public class Mushroom extends ToppingDecorator implements Pizza {
	
	public Mushroom(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
	public double getPrice() {
		return pizzaToBeDecorated.getPrice() + 1.00;
	}
	
	public String getDescription() {
		return pizzaToBeDecorated.getDescription()+", Mushroom";
	}
	
}
