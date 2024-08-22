/*
	while문
	반면 while문은 반복 횟수가 정해져 있지 않고, 
	조건식이 true일 경우 계속해서 반복하는 문법이다.
	
	부여된 조건식이 true이면 반복문이 실행되고 false면 종료된다.
	주의하지 않으면 무한루프에 빠질수 있다.
	
	기본 형태
	while(조건식){
    조건식이 참일때 반복할 명령
}

 */

package section03;

import java.util.Scanner;

public class while_ex {

	public static void main(String[] args) {
		/*
		 * /예시 int num = 1; while (num <= 10) { System.out.println(num); num++; } //
		 * while문의 끝 Scanner sc = new Scanner(System.in);
		 * 
		 * int n = 0;
		 * 
		 * while (n != -1) { System.out.println("정수 입력: "); n = sc.nextInt();
		 * System.out.println("입력된 정수: " + n); }
		 */
		/* 각 자리수의 합 구하기
		// 정수형 변수 n이 있을 때 각 자리의 합을 더한 결과 출력하기
		// n의 값이 12345라면 1+2+3+4+5의 결과인 15를 출력해라

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :");
		int num = sc.nextInt();

		int sum = 0;

		while (num > 0) {
			sum += num % 10;
			int mok = num / 10;
			num = mok;
		}
		System.out.println("각 자리수의 합은 : " + sum);
		*/
		// 두개의 주사위를 던졌을 때 눈의 합이 6이되는 나오는 모든 경우의수 출력하기
		int i= 1;
		
		while (i <= 6) {
			int j = 1;
			while (j <= 6) {
				if (i + j == 6) {
					System.out.println(i+"+"+j);	
				}
				j++;
			}
			i++;
		}
	}
}
