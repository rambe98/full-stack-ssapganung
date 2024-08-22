package polymophism;

public class PCroom {
	//Samsung com1;
	//Samsung com2; 
	
	//LZ com1;
	//LZ com2;
	//매번 다른 브랜드의 컴퓨터로 바꾸기 위해 코드를 수정하면 피곤해지기도 하고
	//실수를 할 위험성도 커진다.
	//클래스의 타입변환을 사용하면 보다 간결하게 해결할 수 있다.
	Computer com1, com2, com3;
	
	public void allPowerOn() {
		com1.powerOn();
		com2.powerOn();
		com3.powerOn();
	}
	
	public void allPowerOff() {
		com1.powerOff();
		com2.powerOff();
		com3.powerOff();
	}
}
