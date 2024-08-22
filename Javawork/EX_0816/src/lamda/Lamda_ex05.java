/*	람다식의 합성과 결합
	Function의 합성과 Predicate의 결합
	Function의 합성
	default <V> Function<T, V> andThen(Function<? super R, ? extends V> after)
	default <V> Function<V, R> compose(Function<? super V, ? extends T> before)
	static <T> Function<T, T> identity()
	 
	두 람다식을 합성해서 새로운 람다식을 만들 수 있다.
	f.andThen(g) - 함수 f를 먼저 적용하고 그 다음에 함수 g를 적용한다.
	f.compose(g) - g를 먼저 적용하고 f를 적용한다.
	Function.identity() - 함수를 적용하기 이전과 동일한 항등함수, x -> x
	
	f.andThen(g)
	Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
	Function<Integer, String> g = (i) -> Integer.toBinaryString(1);
	Function<String, String> h = f.andThen(g);
	System.out.println(h.apply("FF")); "FF" -> 255 -> "11111111"
	
	f.compose(g)
	Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
	Function<String, Integer> f = (s) -> Integer.parseInt(s, 16); 
	Function<Integer, Integer> h = f.compose(g);
	System.out.println(h.apply(2)); // 2 -> "10" -> 16
	
	Function.identity()
	Function<String, String> f = x -> x;
	Function<String, String> f = Function.identity(); // 위 문장과 동일
	System.out.println(f.apply("Hello")); // Hello가 그대로 출력됨

 */
package lamda;

import java.util.function.Function;

public class Lamda_ex05 {
	public static void main(String[] args) {
		//R apply(T t)
		Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);// 16진수 변환
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i);// 2진수로 변환
		Function<String, String> h = f.andThen(g);
		System.out.println(h.apply("ff")); //255 -> 11111111
		
		Function<Integer, String> x = (i) -> Integer.toBinaryString(i);
		Function<String, Integer> y = (s) -> Integer.parseInt(s, 16);
		Function<Integer, Integer> z = f.compose(x);
		System.out.println(z.apply(2)); // 2 -> "10" -> 16
	}
}
