package teht05;

public class Necromancer implements HeroClasses {

	private Necromancer() {}
	
	private static class Helper {
		private static final Necromancer INSTANCE = new Necromancer();
	}
	
	public synchronized static Necromancer getInstance() {
		return Helper.INSTANCE;
	}
	
}
