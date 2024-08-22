package interface_ex;

public interface Phone {
	
	public static final int MAX_BATTERY_CAPACITY = 100;
	// 상수만 들어갈 수 있다.
	// 값을 한번 넣어놓으면 대입이 불가하다.
	// 상수명은 대문자로 작성한다.
	
	//추상메서드 abstract가 없어도 추상 메서드로 들어간다.
	abstract void powerOn();
	abstract void powerOff();
	abstract boolean isOn();
	abstract void watchUtube();
	abstract void charge();
	//추상 클래스는 추상 메서드가 비어있기 때문에 객체 생성을 스스로 할 수 없다.
	//대신 자식 클래스의 생성자의 힘을 빌려 객체 생성을 할 수 있었다.
	//인터페이스도 마찬가지로 추상 메서드가 비어있기 때문에 객체 생성을 스스로 할 수 없다.
	//따라서 인터페이스도 자신이 가지고 있는 추상 메서드를 구현해줄 클래스를 작성해야만 한다.
	//인터페이스를 구현해주는 클래스를 '구현 클래스'라고 한다.
	
}
