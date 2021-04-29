package teht06;

public abstract class ToppingDecorator {

	protected Pizza pizzaToBeDecorated;
	
	public ToppingDecorator(Pizza pizzaToBeDecorated) {
		this.pizzaToBeDecorated = pizzaToBeDecorated;
	}
	
	public double getPrice() {
		return pizzaToBeDecorated.getPrice();
	}
	
	public String getDescription() {
		return pizzaToBeDecorated.getDescription();
	}
	
}
