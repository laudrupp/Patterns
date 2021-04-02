package teht06;

public class Jalapeno extends ToppingDecorator implements Pizza {
	
	public Jalapeno(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
	public double getPrice() {
		return pizzaToBeDecorated.getPrice() + 1.00;
	}
	
	public String getDescription() {
		return pizzaToBeDecorated.getDescription()+", Jalapeño";
	}
	
}
