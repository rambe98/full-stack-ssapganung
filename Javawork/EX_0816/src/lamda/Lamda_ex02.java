/*	컬렉션 프레임워크와 함수형 인터페이스
	컬렉션 프레임워크의 인터페이스에 다수의 디폴트 메서드가 추가 되었고 
	그 중 일부는 함수형 인터페이스를 사용한다.
	ArrayList에 forEach()메서드가 있고 Consumer 라는 매개변수를 받는다 
	자바 공식문서에서 검색해보면 FunctionalInterface라는걸 알 수 있다.
	때문에 람다식으로 표현할 수 있다.
	forEach()메서드의 구성
	List의 forEach()메서드는 향상된 for문이 작동하고 있다.
	
	장점
	- 인터페이스에 기본 구현을 제공함으로써, 해당 인터페이스를 구현하는 클래스에서 모든 메서드를
	제정의할 필요가 없게 됐다.
	- default메서드를 통해 인터페이스에서 다중상속과 유사한 기능을 제공할 수 있게 됐다.
	
 */

package lamda;

interface Interface{
	abstract void methodA();
	abstract void methodB();
	abstract void methodC();
	
	//1.메서드 앞에 default예약어를 붙인다.
	//2.body(구현부)가 있어야한다.
	default void defaultMethodA() {
		System.out.println("디폴트 메서드 a");
	}
}
class interImpl implements Interface{
	// 안쓴다고 해도 일단 인터페이스의 모든 추상메서드를 오버라이딩 해야한다.
	@Override
	public void methodA() {		
		System.out.println("오버라이딩된 메서든 a");
	}
	@Override
	public void methodB() {
		// TODO Auto-generated method stub
	}
	@Override
	public void methodC() {
		// TODO Auto-generated method stub
	}
	
}

public class Lamda_ex02 {
	public static void main(String[] args) {
		Interface inter = new interImpl();
		inter.methodA();
		inter.defaultMethodA();
	}
}
