/*	내부 클래스의 접근 제한
 	내부 클래스도 클래스이기 때문에 접근 제한자를 붙여서 사용할 수 있다.
	
 */
package outerInner;

public class Permit_ex {
	private class InClass{
		public void print() {
			System.out.println("접근을 private로 제한한다.");
		}
	}
		public InClass getInClass() {
			InClass in = new InClass();
			return in;
			//return new InClass(); 1줄로 줄이기
		}
		
		public static void main(String[] args) {
			Permit_ex permit = new Permit_ex();
			permit.getInClass().print();
		}
}

