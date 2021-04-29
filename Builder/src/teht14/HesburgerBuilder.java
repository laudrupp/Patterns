package teht14;

import teht14.Hesburger.Bun;
import teht14.Hesburger.Cheese;
import teht14.Hesburger.Condiments;
import teht14.Hesburger.Patty;
import teht14.Hesburger.Veggies;

public class HesburgerBuilder implements HamburgerBuilder {
	
	private Hesburger burger;
	Hesburger[] list = new Hesburger[5];
	
	public HesburgerBuilder() {
		this.burger = new Hesburger();
	}
	
	@Override
	public void buildBun() {
		burger.setBun("Sesame Seed Bun");
		list[0] = burger.getBun();
		System.out.println(((Bun) list[0]).readBun()+" added to object list");

	}

	@Override
	public void buildPatty() {
		burger.setPatty("Organic Beef Patty");
		list[1] = burger.getPatty();
		System.out.println(((Patty) list[1]).readPatty()+" added to object list");
	}

	@Override
	public void buildCheese() {
		burger.setCheese("Cheddar Cheese");
		list[2] = burger.getCheese();
		System.out.println(((Cheese) list[2]).readCheese()+" added to object list");
	}

	@Override
	public void buildVeggies() {
		burger.setVeggies("Lettuce, Tomato, Red Onion, Dill Pickle");
		list[3] = burger.getVeggies();
		System.out.println(((Veggies) list[3]).readVeggies()+" added to object list");
	}

	@Override
	public void buildCondiments() {
		burger.setCondiments("BBQ Aioli");
		list[4] = burger.getCondiments();
		System.out.println(((Condiments) list[4]).readCondiments()+" added to object list");
	}

	@Override
	public Hesburger[] getBurger() {
		return list;
	}
	
	@Override
	public String getBurger(String[] list) {
		return null;
	}

}
