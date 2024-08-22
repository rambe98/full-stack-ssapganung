package multi_interface;

public class Won2Dollar extends Converter{
	
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	
	// 오버라이딩
	// 부모의 메서드를 자식클래스의 상황에 맞게 재정의
	// 세서드의 시그니처(접근제한자, 반환형, 메서드명,매개변수)를 그대로 가져와야함
	// 메서드 안의 내용만 자식클래스의 상황에 맞게 재정의 한다.
	@Override
	protected double converter(double src) {
		return src/ratio;
	}
	@Override
	protected String getSrcString() {
		return "원";
	}
	@Override
	protected String getDestString() {
		return "달러";
	}
	
}
