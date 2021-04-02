package teht07;

public class Charmeleon implements PokemonState {

	@Override
	public void next(Pokemon charmander) {
		charmander.setState(new Charizard());
		System.out.println("Charmeleon evolved into Charizard");
	}

	@Override
	public void previous(Pokemon charmander) {
		charmander.setState(new Charmander());
		System.out.println("Charmeleon devolved into Charmander");
	}
	
	@Override
	public void printStatus() {
		System.out.println("Charmeleon!!");
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
	
}
