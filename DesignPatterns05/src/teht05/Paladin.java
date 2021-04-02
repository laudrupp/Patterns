package teht05;


public class Paladin implements HeroClasses {
	
	private Paladin() {}
	
	private static class Helper {
		private static final Paladin INSTANCE = new Paladin();
	}
	
	public synchronized static Paladin getInstance() {
		return Helper.INSTANCE;
	}

}
