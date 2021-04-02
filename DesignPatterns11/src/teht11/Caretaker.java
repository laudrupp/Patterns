package teht11;

import java.util.Random;

public class Caretaker implements Runnable {
	
	
	private Originator originator;
	private Object obj;
	Random rndm = new Random();
	boolean state = false;
	
	
	public Caretaker(Originator originator) {
		this.originator = originator;
	}
	
	
	public synchronized boolean guessNumber() {
		int randomNumber = rndm.nextInt(10) + 1;
		System.out.println("Player's guess: "+randomNumber);
		return originator.guessNumber(randomNumber, obj);
	}
	
	
	public synchronized void joinGame() {
		this.obj = originator.joinGame();
	}
	
	
	public void run() {
		joinGame();
		while(!state) {
			state = guessNumber();
		}
	} 
}
