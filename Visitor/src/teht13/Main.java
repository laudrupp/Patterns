package teht13;

public class Main {
	
	public static void main(String[] args) {
		
		StatsVisitor visitor = new StatsVisitor();
		FirePokemon poke1 = new FirePokemon();
		WaterPokemon poke2 = new WaterPokemon();
		
		System.out.println("You roster is: "+poke1.getState().printStatus()+" and "+poke2.getState().printStatus()+"\n");
		System.out.println(poke1.getState().printStatus()+" gains "+poke1.accept(visitor)+" bonus points and "+poke2.getState().printStatus()+" gains "+poke2.accept(visitor)+" bonus points after each battle.\n");
		poke1.nextState();
		System.out.println("\n");
		System.out.println(poke1.getState().printStatus()+" gains "+poke1.accept(visitor)+" bonus points and "+poke2.getState().printStatus()+" gains "+poke2.accept(visitor)+" bonus points after each battle.\n");
		poke1.nextState();
		System.out.println("\n");
		System.out.println(poke1.getState().printStatus()+" gains "+poke1.accept(visitor)+" bonus points and "+poke2.getState().printStatus()+" gains "+poke2.accept(visitor)+" bonus points after each battle.\n");
		poke2.nextState();
		System.out.println("\n");
		System.out.println(poke1.getState().printStatus()+" gains "+poke1.accept(visitor)+" bonus points and "+poke2.getState().printStatus()+" gains "+poke2.accept(visitor)+" bonus points after each battle.\n");
		poke2.nextState();
		System.out.println("\n");
		System.out.println(poke1.getState().printStatus()+" gains "+poke1.accept(visitor)+" bonus points and "+poke2.getState().printStatus()+" gains "+poke2.accept(visitor)+" bonus points after each battle.\n");
	}
}
