package teht03;


public interface Component {
	
	public String getName();
	public double getPrice();
	public double getChildPrices();
	public void addComponent(Component component);
	public void removeComponent(Component component);
	public void print();
	
}
