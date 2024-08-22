package section06_01;

public class Car {
	//필드(인스턴스 변수, 객체 변수, 멤버 변수)
	private int speed;
	private boolean stop;
	
	public void setSpeed(int s) {
		if(s < 0) {
			this.speed = 0;
			return;
		} else {
			speed = s;
		}
		
	}
	public int getSpeed() {
		return speed;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	public boolean isStop() {
		return stop;
	}
}