package teht11;

import java.util.Random;

public class Originator {
	
	
	Random rndm = new Random();
	
	
	public synchronized int drawNumber() {
		int randomNumber = rndm.nextInt(10) + 1;
		System.out.println("Number drawn: "+randomNumber);
		return randomNumber;
	}
	
	
	public synchronized boolean guessNumber(int guess, Object obj) {
		Memento memento = (Memento) obj;
		if(memento.getState() == guess) {
			System.out.println("Correct!");
			return true;
		} else {
			System.out.println("Guess again.");
			return false;
		}
	}
	
	
	public synchronized Object joinGame() {
		return new Memento(drawNumber());
	}
	
	
	
	
private class Memento {
		
	
		private int number;

		
		public Memento(int number) {
			this.number = number;
		}
		
		
		public int getState() {
			return number;
		}
	}
}
