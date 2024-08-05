package section05;

public class student {
	// 정적 멤버 선언
	static String schname = "코리아 고등학교";
	
	String studentName;
	
	// 인스턴스 멤버
	static void gotoschoo() {
		System.out.println("학교감");
	}
	// 인스턴스 메서드
	void hello() {
		System.out.println("안녕하세요, 제 이름은 " + studentName + "입니다.");
	}
}
