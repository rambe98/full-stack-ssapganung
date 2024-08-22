package stream;

import java.util.Arrays;

public class Stream_ex05 {
	public static void main(String[] args) {
		String[] list2 = {"김길동","박자바","제이슨","심슨"};
		String[] list_1 = Arrays.stream(list2).sorted().toArray(String[]::new);
		System.out.println(Arrays.toString(list2));
		System.out.println(Arrays.toString(list_1));
	}
}
