/*	instanceof 연산자와 '=='연산자의 차이
	A instanceof B : 객체변수 A가 객체의 타입 B로 생성된것인지 확인
	C == D : 객체 변수 C와 객체 변수 D가 같은 객체를 참조하고 있는지 확인한다.
 */

package instancdof;

//class Animal{};
//class Pig extends Animal{};

public class Instanceof {
	public static void main(String[] args) {
		Pig p1 = new Pig();
		Pig p2 = new Pig();
		
		Animal a = p1;
		
		if( a instanceof  Pig) {
			System.out.println("객체 변수 a는 Pig타입으로 생성된 객체이다.");
		}
		
		if(a == p1) {
			System.out.println("a와 p1은 같은 객체를 참조하고 있다.");
		}
		
		if(a != p2) {
			System.out.println("a와 p2는 같은 객체를 참조하고 있지 않다.");
		}

	}

}
