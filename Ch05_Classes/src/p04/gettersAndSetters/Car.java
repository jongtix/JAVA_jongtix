package p04.gettersAndSetters;
/**
 * getters and setters 메소드
 * */
public class Car {
	// 필드
	private int speed;
	private boolean stop;
	
	// shift + alt + s -> r
	protected int getSpeed() {
		return speed;
	}
	protected void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}
	protected boolean isStop() {
		return stop;
	}
	protected void setStop(boolean stop) {
		this.speed = 0;
		this.stop = stop;
	}	
}
