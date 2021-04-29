package teht02;

public interface Hat {
	
	String getProduct();
}

class AdidasHat implements Hat {
	
	public String getProduct() {
		return "Adidaksen lippis";
	} 
}

class BossHat implements Hat {
	
	public String getProduct() {
		return "Bossin hattu";
	} 
}
