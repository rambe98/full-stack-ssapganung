package polymophism;

public class Mac extends Computer{
	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("아이 러브 맥");
	}
	public void info() {
		System.out.println("나는 Apple!");
	}
}
