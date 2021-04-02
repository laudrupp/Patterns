package teht13;

public class WaterPokemon extends Pokemon {

	private WaterPokemonState state = new Squirtle();
	 
    public void previousState() {
        state.previous(this);
    }

	public void setState(WaterPokemonState state) {
		this.state = state;
	}
	
	public WaterPokemonState getState() {
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
