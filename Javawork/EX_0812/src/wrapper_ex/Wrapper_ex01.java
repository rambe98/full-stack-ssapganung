/*	Wrapper클래스
	프로그램에 따라 기본 타입의 데이터를 객체형으로 표현해야 하는 경우가 있다.
	이를 위해서 자바에서는 기본 자료형을 객체로 다루기 위한 클래스를 제공한다.
	이를 Wapper클래스라고 부르는데 기본형의 데이터 타입을 클래스로 포장했기 때문이다.

 */

package wrapper_ex;

public class Wrapper_ex01 {
	public static void main(String[] args) {
		// 정수형 타입 선언
		// 생성자를 통한 선언은 JDK 1.9부터 사용하지 않는 것을 권장
		Integer num01 = new Integer(10);
		Integer num02 = Integer.valueOf(10);
		// 실수형 타입 선언
		Double doubleNum01 = Double.valueOf(30.11);
		// 문자형 타입 선언
		Character ch = Character.valueOf('A');
		System.out.println("정수형1 : " + num01);
		System.out.println("정수형2 : " + num02);
		System.out.println("실수형 : " + doubleNum01);
		System.out.println("문자형 : " + ch);

	}
}
