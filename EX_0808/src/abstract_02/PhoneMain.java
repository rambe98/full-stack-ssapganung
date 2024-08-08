/*	추상클래스와 추상 메서드의 용도
	- 자식 클래스 간의 공통적인 필드와 메서드 이름을 통일할 수 있다.
	- 반드시 구현해야 하는 메서드를 선언함으로써 공통 규격을 제공한다.
	
	결과적으로 자식 클래스들의 규격과 내용을 통일하기 위함이며, 
	이는 곧 객체 지향 프로그래밍의 다형성을 구현하기 위한 탄탄한 기반이 된다.
 */



package abstract_02;

public class PhoneMain {
	public static void main(String[] args) {
		PineapplePhone pp = new PineapplePhone();
		pp.powerOn();
		pp.powerOff();
		
		System.out.println();
		
		ThreeStarPhone tp = new ThreeStarPhone();
		
		tp.powerOn();
		tp.powerOff();
	}
}
