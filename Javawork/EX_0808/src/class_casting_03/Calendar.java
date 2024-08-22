package class_casting_03;

public class Calendar {
	String color;
	int months;
	
	public Calendar(String color, int months) {
		this.color = color;
		this.months = months;
	}
	
	public void info() {
		System.out.println(color + " 달력은 " + months + "월까지 있습니다.");
	}
	
	public void hanging() {
		System.out.println(color +"달력을 벽에 걸 수 있습니다.");
	}
}
