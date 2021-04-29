package teht13;


public class StatsVisitor implements Visitor {
	
	int j;
	
	public int visit(Pokemon pokemon) {
		if(pokemon instanceof FirePokemon) {
			if(((FirePokemon) pokemon).getState().printStatus() == "Charmander") {
				j = 200;
			} else if (((FirePokemon) pokemon).getState().printStatus() == "Charmeleon") {
				j = 250;
			} else if (((FirePokemon) pokemon).getState().printStatus() == "Charizard") {
				j = 300;
			}
		} else if (pokemon instanceof WaterPokemon) {
			if(((WaterPokemon) pokemon).getState().printStatus() == "Squirtle") {
				j = 215;
			} else if (((WaterPokemon) pokemon).getState().printStatus() == "Wartortle") {
				j = 260;
			} else if (((WaterPokemon) pokemon).getState().printStatus() == "Blastoise") {
				j = 312;
			}
		}
		return j;
	}
}
