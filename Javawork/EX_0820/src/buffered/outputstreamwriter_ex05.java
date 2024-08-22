package buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class outputstreamwriter_ex05 {
	public static void main(String[] args) throws IOException {
		
		//system.in
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("문자열 입력 : ");
		String str = bf.readLine();
		System.out.println("입력된 문자열 : "+ str);
		
		// 정수 입력 받기
		System.out.println("정수 입력 : ");
		int n = Integer.parseInt(bf.readLine());
		System.out.println(n+1);
		
		// 공백으로 구분된 정수 입력 받기
		System.out.println("여러개 정수 입력 : ");
		String [] iArr = bf.readLine().split(" ");
		System.out.println(Arrays.toString(iArr));
		
	}
}
