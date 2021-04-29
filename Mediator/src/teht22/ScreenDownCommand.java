package teht22;

public class ScreenDownCommand implements Command {

	private Screen screen;
	
	public ScreenDownCommand(Screen screen) {
		this.screen = screen;
	}
	
	@Override
	public void execute() {
		screen.lowerDown();
	}
	
}
