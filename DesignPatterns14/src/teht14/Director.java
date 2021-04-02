package teht14;

public class Director {
	
	private HamburgerBuilder builder;
	String[] list;
	
	public Director(HamburgerBuilder builder) {
		this.builder = builder;
	}
	
	public void setBuilder(HamburgerBuilder builder) {
		this.builder = builder;
	}
	
	public Hesburger[] getHesburger() {
		return this.builder.getBurger();
	}
	
	public String getMcDonalds() {
		return this.builder.getBurger(list);
	}
	
	public void makeHamburger() {
		this.builder.buildBun();
		this.builder.buildPatty();
		this.builder.buildCheese();
		this.builder.buildVeggies();
		this.builder.buildCondiments();
	}

}
