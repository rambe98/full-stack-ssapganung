package section05_01;

public class Jogger {
	//2개 이상의 메서드 선언하기
	//메서드는 같은 클래스에 있는 필드를 사용할 수 있다.
	//하나의 클래스에 2개 이상의 메서드를 사용하는 것 역시 가능하다.
	String name; //조거의 이름
	
	void run() {
		System.out.println("run run run");
	}
	void sayName() {
		System.out.println("제 이름은 : " + name + "입니다.");
	}
}
