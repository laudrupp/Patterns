package teht02b;

public interface Shoes {
	
	String getProduct();
}

class AdidasShoes implements Shoes {
	
	public String getProduct() {
		return "Adidaksen kengät";
	} 
}

class BossShoes implements Shoes {
	
	public String getProduct() {
		return "Bossin kengät";
	} 
}
