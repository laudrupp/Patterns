package teht06;

public class Kebab extends ToppingDecorator implements Pizza  {
	
	public Kebab(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
	public double getPrice() {
		return pizzaToBeDecorated.getPrice() + 1.50;
	}
	
	public String getDescription() {
		return pizzaToBeDecorated.getDescription()+", Kebab";
	}
	
}
