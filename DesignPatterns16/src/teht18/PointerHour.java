package teht18;

public class PointerHour implements Clock {
	
	
	private int hour;
	
	
	public PointerHour(int hour) {
		this.hour = hour;
	}
	
	
	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		this.hour = hour;
	}
	
	
	public void tick() {
		if(getHour() >= 23) {
			setHour(0);
		} else {
			setHour(this.hour+1);
		}
	}


	@Override
	public Clock makeCopy() {
		PointerHour hourObject = null;
		try {
			hourObject = (PointerHour) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return hourObject;
	}
}
