package generic;

class Calculator<T extends Number> {
	//인터페이스 타입 한정
	//extends 키워드 다음에 올 타입은 일반 클래스, 추상 클래스, 인터페이스 모두 올 수 있다.
	
	void add(T a, T b) {}
    void min(T a, T b) {}
    void mul(T a, T b) {}
    void div(T a, T b) {}
}

public class Deneric_07 {
	public static void main(String[] args) {
		
		// 제네릭에 아무 타입이나 모두 할당이 가능
        Calculator<Number> cal1 = new Calculator<>();
        //Calculator<Object> cal2 = new Calculator<>();
        //Calculator<String> cal3 = new Calculator<>();
        //Calculator<Main> cal4 = new Calculator<>();
	}
}
