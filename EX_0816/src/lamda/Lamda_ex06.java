/*	Predicate의 결합
	Predicate를 and(), or(), negate()로 연결해서 하나의 새로운 Predicate로 결합할 수 있다.
	Predicate의 끝에 negate()를 붙이면 조건식 전체가 부정이 된다.
	static 메서드인 isEqual()은 두 대상을 비교하는 Predicate를 만들때 사용한다.
	
 */

package lamda;

import java.util.function.Predicate;

public class Lamda_ex06 {
	public static void main(String[] args) {
		Predicate<Integer> a = i -> i < 100;
		Predicate<Integer> b = i -> i < 200;
		Predicate<Integer> c = i -> i % 2 == 0;
		Predicate<Integer> notA = a.negate(); // i >= 100
		
		System.out.println("a : "+a.test(101));//false
		System.out.println("not a : "+ notA.test(101));//true
		
		Predicate<Integer> all = notA.and(b.or(c));
		System.out.println(all.test(150)); // true
		
		String str1 = "abc";
		String str2 = "abc";
		
		// str1과 str2가 같은지 비교한 결과를 반환
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);
		System.out.println(result);
	}
}
