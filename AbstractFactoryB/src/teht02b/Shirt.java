package teht02b;

public interface Shirt {
	
	String getProduct();
}

class AdidasShirt implements Shirt {
	
	public String getProduct() {
		return "Adidaksen t-paita";
	} 
}

class BossShirt implements Shirt {
	
	public String getProduct() {
		return "Bossin paita";
	} 
}
