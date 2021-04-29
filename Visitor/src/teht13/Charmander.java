package teht13;


public class Charmander extends Pokemon implements FirePokemonState, Visitable {

	@Override
	public void next(FirePokemon charmander) {
		charmander.setState(new Charmeleon());
		System.out.println("Charmander evolved into Charmeleon");
	}

	@Override
	public void previous(FirePokemon charmander) {
		System.out.println("Charmander can't devolve!");
	}
	
	@Override
	public String printStatus() {
		return "Charmander";
	}
	
	public void firstAbility() {
		System.out.println("Charmander used Scratch");
	}
	
	public void secondAbility() {
		System.out.println("Charmander used Growl");
	}
	
	public void thirdAbility() {
		System.out.println("Charmander used Smokescreen");
	}
	
	@Override
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}
	
}
