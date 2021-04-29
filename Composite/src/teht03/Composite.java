package teht03;

import java.util.ArrayList;
import java.util.List;


public class Composite implements Component {

	
	private String name;
	private double price;
	private double childprices;
	
	
	public Composite(String name, double price) {
		this.name = name;
		this.price = price;
	}

	
	public String getName() {
		return name;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	
	public void print() {
		System.out.println(this.getName()+": "+this.getPrice()+"€");
	}
	
	
	List<Component> components = new ArrayList<Component>();
	public void addComponent(Component component) {
		components.add(component);
		System.out.println(component.getName()+": "+component.getPrice()+"€"+" <- added");
	}
	
	
	public void removeComponent(Component component) {
		components.remove(component);
	}
	
	
	public double getChildPrices() {
		for (Component c : components) {
			childprices += c.getChildPrices();
		}
		return childprices+this.getPrice();
	}
	
	
	public Component getChild(int i) {
		return components.get(i);
	}

}
