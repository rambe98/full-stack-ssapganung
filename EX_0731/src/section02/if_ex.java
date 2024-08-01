/*
  제어문
  일반적으로 프로그램에 포함된 실행문은 순차적으로 실행이 된다.
  하지만 순차적으로만 실행한다면 프로그램이 매우 길어지거나 
  표현하기 어려운 상황이 발생할 수 있다.
  예를 들어, 어떤 변수에 10을 더하는 명령을 1,000번 수행해야 하는 경우, 
  순차적으로만 실행하면 실행문을 1,000번 적어야 한다.
  또한 선택의 개념을 구현하기가 힘듭니다.
  1. 조건문(if, switch)
  조건이 적으면 if 많으면 switch가 효율적임
   1) if
  조건식에는 논리형으로 결과를 확인할 수 있는 모든 식을 넣을 수 있다.
  조건식의 값이 true라면 {}안에 있는 코드를 실행한다.
	기본형
	if(조건식){조건식이 참일 때 실행할 문장.;}
	만약 실행해야 하는 명령이 하나라면 중괄호를 생략할 수 있다.
 	if(조건식)조건식이 참일 때 실행할 문장;
  	
  	XXX: 다음 내용은 EX_0801 - section3 - cindition_ex02에서 확인
  	  	
  중괄호({})블록은 여러 개의 수행문을 하나로 묶기위해 작성함.
  수행문이 하나일 때는 생략 가능하지만 중괄호를 사용하는 습관을 들이는 것이 중요
  
  2. 반복문
*/


package section02;

import java.util.Scanner;

public class if_ex {

	public static void main(String[] args) {
		/*
		int result = 0;
		if(3 > 2) {
			result = 3;
		}
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 입력하셈: ");
		int age = sc.nextInt();
		if(age > 19) {
			System.out.println("성인입니다.");
		}
		else {
			System.out.println("잼민이는 가라");
		}
		System.out.println(" - 프로그램 종료 - ");
		
		// 두 숫자 비교하기
		int a = 4;
		int b = 10;
		int max = 0;
		if(a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.printf("%d 와 %d 중에 큰 수는 %d 입니다\n.",a,b,max);
		System.out.println("-------------------------");
		// int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		int x= 11;
		if (10 < x && x < 20) {
			System.out.println(true);
		}
		System.out.println("-------------------------");
		// char변수 ch가 'x' 또는 'X'일 때 true인 조건식
		char ch = 'a';
		if(ch == 'x' || ch == 'X') {
			System.out.println(true);
		}
		// char형 변수 ch2가 알파벳 (대문자 또는 소문자)일 때 true입니다.
		System.out.println("-------------------------");
		char ch2 = 'a';
		if((ch2 >= 'a' && ch2 <= 'z') || (ch2 >= 'A' && ch2 <= 'Z')) {
		}
		*/
		// x개의 농구공을 담기위한 박스의 개수 구하기 숙제
		Scanner sc = new Scanner(System.in);
		
		System.out.print("공의 개수는?");
		int y= sc.nextInt();
		int x = 5,less= y%x,result= y/x;
		if (less > 0) {
			result++;
		}
		System.out.println("필요한 박스의 계수는 " + result);
	}
}
//숙제 끝
