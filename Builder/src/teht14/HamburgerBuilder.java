package teht14;

public interface HamburgerBuilder {

	public void buildBun();
	public void buildPatty();
	public void buildCheese();
	public void buildVeggies();
	public void buildCondiments();
	public Hesburger[] getBurger();
	public String getBurger(String[] list);
}
