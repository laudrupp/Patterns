package teht04;

public class Main {
	
	public static void main(String[] args) {
		
		ConcreteObservable concreteSubject = new ConcreteObservable();
		ConcreteObserver concreteObserver = new ConcreteObserver(concreteSubject);
		Thread thread = new Thread(concreteSubject);
		concreteSubject.setClock(23, 59, 45);
		thread.start();
		concreteSubject.terminate();
		
	}
}
