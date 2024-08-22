/*	NullPointerException
	NullPointerException은 자바 프로그램에서 가장 빈번하게 발생하는 실행 예외이다.
	객체가 제대로 생성되지 않은 상태에서 사용할 경우 발생한다.
	우리가 객체를 선언하면 객체는 주소를 가지게 되고, 그것을 통해 객체에 접근해 값을 가져온다.
	객체는 정의되었는데 실제 메모리에 생성되지 않았을 경우 예외가 발생한다.
 */
package error_ex;

public class NullPointerException {
	public static void main(String[] args) {
		//배열을 변수를 만들기만 하고 선언하지 않음
		String[] strArray = null;
		//String[] strArray = {"ㄱ","ㄴ","ㄷ"};		
		
		//생성되지 않은 배열을 출력하려고 
		System.out.println("strArray[0] = " + strArray[0]);
		
	}

}
