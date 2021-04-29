package teht13;


public class Charizard extends Pokemon implements FirePokemonState, Visitable {

	@Override
	public void next(FirePokemon charmander) {
		System.out.println("Charizard can't evolve!");
	}

	@Override
	public void previous(FirePokemon charmander) {
		charmander.setState(new Charmeleon());
		System.out.println("Charizard devolved into Charmeleon");
	}
	
	@Override
	public String printStatus() {
		return "Charizard";
	}
	
	public void firstAbility() {
		System.out.println("Charizard used Flamethrower");
	}
	
	public void secondAbility() {
		System.out.println("Charizard used Air Slash");
	}
	
	public void thirdAbility() {
		System.out.println("Charizard used Flare Blitz, it's super effective!");
	}

	@Override
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}
	
}
