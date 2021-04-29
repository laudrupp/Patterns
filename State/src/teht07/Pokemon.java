package teht07;

public class Pokemon {
	
	private PokemonState state = new Charmander();
 
    public void previousState() {
        state.previous(this);
    }

	public void setState(PokemonState state) {
		this.state = state;
	}

	public void nextState() {
        state.next(this);
    }
 
    public void printStatus() {
        state.printStatus();
    }
    
    public void firstAbility() {
    	state.firstAbility();
    }
    
    public void secondAbility() {
    	state.secondAbility();
    }
    
    public void thirdAbility() {
    	state.thirdAbility();
    }

}
