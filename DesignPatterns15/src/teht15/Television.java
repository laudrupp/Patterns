package teht15;

public class Television implements Product {

	double price;
	
	public Television(double price) {
		this.price = price;
	}
	
	@Override
	public double getPrice() {
		return price;
	}

}
