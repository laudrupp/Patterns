package teht10;

public class DepartmentManager implements Chain {
	
	private Chain nextInChain;
	
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;	
	}
	
	public void evaluate(Numbers raise) {
		if (raise.getRaise() > 2 && raise.getRaise() <= 5) {
			double actualRaise = (raise.getRaise() / 100) + 1;
			System.out.println("I'm your Department Manager. With a raise of "+raise.getRaise()+"%, your new salary would be "+raise.getSalary()*actualRaise+"€");
		}
		else {
			System.out.println("I'm only allowed to handle salary raises up to 5%, we'll have to call the CEO");
			nextInChain.evaluate(raise);
		}
	}
}
