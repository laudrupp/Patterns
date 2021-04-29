package teht14;

public class McDonaldsBuilder implements HamburgerBuilder {
	
	private McDonalds burger;
	String[] list = new String[5];
	
	public McDonaldsBuilder() {
		this.burger = new McDonalds();
	}
	
	@Override
	public void buildBun() {
		burger.setBun("Brioche Bun");
		list[0] = burger.getBun();
	}

	@Override
	public void buildPatty() {
		burger.setPatty("Crispy Chicken Patty");
		list[1] = burger.getPatty();
	}

	@Override
	public void buildCheese() {
		burger.setCheese("Gouda Cheese");
		list[2] = burger.getCheese();
	}

	@Override
	public void buildVeggies() {
		burger.setVeggies("Lettuce, Jalapeño, Red Onion");
		list[3] = burger.getVeggies();
	}

	@Override
	public void buildCondiments() {
		burger.setCondiments("Honey Mustard Sauce");
		list[4] = burger.getCondiments();
	}

	@Override
	public Hesburger[] getBurger() {
		return null;
	}

	@Override
	public String getBurger(String[] list) {
		list = this.list;
		return list[0].toString()+", "+list[1].toString()+", "+list[2].toString()+", "+list[3].toString()+" and "+list[4].toString();
	}

}
