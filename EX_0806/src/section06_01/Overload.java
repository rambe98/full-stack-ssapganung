package section06_01;

public class Overload {
	public void result() {
		System.out.println("인자가 없는 메서드");
		//return; 강제로 끝내고 싶을 때는 return을 써도 됨.
		// 대신 void 일때는 return에 아무 값도 실을 수 없음 사실 void일때는 return을 쓰는 경우도 거의 없고 쓸 필요도 없음
	}

	//메서드 이름이 같기 때문에 오류가 나는게 당연하다.
	public void result( int n ) {
		System.out.println("정수를 인자로 받는 메서드");
	}
	public void result( char n) {
		System.out.println("문자를 인자로 받는 메서드");
	}
	public void result( String s, int n) {
		System.out.println("문자열, 정수를 인자로 받는 메서드");
	}

	public void result( int n, String s) {
		System.out.println("정수, 문자열을 인자로 받는 메서드");
	}
}
