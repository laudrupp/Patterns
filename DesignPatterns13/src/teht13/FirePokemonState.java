package teht13;

public interface FirePokemonState {
	
	void next(FirePokemon pokemon);
	void previous(FirePokemon pokemon);
	String printStatus();
	void firstAbility();
	void secondAbility();
	void thirdAbility();

}
