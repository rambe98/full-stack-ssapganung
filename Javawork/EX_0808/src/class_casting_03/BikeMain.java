/*	클래스의 강제 타입변환
  	CalendarMain 코드에서 객체 c처럼 자식 타입에서 부모 타입으로 타입 변환을 했지만 
  	자식 클래스의 멤버에게 접근하고 싶을 때가 생길 수 있다.
	자바의 규약으로 자식 클래스의 멤버에 접근할 수 없으므로 이러한 경우 
	다시 DeskCalendar타입으로 변경해서 접근할 수 있도록 해야 한다.
	우리는 이를 '클래스의 강제 타입 변환'이라고 부른다.
	자식 객체가 부모 타입으로 자동 타입 변환을 한 후, 
	다시 자식 타입으로 변환하는 것을 말한다.
  
  	일회성으로 타입 변환이 필요할 때는
	((자식클래스명)객체명).메서드명();
	
	자식클래스의 멤버에 접근이 여러번 필요한 경우
	객체명 = (자식클래스명)부모타입;
  	
 */
package class_casting_03;

public class BikeMain {

	public static void main(String[] args) {
		Bike b = new FourWheelBike("윤기");
		b.info();
		b.ride();
		//b.addWheel(); 부모 타입으로는 불가
		System.out.println();
		
		FourWheelBike fwb = (FourWheelBike)b;
		fwb.addWheel();
		fwb.info();
		fwb.ride();
		/* 추가 설명
		자식 타입으로 다시 변환을 해줌으로써 부모 타입에서는 사용하지 못했던 
		자식의 멤버들을 모두 사용할 수 있게 되었다.
		단, 모든 부모 타입 객체를 자식 타입으로 변환할 수 있는 것은 아니다.
		반드시 부모 타입으로 자동 타입 변환되었던 자식 객체를 다시 자식 타입으로 변환할 때만 
		강제 타입 변환을 사용할 수 있다.
		*/
	}

}
