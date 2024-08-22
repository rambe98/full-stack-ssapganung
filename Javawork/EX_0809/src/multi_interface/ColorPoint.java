package multi_interface;

public class ColorPoint extends Point{
	String str;
	public ColorPoint(int x, int y,String str) {
		super(x, y);
		this.str = str;
	}
	public void setXY(int x, int y) {
		move(x,y);
	}
	public void setColor(String str) {
		this.str = str;
	}
	
	public String toString() {
		return str+"색의 ("+ getx()+", " + gety() + ")의 점";
	}

}
