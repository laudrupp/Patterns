package teht20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PartB implements Runnable {

	static Collection<String> songs = new ArrayList<String>();
	static Iterator<String> i1 = songs.iterator();
	
	public static void main(String[] args) {
		
		songs.add("Funeral Mist - Shedding Skin");
		songs.add("Vektor - Pteropticon");
		songs.add("Morbid Saint - Damien");
		songs.add("Cryptopsy - Graves of the Fathers");
		songs.add("Sodom - Nuclear Winter");
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		
		t1.start();
		t2.start();
	}

	public void run() {
			synchronized(songs) {
				try {
					System.out.println(i1.next());
					songs.notifyAll();
					songs.wait();
		    	} catch(Exception e) {
		    		System.out.println("Error");
		    	}
			}
		
	}
}
