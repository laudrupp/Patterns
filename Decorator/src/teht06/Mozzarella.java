package teht06;

public class Mozzarella extends ToppingDecorator implements Pizza {

	public Mozzarella(Pizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}
	
	public double getPrice() {
		return pizzaToBeDecorated.getPrice() + 1.00;
	}
	
	public String getDescription() {
		return pizzaToBeDecorated.getDescription() + ", Mozzarella";
	}

}
