package teht18;

public class Main {
	
	public static void main(String[] args) {
		
		Clockwork clock = new Clockwork(12, 59, 59);
		Clockwork clockCopy = (Clockwork)clock.makeCopy();		

		System.out.println("Original clock: ");
		clock.getTime();
		System.out.println("Cloned clock: ");
		clockCopy.getTime();
		System.out.println("- - - - -\n");
		
		//sekunti lisää vain alkuperäiseen kelloon
		clock.tick();
		System.out.println("Original clock: ");
		clock.getTime();
		System.out.println("Cloned clock: ");
		clockCopy.getTime();
		System.out.println("- - - - -\n");
		
		//sekunti lisää vain kloonikelloon
		System.out.println("Original clock: ");
		clock.getTime();
		clockCopy.tick();
		System.out.println("Cloned clock: ");
		clockCopy.getTime();
		System.out.println("- - - - -\n");
		
		//kellojen hashcodet
		System.out.println("Original clock hashcode: "+System.identityHashCode(clock)+"\n");
		System.out.println("Cloned clock hashcode: "+System.identityHashCode(clockCopy));
	}
	
	
}
