package access;
import modifier.Parent;

public class Child extends Parent{
	void accessTest() {
		super.accessProtected(); //protected 키워드가 붙은 메서드도 이런식으로 접근이 가능하다.
		
		Parent p1 = new Parent();
		//p1.accessProtected(); 자식 클래스더라도, 객체로 접근하는것은 불가능하다.
	}
}
