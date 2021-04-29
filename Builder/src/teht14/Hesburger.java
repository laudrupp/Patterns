package teht14;

class Hesburger implements HamburgerParts {
	
	Bun bun;
	Patty patty;
	Cheese cheese;
	Veggies veggies;
	Condiments condiments;

	@Override
	public void setBun(String bun) {
		this.bun = new Bun(bun);
	}

	@Override
	public void setPatty(String patty) {
		this.patty = new Patty(patty);
	}

	@Override
	public void setCheese(String cheese) {
		this.cheese = new Cheese(cheese);
	}

	@Override
	public void setVeggies(String veggies) {
		this.veggies = new Veggies(veggies);
	}

	@Override
	public void setCondiments(String condiments) {
		this.condiments = new Condiments(condiments);
	}
	
	public Bun getBun() {
		return bun;
	}

	public Patty getPatty() {
		return patty;
	}

	public Cheese getCheese() {
		return cheese;
	}

	public Veggies getVeggies() {
		return veggies;
	}

	public Condiments getCondiments() {
		return condiments;
	}
	
	


	class Bun extends Hesburger{
		String bun;
		public Bun(String bun) {
			this.bun = bun;
		}
		public String readBun() {
			return bun;
		}
	}
	
	public class Patty extends Hesburger {
		String patty;
		public Patty(String patty) {
			this.patty = patty;
		}
		public String readPatty() {
			return patty;
		}
	}
	
	public class Cheese extends Hesburger {
		String cheese;
		public Cheese(String cheese) {
			this.cheese = cheese;
		}
		public String readCheese() {
			return cheese;
		}
	}
	
	public class Veggies extends Hesburger {
		String veggies;
		public Veggies(String veggies) {
			this.veggies = veggies;
		}
		public String readVeggies() {
			return veggies;
		}
	}
	
	public class Condiments extends Hesburger {
		String condiments;
		public Condiments(String condiments) {
			this.condiments = condiments;
		}
		public String readCondiments() {
			return condiments;
		}
	}
}
