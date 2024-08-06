package section06_02;

public class Customer extends Person {
	// 만약, 부모 클래스의 생성자가 호출될 때 
	//매개변수로 값을 전달받아 부모 클래스의 필드들을 초기화 하도록 구현되어 있다면.
	// 자식 클래스에서 생략할 수 없다.
	int memberId;
	
	public Customer(String name,int age, int memberId) {
		super(name,age);// 부모생성자의 호출
		this.memberId = memberId;
	}
	
	void enter() {
		System.out.printf("회원번호 : %d (%s, %d세)님 입장하셨습니다.\n",memberId,name,age);
	}
}
