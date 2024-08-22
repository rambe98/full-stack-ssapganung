/*	제네릭 와일드 카드
	제네릭 간의 형변환을 성립되게 하기 위해서는 제네릭에서 제공하는 와일드카드 문법을 이용해야 한다.
	와일드카드 사용법
	<?> : Unbounded Wildcards(제한 없음)
	타입 파라미터를 대치하는 구체적인 타입으로 모든 클래스나 인터페이스 타입이 올 수 있다.
	<? extends 상위타입> : Upper Bounded Wildcards(상위 클래스 제한)
	타입 파라미터를 대치하는 구체적인 타입으로 상위 타입이나 상위 타입의 하위 타입만 올 수 있다.
	<? super 하위타입> : Lower Bounded Wildcards(하위 클래스 제한)
	타입 파라미터를 대치하는 구체적인 타입으로 하위 타입이나 하위 타입의 상위 타입만 올 수 있다.

 */

package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generic_ex11 {
	public static void main(String[] args) {
		// <? extends Object> -> Object부터 하위 클래스가 올 수 있다.
		List<? extends Object> list = new ArrayList<String>();
		// <? super String> -> String부터 하위 클래스가 올 수 있다.
		List<? super String> list2 = new ArrayList<Object>();
		
		
	    List<Integer> lists = new ArrayList<>(Arrays.asList(1, 2, 3));
	    print(lists); // OK
	}

	// Number와 그 하위 타입(Integer, Double 등) 만을 받는다
	public static void print(List<? extends Number> list) {
	    for (Object e : list) {
	        System.out.println(e);
	    }
	}
}
