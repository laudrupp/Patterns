package teht02;

public class AdidasFactory extends AbstractFactory {
	
	public Hat makeHat() {
		return new AdidasHat();
	}
	
	public Shirt makeShirt() {
		return new AdidasShirt();
	}
	
	public Jeans makeJeans() {
		return new AdidasJeans();
	}
	
	public Shoes makeShoes() {
		return new AdidasShoes();
	}
	
}
