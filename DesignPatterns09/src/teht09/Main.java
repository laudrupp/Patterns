package teht09;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Factory factory = new Factory();
		String printString = "";
		List<String> printList = new ArrayList<String>();
		
		printList.add("In ");
		printList.add("Absentia ");
		printList.add("Lucis, ");
		printList.add("Tenebrae ");
		printList.add("Vincunt");
		
		factory.setStrategy(new ListIterate());
		printString = factory.listToString(printList);
		System.out.println(printString);
		System.out.println("- - - - -");
		factory.setStrategy(new ListArray());
		printString = factory.listToString(printList);
		System.out.println(printString);
		System.out.println("- - - - -");
		factory.setStrategy(new ListGet());
		printString = factory.listToString(printList);
		System.out.println(printString);
		
	}
	
}
