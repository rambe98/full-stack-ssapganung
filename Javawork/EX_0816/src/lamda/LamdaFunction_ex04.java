/*	java.util.function패키지
	대부분의 메서드는 타입이 비슷하다
	매개변수가 없거나 한 개, 두 개, 반환값이 없거나 한 개이다.
	제네릭 메서드로 정의하면 매개변수나 반환 타입이 달라도 문제가 되지 않는다.
	java.util.function 패키지에 일반적으로 
	자주 쓰는 형식의 메서드를 함수형 인터페이스로 미리 정의해 놓았다.
	매번 함수형 인터페이스를 정의하기 보다는 가능하면 이 패키지의 인터페이스를 활용하는 것이 좋다.
	java.util.function 패키지의 주효 함수형 인터페이스
	함수형 인터페이스			메서드				설명
	java.lang.Runnable	void run()		매개변수도 없고 반환값도 없음
	Supplier			T get()				매개변수는 없고 반환값만 있음
	Consumer			void accept(T t)	Supplier와 반대로 매개변수만 있고, 반환값이 없음
	Function<T,R>		R apply(T t)		일반적인 함수. 하나의 매개변수를 받아서 결과를 반환
	Predicate			boolean test(T t)	조건식을 표현하는데 사용됨. 매개변수는 하나. 반환값은 boolean
	
	참고) 타입문자 'T'는 'Type'을 'R'은 'Return Type'을 의미한다.
	
	매개변수가 두 개인 함수형 인터페이스는 이름 앞에 접두사 'Bi'가 붙는다.
	함수형 				인터페이스	메서드			설명
	BiConsumer<T,U>		void accept(T t, U u)	두개의 매개변수만 있고 반환값이 없음
	BiPredicate<T,U>	boolean test(T t, U u)	조건식을 표현하는데 사용됨. 매개변수는 둘, 반환값은 boolean
	BiFunction<T,U,R>	R apply(T t, U u)		두 개의 매개변수를 받아서 하나의 결과를 반환
	
	참고) Supplier는 매개변수는 없고 반환값만 존재하는데, 
	매서드는 두 개의 값을 반환할 수 없으므로 BiSupplier가 없다.
	두 개 이상의 매개변수를 갖는 함수형 인터페이스가 필요하면 직접 만들어 써야 한다.
	
 */

package lamda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaFunction_ex04 {
	public static void main(String[] args) {
		Consumer<String> c1 = t -> System.out.println("입력값 : " +t);
		c1.accept("홍길동");
		
		BiConsumer<String, Integer> c2 = (x,y) -> System.out.println("입력값 1 : " + x+", 입력값 2 : " + y);
		c2.accept("제임스", 100);
		
		Supplier<Object> s1 = () -> new Object();
		System.out.println("주소 : " + s1.get());
		
		
		// Inter.paraseInt("정수형태의 문자열") -> 문자열에서 정수로 변환
		// String.valueOf(정수) -> 정수에서 문자열로 변환 
		Function<Integer, String> f1 = x -> String.valueOf(x);
		String str = f1.apply(100);
		System.out.println("문자열 str : " + str);
		
		BiFunction<String, String, Boolean> f2 = (x,y) -> x.equals(y);
		if(f2.apply("토마토", "토마토")) {
			System.out.println("두 문자열의 값은 같습니다.");
		}
		Predicate<Integer> p1 = t -> t>=60;
		int score = 65;
		boolean pass = p1.test(score);
		if(pass) {
			System.out.println("홍길동님의 점수는" +score+"이고 합격입니다.");
		}else {
			System.out.println("홍길동님의 점수는" +score+"이고 불합격입니다.");
		}
		
	}
}
