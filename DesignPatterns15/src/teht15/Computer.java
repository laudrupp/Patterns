package teht15;

public class Computer implements Product {
	
	double price;
	
	public Computer(double price) {
		this.price = price;
	}
	
	@Override
	public double getPrice() {
		return price;
	}

}
