/*	인스턴스 클래스
	인스턴스 클래스는 외부 클래스 내부에서 생성하고, 선언되어 사용하는 클래스를 의미한다.
	인스턴스 변수(필드)와 같은 위치에 선언하며, 외부 클래스의 인스턴스 멤버처럼 다루어진다.
	주로 외부클래스의 멤버들과 관련된 작업에 사용될 목적으로 선언된다.
	예시)
	public class Outer{
		private String name; //필드

		//인스턴스 클래스
		public class Inner{
			private String name;
		}
	}
	내부 클래스도 외부 클래스 안에 생성되는 것 외에는 별도의 클래스이기 때문에, 
	파일이 컴파일되면 별도로 생성된다.
	
	인스턴스 클래스의 객체화
	인스턴스 클래스는 기본적인 내부 클래스이다.
	외부 클래스 안에 생성되기 때문에, 클래스를 사용하려면 
	외부 클래스객체가 생성된 상태에서 객체 생성을 할 수 있다.
	
	Outer out = new Outer(); //외부 클래스 객체 생성
	Outer.Inner in = Outer.new Inner(); //외부 클래스를 이용해 내부 클래스 객체 생성
 */

package outerInner;

class Calculator{
	private int val1;
	private int val2;
	
	//객체를 만들 때 1번밖에 쓸 수가 없다.
	public Calculator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	// 다시 다른 값을 대입하고 싶다면 setter를 만들어주는 것이 좋다.
	
	public class Calc{
		public int add() {
			return val1 + val2;
		}
	}
}

public class Instanceclass_ex {
	public static void main(String[] args) {
		Calculator cal = new Calculator(10, 11);
		Calculator.Calc c = cal.new Calc();
		System.out.println("합 : " + c.add());
	}
}
