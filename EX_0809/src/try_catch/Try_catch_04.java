package try_catch;

import java.util.Scanner;

public class Try_catch_04 {
	public static void main(String[] args) {
		
		System.out.print("정수 : ");
		Scanner sc = new Scanner(System.in);
		String str = "";
		try {
			str = sc.next();
			int n = Integer.parseInt(str);
			System.out.println("결과 : "+ n);
		} catch (Exception e) {
			System.out.println("결과 : " + str + "은 정수가 아닙니다.");
		}		
	}
}
