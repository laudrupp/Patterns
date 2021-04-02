package teht07;

public class Charizard implements PokemonState {
	
	@Override
	public void next(Pokemon charmander) {
		System.out.println("Charizard can't evolve!");
	}

	@Override
	public void previous(Pokemon charmander) {
		charmander.setState(new Charmeleon());
		System.out.println("Charizard devolved into Charmeleon");
	}
	
	@Override
	public void printStatus() {
		System.out.println("Charizard!!!");
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
}
	
