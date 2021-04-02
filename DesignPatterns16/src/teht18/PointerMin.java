package teht18;

public class PointerMin implements Clock {

	
	private int minute;
	
	
	public PointerMin(int min) {
		minute = min;
	}
	
	
	public int getMinute() {
		return minute;
	}


	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	
	public void tick() {
		if(getMinute() >= 59) {
			setMinute(0);
		} else {
			setMinute(this.minute+1);
		}
		
	}

	
	@Override
	public Clock makeCopy() {
		PointerMin minObject = null;
		try {
			minObject = (PointerMin) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return minObject;
	}

}
