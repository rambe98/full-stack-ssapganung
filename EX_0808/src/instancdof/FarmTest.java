/*	instancdof연산자
	부모 타입으로 타입이 변환되어 저장된 변수는 안에 어떤 객체가 담겨 있는지 
	직접 확인하지 않는 이상 내부 객체를 알기 쉽지 않다.
	오버라이딩된 메서드가 있다면 확인이 쉽겠지만, 부모클래스를 같이 상속받고 있는 
	다른 클래스 또는 부모클래스와 구별할 수 있는 특정 멤버가 없다면 어떻게 구별해야 할까?
	instanceof연산자의 특징
	1. A instanceof B : A 객체가 생성될 때 B 타입으로 생성되었는지 확인하는 연산자
	2. 맞으면 true, 아니면 false를 반환하며 만약 null을 가리키고 있으면 false를 반환한다.
	
	객체 instanceof타입(클래스명)
	- instanceof 기준으로 왼쪽 객체가 생성될 때 오른쪽 타입으로 생성되었는지 확인하는 연산자이다.
	- 맞으면 true, 아니면 false를 반환하며 만약 null을 가리키고 있으면 false를 반환한다.
	
	instanceof 연산자와 '=='연산자의 차이
	A instanceof B : 객체변수 A가 객체의 타입 B로 생성된것인지 확인
	C == D : 객체 변수 C와 객체 변수 D가 같은 객체를 참조하고 있는지 확인한다.
 */


package instancdof;

class Animal{
	public void cry() {}// 오버라이드 하기 위해 만든 메서드
}
class Pig extends Animal{
	@Override
	public void cry() {
		System.out.println("꿀꿀");
	}
}
class Cow extends Animal{
	@Override
	public void cry() {
		System.out.println("음메");
	}
}

class Farm{
	public void sound(Animal animal) {
		/*
		if(animal instanceof Pig) {
			System.out.println("꿀꿀");
		} else if(animal instanceof Cow){
			System.out.println("음메");
		} else {
			System.out.println("동물 객체 필요");
		}
		*/
		animal.cry();// 오버라이드로 간단하게 짜기
	}
}
public class FarmTest {
	public static void main(String[] args) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		f.sound(p);
		f.sound(c);
	}
}
