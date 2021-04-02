package teht11;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
	
		Originator originator = new Originator();
		
		Caretaker caretaker1 = new Caretaker(originator);
		Caretaker caretaker2 = new Caretaker(originator);
		Caretaker caretaker3 = new Caretaker(originator);
		Caretaker caretaker4 = new Caretaker(originator);
		Caretaker caretaker5 = new Caretaker(originator);
		
		caretaker1.run();
		Thread.sleep(1200);
		System.out.println("- - - - -");
		caretaker2.run();
		Thread.sleep(1200);
		System.out.println("- - - - -");
		caretaker3.run();
		Thread.sleep(1200);
		System.out.println("- - - - -");
		caretaker4.run();
		Thread.sleep(1200);
		System.out.println("- - - - -");
		caretaker5.run();
		
	}	
}
