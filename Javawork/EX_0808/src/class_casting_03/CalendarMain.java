package class_casting_03;

public class CalendarMain {

	public static void main(String[] args) {
		DeskCalendar dc = new DeskCalendar("보라색", 6);
		dc.info();
		dc.hanging();
		dc.onTheDesk();//자식클래스에만 있는 메서드
		
		System.out.println();
		
		Calendar c = new DeskCalendar("검은색", 12);
		c.info();//부모타입으로 변환해도 오버라이딩된 메서드가 호출된다.
		c.hanging(); //오버라이드된 메서드가 호출된다.
		//c.onTheDesk(); 자식클래스에 선언된 메서드는 사용 불가
		
		// 부모타입으로 변환한 자식객체는 더이상 자식 클래스만의 멤버나 메서드를 호출 할 수 없다.
	}

}
