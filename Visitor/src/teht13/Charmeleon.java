package teht13;


public class Charmeleon extends Pokemon implements FirePokemonState, Visitable{
	
	@Override
	public void next(FirePokemon charmander) {
		charmander.setState(new Charizard());
		System.out.println("Charmeleon evolved into Charizard");
	}

	@Override
	public void previous(FirePokemon charmander) {
		charmander.setState(new Charmander());
		System.out.println("Charmeleon devolved into Charmander");
	}
	
	@Override
	public String printStatus() {
		return "Charmeleon";
	}
	
	public void firstAbility() {
		System.out.println("Charmeleon used Ember");
	}
	
	public void secondAbility() {
		System.out.println("Charmeleon used Fury Swipes");
	}
	
	public void thirdAbility() {
		System.out.println("Charmeleon used Dragon Rage");
	}
	
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
