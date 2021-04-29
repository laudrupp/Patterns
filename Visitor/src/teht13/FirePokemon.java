package teht13;


public class FirePokemon extends Pokemon{
	
	private FirePokemonState state = new Charmander();
	 
    public void previousState() {
        state.previous(this);
    }

	public void setState(FirePokemonState state) {
		this.state = state;
	}
	
	public FirePokemonState getState() {
		return state;
	}

	public void nextState() {
        state.next(this);
    }
	
    public String printStatus() {
        return state.printStatus();
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
    
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
