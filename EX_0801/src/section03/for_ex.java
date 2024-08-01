/*	반복문(for,while)
	특정수행문을 원하는만큼 반복하여 실행하는 제어문
	
	for(초기식; 조건식; 증감식){
	조건식에 해당할때 반복할 명령
	}
	초기식 : 반복을 하기 위한 시작값으로 변수를 하나 초기화 한다.
	조건식 : 반복을 하기 위한 종료값으로 비교연산자를 많이 사용한다.
	증감식 : 변수의 값을 증감시켜주는 역할을 한다 증감연산자를 많이 사용한다.
	
 */

package section03;

import java.util.Scanner;

public class for_ex {

	public static void main(String[] args) {
		/*
		for(int i = 0; i <= 3; i++){
			System.out.println(i);
		}//for문 돌아가는 구조 설명해주기.
		
		for (int i=1; i <11; i++) {
			System.out.print(i + " ");			
		}
		System.out.println("");
		
		for (int i=1; i < 20; i+=2) {
			System.out.print(i + " ");			
		}
		System.out.println("");
		//누적합
		int temp = 0;
		for (int i=1; i < 11; i++) {
			temp += i;		
		}
		System.out.println(temp);
		*/
		/* 정수형 변수 dan에 2 ~ 9사이의 값으로 초기화 하고 
		// 해당 단에 해당하는 구구단 출력하기
		int dan = 2;
		for (int i=1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", dan,i,dan*i);
		}
		*/	
		Scanner sc = new Scanner(System.in);
		/*입력받은 값까지의 총합을 구해라
		System.out.print("수 입력해라 : ");
		temp = sc.nextInt();
		int num=0;
		for (int i=1; i <= temp; i++) {
			num += i;
		}
		System.out.println(num);
		*/
		/* 정수 10개 입력받고 그 중 짝수가 몇개인지 개수 출력
		int temp2 = 0, j = 0;
		for(int i =0; i <10; i++) {
			System.out.print("수 입력해라 : ");
			temp2 =sc.nextInt();
			if(temp2 %2 ==0) {
				j++;
			}
		}
		System.out.println("짝수의 개수: " + j + "개");
		*/
		//키보드로 정수 2개 입력받고 입력밭은  x~y까지의 총합을 출력해라
		//단 x의 값이 y보다 클경우 x와 y의 값을 바꿔서 총합을 구한다.
		
		System.out.print("x를 입력해라 : ");
		int x = sc.nextInt();
		System.out.print("y를 입력해라 : ");
		int y = sc.nextInt();
		if (x>y) {
			int z =x;
			x = y;
			y = z;
		}
		int count = 0;
		for (int i = x; i <= y; i++) {
			count += i;
		}
		System.out.println("총 합은 : "+ count);
		
	}

}
