/*	다중 인터페이스 구현
	우리는 하나의 클래스로 여러 개의 인터페이스를 구현할 수 있다.
	선언한 모든 인터페이스에 대한 추상 메서드를 모두 구현해 줘야 한다
	
	[접근제한자]class 클래스명 implements 인터페이스1,인터페이스2{
	//필드
	//생성자
	//인터페이스1에 대한 구현 메서드
	//인터페이스2에 대한 구현 메서드
	//}
	
 */
/*	인터페이스 상속
	인터페이스끼리 상속관계를 만들 수 있다.
	클래스의 상속과 만찬가지로 extends키워드를 사용하며, 
	다중 상속이 가능하기 때문에 콤마(,)를 이용해서 다음과 같이 선언한다.
	
	[접근제한자] interface 인터페이스명 extends 인터페이스1, 인터페이스2,...{
	}
	인터페이스 상속을 선언하면, 하위 클래스는 상위 클래스의 모든 멤버를 상속받게 된다.
	따라서 만약 하위 인터페이스를 구현하는 클래스가 있다면, 
	해당 클래스는 하위 인터페이스의 추상메서드를 포함하여 
	상위 인터페이스르의 추상 메서드까지 구현해야 한다.	
 */
package multi_interface;

public class MicMain {
	public static void main(String[] args) {
		System.out.println("---TJmic 객체---");
		TJmic tj = new TJmic();
		tj.connect();
		tj.music();
		tj.sing();
		
		System.out.println("\n---TJmic 객체를 BluetoothMIC로 타입 변환---");
		BluetoothMIC bm = tj;
		bm.connect();
		bm.music();
		bm.sing();
		
		System.out.println("\n---TJmic 객체를 Microphone으로 타입 변환---");
		MicroPhone m = tj;
		//m.connect(); 호출불가능
		//m.music(); 호출불가능
		m.sing();
		
		System.out.println("\n--TJmic 객체를 Speaker로 타입 변환---");
		Speaker s = tj;
		//s.connect(); 호출불가능
		s.music();
		//s.sing(); 호출불가능
	}

}
