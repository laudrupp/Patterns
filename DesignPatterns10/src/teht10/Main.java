package teht10;

public class Main {

	public static void main(String[] args) {
		
		Chain manager = new ImmediateManager();
		Chain deptmanager = new DepartmentManager();
		Chain ceo = new CEO();
		
		manager.setNextChain(deptmanager);
		deptmanager.setNextChain(ceo);
		
		Numbers salaryRaise = new Numbers(5000, 1);
		manager.evaluate(salaryRaise);
		System.out.println("- - - - -");
		Numbers salaryRaise2 = new Numbers(5000, 4);
		manager.evaluate(salaryRaise2);
		System.out.println("- - - - -");
		Numbers salaryRaise3 = new Numbers(5000, 500);
		manager.evaluate(salaryRaise3);
		System.out.println("- - - - -");
		Numbers salaryRaise4 = new Numbers(5000, -100);
		manager.evaluate(salaryRaise4);
	}
	
}
