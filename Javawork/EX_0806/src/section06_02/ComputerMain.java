/*	오버 라이딩(Overriding)
	부모클래스를 상속받은 자식 클래스는 부모 클래스의 필드와 메서드를 가져와서 그대로 사용할 수 있습니다.
	하지만 필요하다면, 자식 클래스가 상속받은 메서드의 내용을 변경해서 사용할 수도 있다.
	이렇게 상속받은 메서드를 변경해서 다시 구현하는 것을 '오버라이딩(overriding)'이라고 한다.
	
	오버라이딩 규칙
	1. 부모클래스의 메서드명, 반환타입, 매개변수가 동일해아 한다.
	2. 부모클래스의 메서드보다 접근 제한 범위를 줄일수는 있으나, 넓힐 수는 없다.
	
	오버라이드와 오버로드의 차이
	오버라이드		오버로드
	재정의		중복정의
 */

package section06_02;

public class ComputerMain {

	public static void main(String[] args) {
		Samsong s = new Samsong();
		s.powerOn();
		s.powerOff();
		
		Computer c = new Computer();
		c.powerOn();
		c.powerOff();

	}

}
