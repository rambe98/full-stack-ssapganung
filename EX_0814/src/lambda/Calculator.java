package lambda;

@FunctionalInterface
//@FunctionalInterface
//인터페이스에 추상메서드가 무조건 1개 있어야 오류가 안난다.

//MyCalculator 인터페이스를 구현
public interface Calculator {
	int plus(int num1, int num2);
	//int minus(int num1, int num2);	
}
