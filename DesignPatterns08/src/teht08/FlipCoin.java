package teht08;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin extends Game {
	
	private int playersCount;
	private int answer;
	private int min, max;
	private int winner = 0;
	private int guess = 0;
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	public void initializeGame() {
		System.out.println("Welcome to a game of Flip a Coin!");
		System.out.println("You have to guess if the coin lands heads or tails.");
		System.out.println("Enter 1 for heads, enter 2 for tails.");
		System.out.println("- - - - - - - - - -");
	}
	
	public void makePlay(int player) {
		System.out.println("Lets flip a coin. What's your guess?: ");
		answer = sc.nextInt();
		guess++;
		while (answer > 2 | answer < 1) {
			System.out.println("Enter 0 for tails, enter 1 for tails: ");
			answer = sc.nextInt();
		}
		if(guess > 0) {
			endOfGame();
		}
	}
	
	public boolean endOfGame() {
		boolean y = false;
		if(answer == playersCount && guess == 1) {
			winner = 1;
			y = true;
		} else if(answer != playersCount && guess == 1) {
			winner = 2;
			y = true;
		}
		return y;
	}
	
	public void printWinner() {
		if(winner == 1 && answer == 1) {
			System.out.println("Heads is correct! You won!");
		} else if(winner == 1 && answer == 2) {
			System.out.println("Tails is correct! You won!");
		} else if(winner == 2 && answer == 2) {
			System.out.println("Tails is wrong! You lost!");
		} else if(winner == 2 && answer == 1) {
			System.out.println("Heads is wrong! You lost!");
		}
	}
	
	public int setCount() {
		min = 1;
		max = 2;
		int rndm = rand.nextInt((max - min) + 1) + min;
		playersCount = rndm;
		return playersCount;
	}
}
