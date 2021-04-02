package teht20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PartA implements Runnable {
	
	static Collection<String> songs = new ArrayList<String>();
	static Iterator<String> i1 = songs.iterator();
	static Iterator<String> i2 = songs.iterator();
	
	public static void main(String[] args) {
		
		songs.add("Funeral Mist - Shedding Skin");
		songs.add("Vektor - Pteropticon");
		songs.add("Morbid Saint - Damien");
		songs.add("Cryptopsy - Graves of the Fathers");
		songs.add("Sodom - Nuclear Winter");
		
		Thread t1 = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	try {
		    		while (i1.hasNext()) {
				        System.out.println(i1.next());
				    }
		    	} catch(Exception e) {
		    		System.out.println("Error");
		    	}
		    }
		});
		
		Thread t2 = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	try {
		    		while (i2.hasNext()) {
				        System.out.println(i2.next());
				    }
		    	} catch(Exception e) {
		    		System.out.println("Error");
		    	}
		    }
		});
		
		t1.start();
		t2.start();
	}
	
	public void run() {}
}
