/*	Generic
	제네릭 사용시 주의사항
	1. 제네릭 타입의 객체는 생성할 수 없다.
	ㄴ제네릭 타입 자체로 타입을 지정하여 객체를 생성하는 것은 불가능하다.
	2. static 멤버에 제네릭 타입이 올 수 없음
	ㄴ static 변수의 데이터 타입으로 제네릭 타입 파라미터가 올 수는 없다.
	ㄴ 왜냐하면 static 멤버는 클래스가 동일하게 공유하는 변수로서 
	  제네릭 객체가 생성되기도 전에 이미 자료 타입이 정해져 있어야 하기 때문이다.
	2-1 static 메서드의 반환타입으로 사용이 불가능하다.
	class Student<T> {
    	private String name;
    	private int age = 0;

    	// static 메서드의 반환 타입으로 사용 불가
    	public static T addAge(int n) {

    	}
	}
	2-2 static 메서드의 매개변수의 타입으로 사용이 불가능하다.
	class Student<T> {
    	private String name;
    	private int age = 0;

    	// static 메서드의 매개변수 타입으로 사용 불가능
    	public static void addAge(T n) {

    	}
	}
	3. 제네릭으로 배열 선언 주의점
	기본적으로 제네릭 클래스 자체를 배열로 만들 수는 없다.
	class Sample<T> { 
	}

	public class Main {
    	public static void main(String[] args) {
        	Sample<Integer>[] arr1 = new Sample<>[10];
    	}
	}
	또한 제네릭 타입 파라미터에 클래스가 타입으로 온다는 것은, 
	클래스끼리 상속을 통해 관계를 맺는 객체 지향 프로그래밍의 
	다형성의 원리가 그대로 적용이 된다는 뜻이다.
	
 */

package generic;

public class GenericMain {

	public static void main(String[] args) {
		GenEx<String> v1 = new GenEx<String>();
		// T자리에 실제 타입을 지정한다.
		// 제네릭의 타입 전파가 행해진다고 보면 된다.
		// <T>부분에서 실행부에서 타입을 받아와 내부에서 T타입으로 지정한 멤버들에게 전파하여
		// 타입이 구체적으로 설정되는 것이다. 이를 구체화(Specialization)라고 한다.

		v1.setValue("100");

		System.out.println(v1.getValue());

		// 타입 매개변수의 생략
		// jdk 1.7버전 이후부터, new 생성자 부분의 제네릭 타입을 생략할 수 있게 되었다.
		GenEx<Integer> v2 = new GenEx<>();
		v2.setValue(1000);
		System.out.println(v2.getValue() + 10);

		GenEx<Character> v3 = new GenEx<Character>();
		v3.setValue('A');
		System.out.println(v3.getValue());

		GenEx<Double> v4 = new GenEx<Double>();
		v4.setValue(3.14);
		System.out.println(v4.getValue());

	}

}
