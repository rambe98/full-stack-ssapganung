/*	오버로딩과 오버라이딩
  	객체 지향 프로그래밍에서 다형성을 얘기할 때 빼놓을 수 없는 것이 
  	바로 오버로딩과 오버라이딩이다.
	비슷한 기능을 하고 중복되는 구현이 필요하지만 
	우리는 오버로딩과 오버라이딩을 적절히 사용할 수 있다면, 
	중복이 없는 최소한의 코드로 원하는 기능을 모두 구현해낼 수 있다.
	
	오버로딩
	자바는 매개변수의 자료형/개수/순서를 기반으로 
	메서드를 구별하므로 하나의 클래스 안에서 같은 이름의 메서드를 여러 개 구현하고 
	필요에 따라 메서드를 선택해 사용할 수 있다.
	
	오버라이딩
	부모 클래스에게 상속받은 메서드를 재정의하여 자식 클래스용 메서드를 구현하고 
	자식 객체를 통해 메서드를 호출하면 오버라이딩된 메서드가 호출된다.
	
	간단히 정리하자면 오버로딩은 새로운 메서드를 정의하는 것이며, 
	오버라이딩은 상속받은 기존의 메서드를 재정의하는 것을 말한다.
	
 */

package instancdof;

class Parent{
	public void display() {
		System.out.println("부모 클래스의 display()메서드이다.");
	}
}
class Child extends Parent{
	
	//오버라이딩 된 display()메서드
	@Override
	public void display() {
		System.out.println("자식 클래스의 display() 메서드이다.");
	}
	
	//오버로딩된 display()메서드
	public void display(String str) {
		System.out.println(str);
	}
}
public class InheritanceMethodTest {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
		ch.display("오버로딩된 display()메서드입니다.");
	}
}
