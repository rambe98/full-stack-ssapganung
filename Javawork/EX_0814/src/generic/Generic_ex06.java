package generic;

class FruitBox3<T> {
	//1. 아래와 같이 제네릭 클래스에서 제네릭 타입 파라미터를 사용하는 메서드를
	//제네릭 메서드라고 착각하기 쉬운데, 이것은 그냥 타입 파라미터로 타입을 지정한
	//메서드일 뿐이다.
	public T addBox(T x, T y) {
    	return x;
    }
	// 제네릭 메서드란 메서드의 선언부에 <T>가 선언된 메서드를 말한다.
	// 직접 메서드에 <T>를 설정함으로써 동적으로 타입을 받아와 사용할 수 있는 독립적으로
	// 운영 가능한 제네릭 메서드라고 이해하면 된다.
	public static <T> T addBoxStatic(T x, T y) {
		return x;
	}
}
	
public class Generic_ex06 {
	public static void main(String[] args) {
		FruitBox3.<Integer>addBoxStatic(1,2);
	}
}
