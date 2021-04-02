package teht13;

public class Blastoise extends Pokemon implements WaterPokemonState, Visitable {

	@Override
	public void next(WaterPokemon squirtle) {
		System.out.println("Blastoise can't evolve!");
	}

	@Override
	public void previous(WaterPokemon squirtle) {
		squirtle.setState(new Wartortle());
		System.out.println("Blastoise devolved into Wartortle");
	}
	
	@Override
	public String printStatus() {
		return "Blastoise";
	}
	
	public void firstAbility() {
		System.out.println("Blastoise used Iron Defense");
	}
	
	public void secondAbility() {
		System.out.println("Blastoise used Hydro Pump");
	}
	
	public void thirdAbility() {
		System.out.println("Blastoise used Skull Bash, it's super effective!");
	}
	
	@Override
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}
	
}
