package teht03;


public class Leaf implements Component {
	
	
	private String name;
	private double price;
	
	
	public Leaf(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getChildPrices() {
		return price;
	}
	
	public void print() {
		System.out.println(this.getName()+" = "+this.getPrice()+"€");
	}
	
	
	public void addComponent(Component component) {}
	
	public void removeComponent(Component component) {}
	
	public Component getChild(int i) {
		return null;
	}

}