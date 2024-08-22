package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_ex04 {
	public static void main(String[] args) {
		Integer[] nums = { 1, 44, 33, 21, 36, 68, 88, 4, 5, 6, 1, 1, 1, 2, 2, 2 };

		// 1. 스트림 객체 생성
		Stream<Integer> stream = Arrays.stream(nums);

		// 2. 스트림에 중간연산
		stream.distinct().sorted().limit(5).forEach(System.out::print);
		
		System.out.println();
		
		
		// skip()
		// rangeClosed() : 정수 범위를 생성
		IntStream intStream = IntStream.rangeClosed(1, 10);
		intStream.skip(3).limit(5).forEach(x -> System.out.print(x + " "));

		System.out.println();

		// filter()
		IntStream inStream2 = IntStream.of(1, 2, 2, 3, 3, 4, 5, 5, 6, 7, 8, 9, 10);
		inStream2.distinct().filter(x -> x %2 == 0).forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		// 문자열의 길이가 3이상인 문자열만 출력

		Stream.of("ab", "a", "abc", "abcd", "abcdef", "abcdefg").filter(x -> x.length() > 2)
				.forEach(x -> System.out.print(x + " "));
	}
}
