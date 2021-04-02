package teht18;

public class PointerSec implements Clock {
	
	
	private int second;
	
	
	public PointerSec(int sec) {
		second = sec;
	}
	
	
	public int getSecond() {
		return second;
	}

	
	public void setSecond(int second) {
		this.second = second;
		
	}
	
	
	public void tick() {
		if(getSecond() >= 59) {
			setSecond(0);
		} else {
			setSecond(this.second+1);
		}
		
	}
	

	@Override
	public Clock makeCopy() {
		PointerSec secObject = null;
		try {
			secObject = (PointerSec) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return secObject;
	}
}
