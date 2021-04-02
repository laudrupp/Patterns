package teht18;

public class Clockwork implements Clock {
	
	
	PointerSec secObj;
	PointerMin minObj;
	PointerHour hourObj;
	
	
	public Clockwork(int hour, int min, int sec) {
		hourObj = new PointerHour(hour);
		minObj = new PointerMin(min);
		secObj = new PointerSec(sec);
	}
	
	
	public void tick() {
		if(secObj.getSecond() < 59) {
			secObj.tick();
		}else if(secObj.getSecond() == 59 && minObj.getMinute() < 59) {
			minObj.tick();
			secObj.tick();
		} else if (minObj.getMinute() == 59 && secObj.getSecond() == 59) {
			hourObj.tick();
			minObj.tick();
			secObj.tick();
		}
	}
	

	public void getTime() {
		System.out.println(hourObj.getHour()+":"+minObj.getMinute()+":"+secObj.getSecond()+"\n");
	}
	
	
	@Override
	public Clock makeCopy() {
		Clockwork clockObj = null;
		try {
			clockObj = (Clockwork) super.clone();
			clockObj.hourObj = (PointerHour) this.hourObj.makeCopy();
			clockObj.minObj = (PointerMin) this.minObj.makeCopy();
			clockObj.secObj = (PointerSec) this.secObj.makeCopy();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clockObj;
	}
}
