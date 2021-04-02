package teht22;

public class Main {

	public static void main(String[] args) {
		
		Screen screen = new Screen();
		Command screenUp = new ScreenUpCommand(screen);
		Command screenDown = new ScreenDownCommand(screen);
		ScreenButton button1 = new ScreenButton(screenUp);
		ScreenButton button2 = new ScreenButton(screenDown);
		
		button1.push();
		button2.push();
		
	}
	
	
}
