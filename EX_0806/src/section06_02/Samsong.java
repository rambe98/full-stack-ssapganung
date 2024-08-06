package section06_02;

public class Samsong extends Computer{
	@Override
	/* @
	자바에서 @키워드를 어노테이션이라고 부른다.
	주석과 마찬가지고 코드를 실행하는데 직접적인 형향을 미치지는 않는다.
	자동완성으로 오버라이딩을 구현하면, 자동으로 @Override가 메서드 상단에 추가된다.
	생략해도 괜찮지만, 컴파일러에게 오버라이딩된 메서드라고 
	한번 더 짚어줌으로써 오타가 났을 때 오류를 발생시켜주기 때문에 실수를 줄일 수 있다.
	 */
	void powerOn() {
		super.powerOn();
		// super참조 변수를 사용해 부모 클래스의 멤버에 접근할 수 있다.
		// this와 마찬가지로 super 참조 변수를 사용할 수 있는 대상도 인스턴스 메서드뿐이며, 
		// 클래스 메서드에서는 사용할 수 없다.
		System.out.println("아이 러브 삼송");
	}
}
