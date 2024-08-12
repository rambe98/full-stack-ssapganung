/*	사용자 정의 예외처리
	자바가 제공하는 예외 객체 외에도 개발자의 목적에 의해서 예외 객체를 만들 수 있다.
	자바가 제공하는 예외 객체는 다양하지만 모든 예외를 처리하기는 어렵다.
	목적에 따라 공통기능을 지니는 예외 처리도 필요하기 때문에 개발자가 직접 예외를 생성하여 처리해야 한다.
	
	체크 예외 생성하기
	체크 예외를 만들고 싶다면 최상위 객체인 Exception을 상속한다.
	public class CustomException extends Exception{
	}
	비체크 예외 생성하기
	비체크 예외를 만들고 싶을 때는 RuntimeException을 상속한다.
	public class CustomException extends RuntimeException{
	}
	
	
	
 */



package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			try {
				System.out.print("당신의 나이를 입력하세요 >> ");
				int age = sc.nextInt();
				
				if(age < 0) {
					throw new InputErrorException("입력이 잘못되었습니다.");
				}				
				if(age > 19) {
					System.out.println("성인입니다.");
				}else if(age > 13) {
					System.out.println("청소년입니다.");
				}else if(age > 6) {
					System.out.println("어린이입니다.");
				}else {
					System.out.println("아동입니다");
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			};
	}
}
