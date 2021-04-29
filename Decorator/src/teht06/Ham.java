package teht06;

public class Ham extends ToppingDecorator implements Pizza {
	
	public Ham(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
	public double getPrice() {
		return pizzaToBeDecorated.getPrice() + 1.20;
	}
	
	public String getDescription() {
		return pizzaToBeDecorated.getDescription()+", Ham";
	}
	
}

