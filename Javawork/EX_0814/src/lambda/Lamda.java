package lambda;

public class Lamda {
	public static void main(String[] args) {
		//클래스를 직접 생성하고 구현하여 기능 만들기
		Calculator cal1 = new CalculatorImpl();
		int res = cal1.plus(10, 20);
		System.out.println("cal1 : " + res);
		
		//익명클래스를 통한 구현
		Calculator cal2 = new Calculator() {
			@Override
			public int plus(int num1, int num2) {
				return num1 + num2;
			}
		};
		res = cal2.plus(10, 20);
		System.out.println("cal2 : " + res);
		
		//람다식을 통한 구현
		Calculator cal3 = (num1,num2)->num1 +num2;	
		res = cal3.plus(10, 20);
		System.out.println("cal3 : " + res);
		
		// 파라미턱가 1개인 메서드 람다식으로 만들기
		//MyFunction mf = (int num) -> {System.out.println(num);};
		//MyFunction mf = num -> System.out.println(num);
		MyFunction mf = System.out::println;
		mf.method(10);
		//::(이중콜론) : 메서드 참조 연산자
		// 람다식을 보다 간결하게 사용할 수 있도록 함
		
	}
}
