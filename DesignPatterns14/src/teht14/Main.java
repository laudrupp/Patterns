package teht14;

public class Main {
	
	public static void main(String[] args) {
		
		Hesburger[] list;
		
		HamburgerBuilder mc = new McDonaldsBuilder();
		HamburgerBuilder hs = new HesburgerBuilder();
		
		Director director = new Director(mc);
		director.makeHamburger();
		System.out.println("Here's a String which represents a McDonald's burger:\n");
		System.out.println(director.getMcDonalds()+"\n\n- - - - - - - - - - - - - - - - - - - -\n");
		
		director.setBuilder(hs);
		System.out.println("Hesburger burger:\n");
		director.makeHamburger();
		list = director.getHesburger();
		System.out.println("\nHere's a list of objects which represent a burger from Hesburger:\n");
		for(int i = 0; i < 5; i++) {
			System.out.println(list[i].toString());
		}
	}
}
