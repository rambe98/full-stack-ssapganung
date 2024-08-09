/*	정적 내부 클래스(static class)
  	클래스 안에 정적 변수를 선언할 수 있는 것처럼 클래스도 정적 클래스를 만들 수 있다.
	필드(멤버)와 마찬가지로 static키워드를 사용해 클래스를 선언한 후 정적 내부 클래스를 생성한다.
	주로 외부 클래스의 static메서드에서 사용될 목적으로 만든다.
	예)
	public class Outer{
		private String name; -> 필드

		public static class Inner{
			private String name;
		}
	}
	
	외부 클래스의 필드 또는 메서드를 정적 내부 클래스 안에서는 사용할 수 없다.
	public class Outer{
		private int val1; //필드

		public static class Inner{
			public void add(){
				int result = val1 + 10; -> 에러
			}
		
		}
	}
	
	정적 내부 클래스는 정적 변수 또는 정적 메서드를 호출하는 것은 가능하다.
	public class Outer{
		private int val1; //필드
		private static int cnt = 1; //클래스 변수

		public static class Inner{
			public void displayOuterInfo(){
				System.out.println(val); -> 에러
				System.out.println(cnt); >> 정상 실행
			}
		
		}
	}
	정적 내부 클래스의 객체 생성
	외부 클래스의 객체를 생성하지 않아도 선언할 수 있다.
	Outer.Inner in = new Outer.Inner();
		
 */

package outerInner;

class PrintOut{
	public static class Out{
		public void println(String str) {
			System.out.println(str);
		}
	}
}
public class StaticClass_ex {
	public static void main(String[] args) {
		String str = "정적 내부 클래스 테스트";
		PrintOut.Out out = new PrintOut.Out();
		out.println(str);
	}
}
