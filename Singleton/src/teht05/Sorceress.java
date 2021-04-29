package teht05;
;

public class Sorceress implements HeroClasses {
	
	private Sorceress() {}
	
	private static class Helper {
		private static final Sorceress INSTANCE = new Sorceress();
	}
	
	public synchronized static Sorceress getInstance() {
		return Helper.INSTANCE;
	}
	
}
