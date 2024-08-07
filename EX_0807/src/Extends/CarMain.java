/* 자바 상속의 특징
	내가 원하는 만큼 가능
	다중 상속 불가
	한개의 부모 클래스는 여러개의 자식 클래스 가능
	모든 클래스는 Object클래스를 상속받음

 */


package Extends;

class Car {
	public void ride() {
		System.out.println("달립니다.");
	}
}
class Bus extends Car{
	
	int peopleNum;

	public Bus(int peopleNum) {
		this.peopleNum = peopleNum;
	}
	
	public void takePerson() {
		System.out.println("승객이 버스에 탔습니다.");
		peopleNum++;
	}
}
class SchoolBus extends Bus {

	public SchoolBus(int peopleNum) {
		super(peopleNum);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void takePerson() {
		super.takePerson();
		System.out.println("학생들이 자리에 모두 착석하고 출발합니다.");
	}
	
	@Override
	public void ride() {
		System.out.println("시속 50km/h로 천천히 달립니다.");
	}
}

public class CarMain {

	public static void main(String[] args) {
		SchoolBus sb = new SchoolBus(10);
		sb.takePerson();
		sb.ride();
	}
}
