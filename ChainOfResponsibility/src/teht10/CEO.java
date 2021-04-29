package teht10;

public class CEO implements Chain {
	
	private Chain nextInChain;

	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
	}
	
	public void evaluate(Numbers raise) {
		if (raise.getRaise() > 5) {
			double actualRaise = (raise.getRaise() / 100) + 1;
			System.out.println("I'm your Chief Executive Officer. With a raise of "+raise.getRaise()+"%, your new salary would be "+raise.getSalary()*actualRaise+"€");
		}
		else {
			System.out.println("You can't get a negative pay raise");
		}
	}
}
