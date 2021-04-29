package teht14;

public class McDonalds implements HamburgerParts {
	
	private String bun;
	private String patty;
	private String cheese;
	private String veggies;
	private String condiments;
	
	@Override
	public void setBun(String bun) {
		this.bun = bun;
	}
	
	@Override
	public void setPatty(String patty) {
		this.patty = patty;
	}
	
	@Override
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	
	@Override
	public void setVeggies(String veggies) {
		this.veggies = veggies;
	}
	
	@Override
	public void setCondiments(String condiments) {
		this.condiments = condiments;
	}
	
	public String getBun() {
		return bun;
	}
	
	public String getPatty() {
		return patty;
	}
	
	public String getCheese() {
		return cheese;
	}
	
	public String getVeggies() {
		return veggies;
	}
	
	public String getCondiments() {
		return condiments;
	}
}
