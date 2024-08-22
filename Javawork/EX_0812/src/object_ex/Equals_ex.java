/*	equals()메서드
 	기본 자료형의 데이터들의 동등 비교를 위해서 '==' 비교 연산자를 사용한다.
	하지만 객체를 동등비교 할 경우, 해당 객체의 값을 비교하는 것이 아니라, 
	객체가 메모리에 있는 위치를 비교하게 된다.
	객체의 데이터를 비교할 때는 equals()메서드를 override하여 사용한다.

 */

package object_ex;

public class Equals_ex {
	public static void main(String[] args) {
		String str1 = "hello";// 암시적 객체 생성
		String str2 = "hello";
		String str3 = new String("hello");// 명시적 객체 생성
		
		//문자열 변수 비교
		System.out.println("str1 vs str2 : " + (str1 == str2));
		
		//str1 = "Bye";
		System.out.println("str2 : "+ str2);
		// 불변의 법칙
		// 값이 새로 대입되거나 추가로 들어오게 되면
		// 기존의 메모리를 버리고 새로 할당받는다.
		
		System.out.println("str2 vs str3 : " + (str2 == str3));
		
		//각 문자열 변수가 있는 위치의 값을 출력
		//System.identityHashCode() : 객체의 고유한 hashcode를 리턴하는 메서드
		//hashcode()는 다른 객체이지만 주소가 동일한 경우가 있을 수 있다.
		System.out.println("str1 hashCode : " + System.identityHashCode(str1));
		System.out.println("str2 hashCode : " + System.identityHashCode(str2));
		System.out.println("str3 hashCode : " + System.identityHashCode(str3));
		
		// 문자열 데이터 비교
		System.out.println("str1 vs str2 : " + str1.equals(str2));
		System.out.println("str1 vs str3 : " + str1.equals(str3));
		
	}
}
