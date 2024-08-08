package class_casting_03;

public class DeskCalendar extends Calendar{
	String color;
	int months;
	public DeskCalendar(String color, int months) {
		super(color,months);
	}
	
	@Override
	public void info() {
		System.out.println(color+"달력을 벽에 걸기 위해 고리가 추가로 필요합니다.");
	}
	
	public void onTheDesk() {
		System.out.println(color+" 달력을 책상에 세울 수 있습니다.");
	}
}
