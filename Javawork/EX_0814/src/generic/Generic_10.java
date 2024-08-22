/*	제네릭 형변환
	제네릭 캐스팅 문제
	배열과 같은 일반적인 변수 타입과 달리 제네릭 서브 타입간에는 형변환이 불가능하다.
	심지어 대입된 타입이 Object일지라도 말이다.
	자연스럽게 다형성이 적용될 것이라고 생각할 수 있지만 
	실상 제네릭은 전달받은 타입으로만 캐스팅이 가능하다.
	
	제네릭 타입은 상하관계가 없다.
	제네릭의 타입 변수(꺾쇠 괄호)끼리는 아무라 상속 관계에 놓인다 한들 캐스팅이 불가능하다.
	제네릭은 전달받은 타입만으로만 서로 캐스팅이 가능하다.

 */
package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Generic_10 {
	public static void main(String[] args) {
	    List<Integer> lists = new ArrayList<>(Arrays.asList(1, 2, 3));
	    //print(lists);  ! 컴파일 에러 발생
	}
/*
	public static void (List<Object> list) {
	    for (Object e : list) {
	        System.out.println(e);
	    }
	}
	*/
}
