/*	생성자
	클래스를 구성하는 구성요소중 하나인 생성자는, 
	객체를 생성할 때 호출되어 객체의 초기화를 담당하는 특별한 메서드이다.
	객체를 생성하고 초기화하기 위해서는 반드시 생성자를 호출해야 한다.
	따라서 객체를 생성해야 하는 참조용 클래스는 모두생성자를 가지고 있다.
	
	생성자의 정의
	생성자는 반환값이 없지만, 반환 타입을 아예 작성하지 않는다.(void로도 적지 않는다.)
	생성자는 초기화를 위한 데이터를 인수로 전달받을 수 있다.
 	
 	예시)
 	접근제한자 클래스명 (매개변수1,매개변수2...){}
 	
 	생성자의 호출 위치
 	일반 메서드들과는 다르게, 생성자를 호출하는곳이 정해져있다.
	생성자는 클래스를 기반으로 객체를 생성할 때
	객체의 초기화를 담당하는 역할을 하므로 객체를 생성할 때만 호출할 수 있다.
 	
 	생성자를 호출할 때는 new 키워드를 함께 사용한다.
 	예시) 클래스명 객체명 = new 클래스명();
 	
 	기본생성자
 	자바의 모든 클래스에는 하나 이상의 생성자가 정의되어야 있어야 한다.
	클래스를 생성하면서 개발자가 직접 생성자를 선언하지 않았지만, 
	자바 컴파일러가 기본생성자를 자동으로 제공해주고 있다.
	다만, 컴파일러의 눈에만 보일 뿐 우리가 보는 코드에는 생략되어 있다.
 	예시) snack.java파일 line 5 참조
 	기본 생성자는 파라미터가 별도로 없으며, 중괄호{}블록 안에 코드가 없는 비어있는 생성자를 말한다.
	기본생성자는 개발자기 직접 선언하지 않았을 때만 컴파일러가 자동으로 추가한다.
	만약 개발자가 직접 생성자를 선언한다면, 컴파일러는 선언된 생성자를 사용한다.
 	
 	생성자 선언 이유
 	생성자는 객체를 생성함과 동시에 객체를 초기화 할 수 있다.
	생성자를 통해 객체를 초기화한다는 것은 
	필드와 메서드를 호출하는 등 객체를 사용하기 위해 객체를 메모리에 올린다는 의미이다.
	
	생성자를 통해 객체를 메모리에 올림과 동시에
	더 나아가 객체 멤버에 접근이 가능하므로 
	일반적인 메서드처럼 객체 멤버의 데이터를 초기화 할 수 있다.
	
	메서드를 호출해서 매개변수에 값을 전달했던 것처럼
	생성자 역시 매개변수를 통해 필드에 값을 전달할 수 있다.
	
	생성자 오버로딩 PhoneMain 참조
 */


package section06_01;

public class SnackMain {
	public static void main(String[] args) {
		Snack chip = new Snack(5000); //객체 생성 및 초기화
		//chip.price = 2000; //객체 필드 설정
		chip.info(); //객체 메서드 호출
		// 객체마다 필요한 정보가 다를 때 생성자를 통해 데이터를 전달하고
		// 객체를 생성하는 것이 더 효율적이다.

		Snack potatoChip = new Snack(2000);
		Snack popcorn = new Snack(1000);
		//일반적인 메서드와 마찬가지로, 매개변수를 2개 이상 전달할 수 있다.
		
		potatoChip.info(); //객체 메서드 호출
	}

}