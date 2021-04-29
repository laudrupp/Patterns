package teht22;

public class ScreenButton {
	
	Command command;
	
	public ScreenButton(Command cmd) {
		command = cmd;
	}

	
	public void push() {
		command.execute();
	}
}
