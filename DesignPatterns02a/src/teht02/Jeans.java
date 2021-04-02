package teht02;

public interface Jeans {
	
	String getProduct();
}

class AdidasJeans implements Jeans {
	
	public String getProduct() {
		return "Adidaksen farkut";
	} 
}

class BossJeans implements Jeans {
	
	public String getProduct() {
		return "Bossin farkut";
	}
}