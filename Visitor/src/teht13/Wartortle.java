package teht13;

public class Wartortle extends Pokemon implements WaterPokemonState, Visitable {

	@Override
	public void next(WaterPokemon squirtle) {
		squirtle.setState(new Blastoise());
		System.out.println("Wartortle evolved into Blastoise");
	}

	@Override
	public void previous(WaterPokemon squirtle) {
		squirtle.setState(new Squirtle());
		System.out.println("Wartortle devolved into Squirtle");
	}
	
	@Override
	public String printStatus() {
		return "Wartortle";
	}
	
	public void firstAbility() {
		System.out.println("Wartortle used Rain Dance");
	}
	
	public void secondAbility() {
		System.out.println("Wartortle used Aqua Tail");
	}
	
	public void thirdAbility() {
		System.out.println("Wartortle used Shell Smash");
	}
	
	@Override
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}
	
}
