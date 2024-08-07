package super_ex;

public class Child extends Parent {
	//super : 부모 클래스
		public Child(int n) {
			//super(); 부모클래스의 생성자에 매개변수가 없으면 생략가능
			super(n); //부모생성자가 매개변수를 갖기 시작하면 생략할 수 없다.
			System.out.println("자식(Child)클래스");
		}//생성자
		@Override
		public int result() {
			//super.result() : parent클래스의 result()메서드 호출
			return super.result();
		}
}
