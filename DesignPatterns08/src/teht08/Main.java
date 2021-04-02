package teht08;

public class Main {
	
	public static void main(String[] args) {
		
		int coin;
		FlipCoin newGame = new FlipCoin();
		coin = newGame.setCount();
		newGame.playOneGame(coin);
		
	}
}
