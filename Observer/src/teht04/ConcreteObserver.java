package teht04;

import java.util.Observer;
import java.util.Observable;

public class ConcreteObserver implements Observer {
	
	private ConcreteObservable timer;

	
	public ConcreteObserver(ConcreteObservable co) {
		timer = co;
		timer.addObserver(this);
	}
	
	
	@Override
	public void update(Observable obs, Object o) {
		if(obs == timer) {
			draw();
		}
	}
	
	
	public void draw() {
		if (timer.getHour() < 10 && timer.getMin() < 10 && timer.getSec() < 10) {
			System.out.println("0"+timer.getHour()+":0"+timer.getMin()+":0"+timer.getSec());
		} else if (timer.getHour() < 10 && timer.getMin() < 10) {
			System.out.println("0"+timer.getHour()+":0"+timer.getMin()+":"+timer.getSec());
		} else if (timer.getHour() < 10) {
			System.out.println("0"+timer.getHour()+":"+timer.getMin()+":"+timer.getSec());
		} else if (timer.getMin() < 10 && timer.getSec() < 10) {
			System.out.println(timer.getHour()+":0"+timer.getMin()+":0"+timer.getSec());
		} else if (timer.getMin() < 10) {
			System.out.println(timer.getHour()+":0"+timer.getMin()+":"+timer.getSec());
		} else if (timer.getSec() < 10) {
			System.out.println(timer.getHour()+":"+timer.getMin()+":0"+timer.getSec());
		} else if (timer.getHour() < 10 && timer.getSec() < 10) {
			System.out.println("0"+timer.getHour()+":"+timer.getMin()+":0"+timer.getSec());
		} else {
			System.out.println(timer.getHour()+":"+timer.getMin()+":"+timer.getSec());
		}	
	}

}

