/*
	if - else if
	비교해야할 조건이 여러개 있는 경우 사용하는 문법
	
	if(조건식1){
  		조건식1이 참일 때 실행할 내용.
	} else if(조건식2) {
  		조건식1이 거짓이고 조건식2가 참일 때 실행할 내용.
	} else if(조건식3){
  		조건식1,2가 거짓이고 조건식3이 참일 때 실행할 내용.
	} else {
  		위의 조건이 모두 거짓일 때 실행할 문장
	}
	효율적인 흐름으로 제어하기 위해 if문과 elseif문의 조건식의 순서를 잘 결정해야한다.
	
	if문의 중첩
	if(조건식1){
  		if(조건식2){
      		조건식1,2가 모두 참일 때 실행할 문장 
  }
}
*/

package section03;

import java.util.Scanner;

public class if_ex02 {

	public static void main(String[] args) {
		/*
		int favorite = 7;

		if(favorite > 5) {
			System.out.println("좋아하는 숫자가 5보다 큽니다.");
		}else if(favorite == 7) {
			System.out.println("좋아하는 숫자는 7입니다.");
		}
		*/
		//나이 입력 받고 나이에 맞게 출력하기
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		// 객체명.메서드명(); >> 해당 클래스에 있는 메서드 호출
		
		if (age >= 7 && age <14) {
			System.out.println("너그 어린이구만");
		}else if (age < 20 && age >= 14 ) {
			System.out.println("너그 청소년이구만");
		}else if (age >= 20) {
			System.out.println("너그 성인이구만");
		}else{
			System.out.println("너그 응애구만");
		}
		
		// 점수에 맞는 성적 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("너 점수 몇점이야: ");
		int exam = sc.nextInt();
		// 객체명.메서드명(); >> 해당 클래스에 있는 메서드 호출
		
		if (exam <= 100 && exam >=90) {
			System.out.printf("점수는 %d점이고 성적은 A입니다.", exam);
		}else if (exam < 90 && exam >= 80 ) {
			System.out.printf("점수는 %점이고 성적은 B입니다.", exam);
		}else if (exam < 80 && exam >=70) {
			System.out.printf("점수는 %d점이고 성적은 C입니다.", exam);
		}else if (exam < 70 && exam >=60){
			System.out.printf("점수는 %d점이고 성적은 D입니다.", exam);
		}else if (exam < 60 && exam >=0){
			System.out.printf("점수는 %d점이고 성적은 F입니다.", exam);
		}else {
			System.out.println("점수를 다시 입력해주세요.");
		}
		*/
		// 홀수 짝수 비교하기
		int num = 5;
		//if(num <=10 && num % 2 != 0){
		//  System.out.println(num + "= 홀수입니다."); 
		//}
		if(num <=10){
			  if(num % 2 == 1){
			    System.out.println(num + "은 홀수입니다."); 
			  }
		}
	}

}
