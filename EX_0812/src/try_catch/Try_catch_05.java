/*	강제 예외 처리 방법
	프로그램을 작성하다 보면 코드의 오류로 발생하는 예외도 있지만, 
	프로그램의 규칙에 위배되어 예외를 발생해야 하는 경우도 있다
	만약, 프로그램의 규칙에 위배되어 예외를 발생해야 할 경우, 
	강제로 예외를 발생시킬 수 있다.

 */



package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = 0;
		
		while(true) {
			try {
				System.out.print("숫자를 입력하세요(0~50) : ");
				val = sc.nextInt();
				
				if(val == -1) {
					System.out.println("프로그램 종료");
					break;
				}
				
				if(val < -1 || val > 50) {
					throw new Exception("숫자의 허용범위가 아닙니다.");
					
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("에러 메세지 : " +e.getMessage());
			}
			
			
			
		}
	}
}
