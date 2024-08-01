/*
	switch문
	switch문에 조건으로 사용될 수 있는 연산자는 '==' 밖에 없다.
	즉, 두 개의 피연산자 값이 같을때만 조건으로 활용할 수 있다.
	switch(비교값){
	case 조건값1 :
    	비교값과 조건값이 일치할 때 실행할 문장.
    	break;
	case 조건값2 :
    	비교값과 조건값이 일치할 때 실행할 문장.
    	break;
	case 조건값3 :
    	비교값과 조건값이 일치할 때 실행할 문장.
    	break;
	default ://비교값과 일치하는 조건값이 없을 때 실행된다. 
			코드;
	}
	비교값과 조건값의 타입은 반드시 일치해야 한다.
    중복되는 조건값을 가질 수 없다.
    
    if VS switch
    if문은 범위에 따라서 조건을 비교하는데 효과적이고
    switch문은 하나의 값에 따라서 조건을 비교하는데 효과적임
    
    switch문의 비교값으로 사용이 가능한 자료형
    정수(byte,short,int), 문자형(char), 문자열(String)
    
    java12버전 이상의 switch문
    조건절에 복수개의 값을 사용하는것이 가능
    화살표 표현식을 이용하는게 가능하다.
    기존 switch문과 달리 case에 해당하는 절만 실행되고
    그 이후 case들은 실행되지 않는다.
 */

package section03;

import java.util.Scanner;

public class switch_ex {
		
	public static void main(String[] args) {
		/* switch 예제 1
		int num = 7;
		switch(num) {
		case 1:
			System.out.println("num은 1입니다.");
			break;
		case 7:
			System.out.println("num은 7입니다.");
			break;
		default:
			System.out.println("num은 1도 7도 아닙니다.");
			break;
		}
		*/
		/*예제 2
		String str = "홍", result;
		
		switch (str) {
		case "박": 
			result = "박길동";
			break;
		case "이":	
			result = "이길동";	
			break;
				
		case "독고":	
			result = "독고길동";	
			break;
				
		case "홍":	
			result = "홍길동";	
			break;
		
		default:
			result = "일치하는 성 음서";
		}
		System.out.println(result);
		*/
		/* 예제 3
		char ch = 'b';
		switch (ch) {
		case 'a': 
			System.out.println('a');
			break;
		case 'b':	
			System.out.println('b');	
			break;
		default:
			System.out.println("다시 입력하셈");
		}
		String day = "MONDAY";
		switch(day) {
		case "MONDAY":
		case "TUESDAY":
		case "WENDSDAY":
		case "THURSDAY":
		case "FRIDAY":
			System.out.println("평일");
			break;
		case "SATURDAY":
		case "SUNDAY":
			System.out.println("주말");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		
		// java12 이상에서의 switch문
		switch(day) {
		case "MONDAY", "TUESDAY", "WENDSDAY", "THURSDAY", "FRIDAY" -> System.out.println("평일");
		case "SATURDAY","SUNDAY" ->System.out.println("주말");
		default -> System.out.println("잘못된 입력입니다.");
		}
		*/
		/* 10이하의 숫자를 키보드에서 입력 받는다
		//해당 숫자가 짝수인지 홀수인지 판별하여 출력하는 코드를 switch문으로 작성해보기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오.: ");
		int num = sc.nextInt(),less;
		less = num%2;		
		
		switch(less) {
		case 1 -> System.out.println("홀수입니다.");
		case 0 -> System.out.println("짝수입니다.");
		}
		*/
		/*키보드로 달을 입력받아 해당 달이 며칠까지 있는지 스위치 문으로 작성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("달을 입력하시오.: ");
		int num = sc.nextInt(),day;
				
		switch(num) {
		case 1,3,5,7,8,10,12 :
			day = 31;
			System.out.printf("%d월은 %d일까지 있습니다.",num,day);
		break;
		case 4,6,9,11 : 
			day = 30;
			System.out.printf("%d월은 %d일까지 있습니다.",num,day);
		break;
		case 2:
			day = 29;
			System.out.printf("%d월은 %d일까지 있습니다.",num,day);
		break;
		default:
			System.out.println("다시 입력해라");
		}		
		*/
		//계산기 프로그램 만들기
		//두개의 정수를 받는다.
		//산술연산자도 입력받아서 문자열에 담는다.
		//스위치문을 이용하여 정수의 연산을 수행하는 코드 작성하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 1을 입력하시오: ");
		int num1= sc.nextInt();
		sc.skip("\r\n");
		System.out.println("연산자를 입력하시오: ");
		String math = sc.nextLine();
		System.out.println("숫자 2를 입력하시오: ");
		int num2= sc.nextInt();
		
		switch(math) {
		case "+" :
			System.out.printf("%d + %d = %d\n", num1,num2,(num1+num2));
			break;
		case "-" :
			System.out.printf("%d - %d = %d\n", num1,num2,(num1-num2));
			break;
		case "*" :
			System.out.printf("%d * %d = %d\n", num1,num2,(num1*num2));
			break;
		case "/" :
			System.out.printf("%d / %d = %f\n", num1,num2,(num1/(double)num2));
			break;
		default :
			System.out.println("정수를 입력하세요");
		}
	}
}
