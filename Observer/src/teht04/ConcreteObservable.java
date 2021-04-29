package teht04;

import java.util.Observable;
import java.util.Scanner;

public class ConcreteObservable extends Observable implements Runnable {
	
	
	private int hour, min, sec;
	
	void tick() {
		if(sec < 59) {
			sec += 1;
		} else if (min < 59) {
			min += 1;
			sec = 0;
		} else if (hour < 23) {
			hour += 1;
			min = 0;
			sec = 0;
		} else if (hour == 23 && min == 59 && sec == 59) {
			sec = 0;
			min = 0;
			hour = 0;
		}
		setChanged();
		notifyObservers();
	}
	
	
	public void run() {
		final long interval = 1000;
			while(true) {
				try {
					Thread.sleep(interval);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				tick();
			}
	}
	
	public void terminate() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.equals("x")) {
			System.exit(0);
		}
	}
	
	
	public void setClock(int hour, int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	
	public int getHour() {
		return hour;
	}
	
	
	public int getMin() {
		return min;
	}
	
	
	public int getSec() {
		return sec;
	}
}

