package teht06;

public class PizzaOven {
	
	public void makeDriver() {
		Pizza driver = new Pepperoni(new Jalapeno(new Mozzarella(new Crust())));
		System.out.println("Pizza: Driver Special");
		System.out.println("Ingredients: "+driver.getDescription());
		System.out.println("Price: "+driver.getPrice()+"€");
		System.out.println("- - - - -");
	}
	
	public void makeHouse() {
		Pizza house = new Kebab(new Pepperoni(new Mushroom(new Onion(new BellPepper(new Crust())))));
		System.out.println("Pizza: House Special");
		System.out.println("Ingredients: "+house.getDescription());
		System.out.println("Price: "+house.getPrice()+"€");
		System.out.println("- - - - -");
	}
	
	public void makeAmericana() {
		Pizza americana = new Ham(new BlueCheese(new Pineapple(new Crust())));
		System.out.println("Pizza: Americana");
		System.out.println("Ingredients: "+americana.getDescription());
		System.out.println("Price: "+americana.getPrice()+"€");
		System.out.println("- - - - -");
	}

}
