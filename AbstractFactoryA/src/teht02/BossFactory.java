package teht02;

public class BossFactory extends AbstractFactory {
	
	public Hat makeHat() {
		return new BossHat();
	}
	
	public Shirt makeShirt() {
		return new BossShirt();
	}
	
	public Jeans makeJeans() {
		return new BossJeans();
	}
	
	public Shoes makeShoes() {
		return new BossShoes();
	}
	
}
