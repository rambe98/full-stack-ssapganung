package try_catch;

import java.util.Scanner;

public class Try_catch_03 {
	public static void main(String[] args) {
		
		System.out.print("정수 : ");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			System.out.println("입력받은 수: "+num);
		} catch (Exception e) {
			System.out.println("정수만 입력 가능");
		}		
	}
}
