/*	다형성
	다형성은 객체 지향 프로그래밍의 대표적인 특징 중 하나로, 
	하나의 타입으로 다양한 객체를 사용할 수 있다는것을 의미한다.
	자바에서는 앞에서 학습한 타입 변환을 통해, 부모 클래스의 타입 하나로 
	여러 가지 자식 객체들을 참조하여 사용함으로써 다형성을 구현할 수 있다.
	클래스의 타입 변환이 존재하는 이유는 다형성을 구현하기 위함이라고 할 수 있다.
	완벽한 다형성을 구현하기 위해서는 상속 + 메서드 오버라이딩 + 클래스 타입변환 
	이 세가지 개념을 합쳐야 한다.
	객체가 특정 클래스의 필드가 되면서, 하나의 부품처럼 사용될 수 있다.
	이때, 부품을 교체할 일이 생긴다면 우리는 다형성을 구현함으로써 
	코드 수정을 최소화할 수 있다.

 */


package polymophism;

public class ComMain {

	public static void main(String[] args) {
		PCroom cr = new PCroom();
		//cr.com1 = new Samsung();
		//cr.com2 = new Samsung();
		cr.com1 = new Samsung();
		cr.com2 = new LZ();
		cr.com3 = new Mac();
		
		cr.allPowerOn();
		cr.allPowerOff();
		// 자식 타입으로 강체 타입변환
		
		
		((Mac)cr.com3).info();// 임시 형변환
		
		Mac mac = (Mac)cr.com3;
		mac.info();// 자식타입으로 바꿔서 변수에 저장하기
		
		
		System.out.println();
		/* 추가 설명
		객체를 변경하기 위해 여러 가지 코드를 수정하는 것은 상당히 위험도가 높은 작업이다.
		실무에서의 프로그램은 코드의 양이 많아지고, 
		수 많은 객체가 서로 얽혀서 복잡한 로직으로 구현되어 있다.
		그렇기 때문에 수정을 최소화 하는것이 좋다.
		*/
	}

}
