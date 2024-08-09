package multi_interface;

public class ConverterMain {

	public static void main(String[] args) {
	//converter클래스를 상속받아 원화를 달러로 변환하는 Won2Dollar클래스를 작성하라.
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
		toDollar.run();
		
		/*
		[실행결과]
		원을 달러로 바꿉니다.
		원을 입력하세요>> 24000
		변환 결과: 20.0달러입니다
		*/
	}

}
