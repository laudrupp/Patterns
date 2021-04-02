package teht10;

public class ImmediateManager implements Chain {
	
	private Chain nextInChain;
	
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;	
	}
	
	public void evaluate(Numbers raise) {
		if (raise.getRaise() > 0 && raise.getRaise() <= 2) {
			double actualRaise = (raise.getRaise() / 100) + 1;
			System.out.println("I'm your Immediate Manager. With a raise of "+raise.getRaise()+"%, your new salary would be "+raise.getSalary()*actualRaise+"€");
		} else if (raise.getRaise() <= 0) {
			System.out.println("You can't get a negative pay raise");
		} else {
			System.out.println("I'm only allowed to handle salary raises up to 2%, we'll have to call the Department manager");
			nextInChain.evaluate(raise);
		}
	}
}
