package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_ex01 {
	public static void main(String[] args) {
		String[] strArray = {"홍길동","신용권","김미나"};// 원본 배열
		Stream<String> strStream = Arrays.stream(strArray);// 배열이 복사되서 드감
		strStream.forEach(item -> System.out.print(item+","));
		System.out.println();
		
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(item -> System.out.print(item+","));
		System.out.println();
	}
}
