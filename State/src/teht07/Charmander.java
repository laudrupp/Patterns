package teht07;

public class Charmander implements PokemonState {
	
	@Override
	public void next(Pokemon charmander) {
		charmander.setState(new Charmeleon());
		System.out.println("Charmander evolved into Charmeleon");
	}

	@Override
	public void previous(Pokemon charmander) {
		System.out.println("Charmander can't devolve!");
	}
	
	@Override
	public void printStatus() {
		System.out.println("Charmander!");
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
	
}
