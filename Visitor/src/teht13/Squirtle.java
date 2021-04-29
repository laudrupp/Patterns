package teht13;

public class Squirtle extends Pokemon implements WaterPokemonState, Visitable {

	@Override
	public void next(WaterPokemon squirtle) {
		squirtle.setState(new Wartortle());
		System.out.println("Squirtle evolved into Wartortle");
	}

	@Override
	public void previous(WaterPokemon squirtle) {
		System.out.println("Squirtle can't devolve!");
	}
	
	@Override
	public String printStatus() {
		return "Squirtle";
	}
	
	public void firstAbility() {
		System.out.println("Squirtle used Tackle");
	}
	
	public void secondAbility() {
		System.out.println("Squirtle used Tail Whip");
	}
	
	public void thirdAbility() {
		System.out.println("Squirtle used Water Gun");
	}

	@Override
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}
	
}
